package br.com.cogna.pegasus_showcase.screens.buttons

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.cogna.pegasus_showcase.common_components.PegasusComponentBaseScreen
import br.com.cogna.pegasus_showcase.common_components.PegasusComponentTitleDivider
import br.com.cogna.pegasusdesignsystemandroid.components.button.PegasusTextButtonPreview
import br.com.cogna.ui.pegasus_showcase.R


@Composable
fun PegasusButtonTextScreen(currentBrandTheme: String) {
    PegasusComponentBaseScreen(currentBrandTheme = currentBrandTheme) {

        PegasusComponentTitleDivider(stringResource(id = R.string.screen_buttons_action))

        PegasusTextButtonPreview()
    }

}

@Preview
@Composable
fun PegasusButtonTextScreen_Preview() {
    PegasusButtonTextScreen("Sofia")
}