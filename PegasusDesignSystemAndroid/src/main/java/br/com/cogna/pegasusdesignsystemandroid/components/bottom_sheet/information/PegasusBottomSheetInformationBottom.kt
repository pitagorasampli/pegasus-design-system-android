package br.com.cogna.pegasusdesignsystemandroid.components.bottom_sheet.information

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaPreviews
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaTheme
import br.com.cogna.pegasusdesignsystemandroid.components.button.PegasusActionButton
import br.com.cogna.pegasusdesignsystemandroid.components.button.PegasusTextButton
import br.com.cogna.pegasusdesignsystemandroid.components.text.PegasusUIText
import br.com.cogna.pegasusdesignsystemandroid.components.theme.PegasusThemeProvider

@Composable
fun PegasusBottomSheetInformationBottom(
    twoOptions: Boolean = true,
    cancelActionText: String = "",
    confirmActionText: String = "",
    onClickCancelAction: () -> Unit = {},
    onClickConfirmAction: () -> Unit = {}
) {
    Column(modifier = Modifier.fillMaxWidth()) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    vertical = PegasusThemeProvider.spacing.spacing6,
                    horizontal = PegasusThemeProvider.spacing.spacing7
                ),
            horizontalArrangement = Arrangement.End
        ) {
            if (twoOptions) {
                PegasusTextButton(
                    modifier = Modifier.weight(0.5f),
                    text = cancelActionText,
                    onClickEnabled = onClickCancelAction
                )

                PegasusActionButton(
                    modifier = Modifier.weight(0.5f),
                    text = confirmActionText,
                    onClickEnabled = onClickConfirmAction
                )
            }else {
                Spacer(modifier = Modifier.weight(0.5f))

                PegasusActionButton(
                    modifier = Modifier.weight(0.5f),
                    text = confirmActionText,
                    onClickEnabled = onClickConfirmAction
                )
            }
        }
    }
}

//region Previews
@Composable
@SofiaPreviews
private fun PegasusBottomSheetInformationBottom_Sofia_Preview() {
    SofiaTheme {
        Column(modifier = Modifier.background(color = PegasusThemeProvider.colorScheme.background)) {
            PegasusUIText(
                text = "Two options:",
                textStyle = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing6)
            )
            PegasusBottomSheetInformationBottom(
                cancelActionText = "Cancelar",
                confirmActionText = "Confirmar"
            )

            Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing7))

            PegasusUIText(
                text = "One option:",
                textStyle = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing6)
            )
            PegasusBottomSheetInformationBottom(
                twoOptions = false,
                cancelActionText = "Cancelar",
                confirmActionText = "Confirmar"
            )

        }
    }
}


//endregion Previews