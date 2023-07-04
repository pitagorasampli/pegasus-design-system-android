package br.com.cogna.pegasus_showcase.screens.typography

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.cogna.pegasus_showcase.common_components.PegasusComponentBaseScreen
import br.com.cogna.pegasusdesignsystemandroid.components.text.PegasusTypographyPreview

@Composable
fun PegasusTypographyScreen(currentBrandTheme: String) {
    PegasusComponentBaseScreen(currentBrandTheme = currentBrandTheme) {
        PegasusTypographyPreview()
    }
}

@Preview
@Composable
fun PegasusTypographyScreenPreview() {
    PegasusTypographyScreen("Sofia")
}