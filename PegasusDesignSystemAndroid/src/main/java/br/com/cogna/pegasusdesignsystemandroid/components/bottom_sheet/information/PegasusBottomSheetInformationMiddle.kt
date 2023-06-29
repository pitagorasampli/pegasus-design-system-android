package br.com.cogna.pegasusdesignsystemandroid.components.bottom_sheet.information

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import br.com.cogna.pegasusdesignsystemandroid.R
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaPreviews
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaTheme
import br.com.cogna.pegasusdesignsystemandroid.components.text.PegasusUIText
import br.com.cogna.pegasusdesignsystemandroid.components.theme.PegasusThemeProvider

@Composable
fun PegasusBottomSheetInformationMiddle(
    modifier: Modifier = Modifier,
    text: String?,
    textStyle: TextStyle = MaterialTheme.typography.bodyMedium,
    additionalContent: @Composable (() -> Unit)? = null
) {
    Column(modifier = modifier.fillMaxWidth()) {
        text?.let {
            PegasusUIText(
                modifier = Modifier.padding(
                    vertical = PegasusThemeProvider.spacing.spacing7
                ), text = text, textStyle = textStyle
            )
        }
        
        additionalContent?.invoke()
    }
}


@Composable
fun PegasusBottomSheetInformationMiddle(
    text: AnnotatedString?,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = MaterialTheme.typography.bodyMedium,
    additionalContent: @Composable (() -> Unit)? = null
) {
    Column(modifier = modifier.fillMaxWidth()) {
        text?.let {
            PegasusUIText(
                modifier = Modifier.padding(
                    vertical = PegasusThemeProvider.spacing.spacing7
                ), text = text, textStyle = textStyle
            )
        }

        additionalContent?.invoke()
    }
}

//region Previews
@Composable
@SofiaPreviews
private fun PegasusBottomSheetInformationMiddle_Sofia_Preview() {
    SofiaTheme {
        Column(Modifier.background(color = PegasusThemeProvider.colorScheme.background)) {
            PegasusBottomSheetInformationMiddle(text = "A sua jornada de estudos começa agora! Faça seu onboarding para conhecer mais sobre nossas funcionalidades.",
                additionalContent = {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            imageVector = ImageVector.vectorResource(R.drawable.ic_image_placeholder_1),
                            contentDescription = null
                        )
                    }

                })
        }
    }
}

//endregion Previews