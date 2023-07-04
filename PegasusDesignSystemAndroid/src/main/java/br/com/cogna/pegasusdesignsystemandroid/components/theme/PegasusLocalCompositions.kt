package br.com.cogna.pegasusdesignsystemandroid.components.theme

import androidx.compose.runtime.staticCompositionLocalOf
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.border_stroke.sofiaBorderStrokes
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.font.sofiaFontWeight
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.shadow.sofiaShadow
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.shapes.sofiaBorderRadius
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.sofiaPaletteLight
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.spacing.sofiaSpacing
import br.com.cogna.pegasusdesignsystemandroid.components.colors.PegasusColorsScheme
import br.com.cogna.pegasusdesignsystemandroid.components.spacing.PegasusSpacing

var LocalPegasusThemeComposition = staticCompositionLocalOf<PegasusColorsScheme> {
    sofiaPaletteLight
}

var LocalPegasusSpacingComposition = staticCompositionLocalOf<PegasusSpacing> {
    sofiaSpacing
}

var LocalPegasusBorderRadiusComposition = staticCompositionLocalOf {
    sofiaBorderRadius
}

var LocalPegasusBorderStrokeComposition = staticCompositionLocalOf {
    sofiaBorderStrokes
}

var LocalPegasusFontWeightComposition = staticCompositionLocalOf {
    sofiaFontWeight
}

var LocalPegasusShadowComposition = staticCompositionLocalOf {
    sofiaShadow
}