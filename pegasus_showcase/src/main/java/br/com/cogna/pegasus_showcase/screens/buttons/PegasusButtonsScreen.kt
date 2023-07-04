package br.com.cogna.pegasus_showcase.screens.buttons

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.cogna.pegasus_showcase.common_components.PegasusComponentBaseScreen
import br.com.cogna.pegasus_showcase.common_components.PegasusComponentTitleDivider
import br.com.cogna.pegasus_showcase.common_components.PegasusMainScreenCard
import br.com.cogna.ui.pegasus_showcase.R


@Composable
fun PegasusButtonsScreen(
    currentBrandTheme: String,
    onNavigateToActionButtons: () -> Unit,
    onNavigateToTextButtons: () -> Unit
) {
    PegasusComponentBaseScreen(currentBrandTheme = currentBrandTheme) {

        PegasusComponentTitleDivider(text = stringResource(id = R.string.screen_buttons_action))

        PegasusMainScreenCard(
            cardTitle = stringResource(id = R.string.screen_buttons_action),
            onNavigateToActionButtons
        )

        PegasusComponentTitleDivider(text = stringResource(id = R.string.screen_buttons_text))

        PegasusMainScreenCard(
            cardTitle = stringResource(id = R.string.screen_buttons_text),
            onNavigateToTextButtons
        )

    }

}

@Preview
@Composable
fun PegasusButtonsScreen_Preview() {
    PegasusButtonsScreen("Sofia", {}, {})
}