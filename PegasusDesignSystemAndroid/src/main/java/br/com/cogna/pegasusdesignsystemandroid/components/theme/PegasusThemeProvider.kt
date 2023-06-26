package br.com.cogna.pegasusdesignsystemandroid.components.theme

import androidx.compose.runtime.Composable
import br.com.cogna.pegasusdesignsystemandroid.components.border_strokes.PegasusBorderStrokes
import br.com.cogna.pegasusdesignsystemandroid.components.colors.PegasusColorsScheme
import br.com.cogna.pegasusdesignsystemandroid.components.font.PegasusFontWeight
import br.com.cogna.pegasusdesignsystemandroid.components.shapes.PegasusBorderRadius
import br.com.cogna.pegasusdesignsystemandroid.components.spacing.PegasusSpacing

object PegasusThemeProvider {
    val colorScheme: PegasusColorsScheme
        @Composable get() = LocalPegasusThemeComposition.current

    val spacing: PegasusSpacing
        @Composable get() = LocalPegasusSpacingComposition.current

    val borderRadius: PegasusBorderRadius
        @Composable get() = LocalPegasusBorderRadiusComposition.current

    val borderStroke: PegasusBorderStrokes
        @Composable get() = LocalPegasusBorderStrokeComposition.current

    val fontWeight: PegasusFontWeight
        @Composable get() = LocalPegasusFontWeightComposition.current
}