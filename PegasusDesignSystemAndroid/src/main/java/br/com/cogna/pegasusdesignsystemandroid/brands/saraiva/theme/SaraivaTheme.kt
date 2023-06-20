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
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.LocalPegasusSpacingComposition
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.LocalPegasusThemeComposition
import br.com.cogna.pegasusdesignsystemandroid.components.theme.StatusBarColor


val saraivaPaletteLight = saraivaLightSchemeColors
val saraivaPaletteDark = saraivaDarkSchemeColors



@Composable
fun SaraivaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {

    LocalPegasusThemeComposition = staticCompositionLocalOf { saraivaPaletteLight }
    LocalPegasusSpacingComposition = staticCompositionLocalOf { saraivaSpacing }

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
            LocalPegasusSpacingComposition provides saraivaSpacing
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
