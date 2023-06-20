package br.com.cogna.pegasusdesignsystemandroid.components.theme

import androidx.compose.runtime.Composable
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.LocalPegasusSpacingComposition
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.LocalPegasusThemeComposition
import br.com.cogna.pegasusdesignsystemandroid.components.colors.PegasusColorsScheme
import br.com.cogna.pegasusdesignsystemandroid.components.spacing.PegasusSpacing

object PegasusThemeProvider {
    val colorScheme: PegasusColorsScheme
        @Composable get() = LocalPegasusThemeComposition.current

    val spacing: PegasusSpacing
        @Composable get() = LocalPegasusSpacingComposition.current
}