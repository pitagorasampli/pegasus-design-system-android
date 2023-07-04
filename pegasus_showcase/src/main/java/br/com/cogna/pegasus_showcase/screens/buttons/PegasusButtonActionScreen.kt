package br.com.cogna.pegasus_showcase.screens.buttons

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.cogna.pegasus_showcase.common_components.PegasusComponentBaseScreen
import br.com.cogna.pegasus_showcase.common_components.PegasusComponentTitleDivider
import br.com.cogna.pegasusdesignsystemandroid.components.button.PegasusActionButtonPreview
import br.com.cogna.ui.pegasus_showcase.R


@Composable
fun PegasusButtonActionScreen(currentBrandTheme: String) {
    PegasusComponentBaseScreen(currentBrandTheme = currentBrandTheme) {

        PegasusComponentTitleDivider(stringResource(id = R.string.screen_buttons_action))

        PegasusActionButtonPreview()
    }

}

@Preview
@Composable
fun PegasusButtonActionScreen_Preview() {
    PegasusButtonActionScreen("Sofia")
}