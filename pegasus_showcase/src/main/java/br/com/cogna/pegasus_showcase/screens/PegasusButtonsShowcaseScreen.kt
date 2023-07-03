package br.com.cogna.pegasus_showcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.cogna.pegasus_showcase.common_components.PegasusComponentTitleDivider
import br.com.cogna.pegasus_showcase.common_components.PegasusCurrentTheme
import br.com.cogna.pegasusdesignsystemandroid.components.button.PegasusActionButtonPreview
import br.com.cogna.pegasusdesignsystemandroid.components.button.PegasusTextButtonPreview
import br.com.cogna.ui.pegasus_showcase.R


@Composable
fun PegasusButtonsScreen(currentBrandTheme: String) {
    PegasusCurrentTheme(currentBrandTheme) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            PegasusComponentTitleDivider(stringResource(id = R.string.screen_buttons_action))

            PegasusActionButtonPreview()

            PegasusComponentTitleDivider(stringResource(id = R.string.screen_buttons_text))

            PegasusTextButtonPreview()
        }
    }
}

@Preview
@Composable
fun PegasusButtonsScreen_Preview() {
    PegasusButtonsScreen("Sofia")
}