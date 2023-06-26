package br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.border_stroke.sofiaBorderStrokes
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.color.sofiaDarkSchemeColors
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.color.sofiaLightSchemeColors
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.font.sofiaFontWeight
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.shapes.sofiaBorderRadius
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.shapes.sofiaShapes
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.spacing.sofiaSpacing
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.typography.sofiaTypography
import br.com.cogna.pegasusdesignsystemandroid.components.theme.LocalPegasusBorderRadiusComposition
import br.com.cogna.pegasusdesignsystemandroid.components.theme.LocalPegasusBorderStrokeComposition
import br.com.cogna.pegasusdesignsystemandroid.components.theme.LocalPegasusFontWeightComposition
import br.com.cogna.pegasusdesignsystemandroid.components.theme.LocalPegasusSpacingComposition
import br.com.cogna.pegasusdesignsystemandroid.components.theme.LocalPegasusThemeComposition
import br.com.cogna.pegasusdesignsystemandroid.components.theme.StatusBarColor


val sofiaPaletteLight = sofiaLightSchemeColors
val sofiaPaletteDark = sofiaDarkSchemeColors


@Composable
fun SofiaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {

    if (dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
        val context = LocalContext.current
        val colorScheme =
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)

        StatusBarColor(colorInArgb = colorScheme.primary.toArgb(), darkTheme = darkTheme)

        MaterialTheme(
            colorScheme = colorScheme,
            typography = sofiaTypography,
            shapes = sofiaShapes,
            content = content
        )

    } else {
        val colorsScheme = if (darkTheme) {
            sofiaPaletteDark
        } else {
            sofiaPaletteLight
        }


        CompositionLocalProvider(
            LocalPegasusThemeComposition provides colorsScheme,
            LocalPegasusSpacingComposition provides sofiaSpacing,
            LocalPegasusBorderRadiusComposition provides sofiaBorderRadius,
            LocalPegasusBorderStrokeComposition provides sofiaBorderStrokes,
            LocalPegasusFontWeightComposition provides sofiaFontWeight
        ) {
            StatusBarColor(colorsScheme.primary.toArgb(), darkTheme)

            MaterialTheme(
                typography = sofiaTypography,
                shapes = sofiaShapes,
                content = content
            )
        }
    }
}

