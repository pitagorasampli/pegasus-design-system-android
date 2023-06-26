package br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.theme.border_stroke.saraivaBorderStrokes
import br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.theme.color.saraivaDarkSchemeColors
import br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.theme.color.saraivaLightSchemeColors
import br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.theme.font.saraivaFontWeight
import br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.theme.shapes.saraivaBorderRadius
import br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.theme.shapes.saraivaShapes
import br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.theme.spacing.saraivaSpacing
import br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.theme.typography.saraivaTypography
import br.com.cogna.pegasusdesignsystemandroid.components.theme.LocalPegasusBorderRadiusComposition
import br.com.cogna.pegasusdesignsystemandroid.components.theme.LocalPegasusBorderStrokeComposition
import br.com.cogna.pegasusdesignsystemandroid.components.theme.LocalPegasusFontWeightComposition
import br.com.cogna.pegasusdesignsystemandroid.components.theme.LocalPegasusSpacingComposition
import br.com.cogna.pegasusdesignsystemandroid.components.theme.LocalPegasusThemeComposition
import br.com.cogna.pegasusdesignsystemandroid.components.theme.StatusBarColor


val saraivaPaletteLight = saraivaLightSchemeColors
val saraivaPaletteDark = saraivaDarkSchemeColors



@Composable
fun SaraivaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {

    //To Enable Previews
    LocalPegasusThemeComposition = staticCompositionLocalOf { saraivaPaletteLight }
    LocalPegasusSpacingComposition = staticCompositionLocalOf { saraivaSpacing }
    LocalPegasusBorderRadiusComposition = staticCompositionLocalOf { saraivaBorderRadius}
    LocalPegasusBorderStrokeComposition = staticCompositionLocalOf { saraivaBorderStrokes}
    LocalPegasusFontWeightComposition = staticCompositionLocalOf { saraivaFontWeight}

    if (dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
        val context = LocalContext.current
        val colorScheme =
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)

        CompositionLocalProvider(
            LocalPegasusSpacingComposition provides saraivaSpacing
        ) {
            StatusBarColor(colorInArgb = colorScheme.primary.toArgb(), darkTheme = darkTheme)

            MaterialTheme(
                colorScheme = colorScheme,
                typography = saraivaTypography,
                shapes = saraivaShapes,
                content = content
            )
        }

    } else {
        val colorsScheme = if (darkTheme) {
            saraivaPaletteDark
        } else {
            saraivaPaletteLight
        }

        CompositionLocalProvider(
            LocalPegasusThemeComposition provides colorsScheme,
            LocalPegasusSpacingComposition provides saraivaSpacing,
            LocalPegasusBorderRadiusComposition provides saraivaBorderRadius,
            LocalPegasusBorderStrokeComposition provides saraivaBorderStrokes,
            LocalPegasusFontWeightComposition provides saraivaFontWeight
        ) {
            StatusBarColor(colorsScheme.primary.toArgb(), darkTheme)

            MaterialTheme(
                typography = saraivaTypography,
                shapes = saraivaShapes,
                content = content
            )
        }

    }
}
