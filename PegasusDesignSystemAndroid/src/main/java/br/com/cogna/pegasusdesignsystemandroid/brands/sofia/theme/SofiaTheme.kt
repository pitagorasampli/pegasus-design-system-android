package br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme

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
import br.com.cogna.pegasusdesignsystemandroid.components.colors.PegasusColorsScheme
import br.com.cogna.pegasusdesignsystemandroid.components.spacing.PegasusSpacing
import br.com.cogna.pegasusdesignsystemandroid.components.theme.StatusBarColor


val sofiaPaletteLight = sofiaLightSchemeColors
val sofiaPaletteDark = sofiaDarkSchemeColors

var LocalPegasusThemeComposition = staticCompositionLocalOf<PegasusColorsScheme> {
    sofiaPaletteLight
}

var LocalPegasusSpacingComposition = staticCompositionLocalOf<PegasusSpacing> {
    sofiaSpacing
}

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
        val sofiaSpacing1 = sofiaSpacing

        CompositionLocalProvider(
            LocalPegasusThemeComposition provides colorsScheme,
            LocalPegasusSpacingComposition provides sofiaSpacing1
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

