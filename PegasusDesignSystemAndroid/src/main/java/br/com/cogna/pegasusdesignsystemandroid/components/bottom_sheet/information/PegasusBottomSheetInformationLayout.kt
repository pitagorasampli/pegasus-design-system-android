package br.com.cogna.pegasusdesignsystemandroid.components.bottom_sheet.information

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import br.com.cogna.pegasusdesignsystemandroid.R
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaPreviews
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaTheme
import br.com.cogna.pegasusdesignsystemandroid.components.bottom_sheet.PegasusBottomSheetLayout
import br.com.cogna.pegasusdesignsystemandroid.components.divider.PegasusHorizontalDivider
import br.com.cogna.pegasusdesignsystemandroid.components.text.PegasusUIText
import br.com.cogna.pegasusdesignsystemandroid.components.theme.PegasusThemeProvider


@Composable
fun PegasusBottomSheetInformationLayout(
    topTitle: String,
    @DrawableRes topIconResource: Int? = null,
    onClickTopIcon: (() -> Unit)? = null,
    hasMiddleContent: Boolean = true,
    middleContent: @Composable (() -> Unit)? = null,
    middleText: String? = null,
    middleTextStyle: TextStyle = MaterialTheme.typography.bodyMedium,
    hasBottomContent: Boolean = true,
    twoBottomActions: Boolean = true,
    cancelActionText: String = "",
    confirmActionText: String = "",
    onClickCancelAction: () -> Unit = {},
    onClickConfirmAction: () -> Unit = {}
) {
    PegasusBottomSheetLayout {
        Column(modifier = Modifier.fillMaxWidth()) {
            PegasusBottomSheetInformationTop(
                title = topTitle,
                iconResource = topIconResource,
                onClickButtonIcon = onClickTopIcon
            )

            if (hasMiddleContent) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = PegasusThemeProvider.spacing.spacing7)
                ) {
                    PegasusBottomSheetInformationMiddle(
                        text = middleText,
                        textStyle = middleTextStyle,
                        additionalContent = middleContent
                    )
                }
            }

            if (hasBottomContent) {
                if(hasMiddleContent) {
                    PegasusHorizontalDivider(modifier = Modifier.padding(top = PegasusThemeProvider.spacing.spacing6))
                }
                PegasusBottomSheetInformationBottom(
                    twoOptions = twoBottomActions,
                    cancelActionText = cancelActionText,
                    confirmActionText = confirmActionText,
                    onClickCancelAction = onClickCancelAction,
                    onClickConfirmAction = onClickConfirmAction
                )
            }

        }
    }
}



@Composable
fun PegasusBottomSheetInformationLayout(
    topTitle: String,
    @DrawableRes topIconResource: Int? = null,
    onClickTopIcon: (() -> Unit)? = null,
    hasMiddleContent: Boolean = true,
    middleContent: @Composable (() -> Unit)? = null,
    middleTextAnnotated: AnnotatedString? = null,
    middleTextStyle: TextStyle = MaterialTheme.typography.bodyMedium,
    hasBottomContent: Boolean = true,
    twoBottomActions: Boolean = true,
    cancelActionText: String = "",
    confirmActionText: String = "",
    onClickCancelAction: () -> Unit = {},
    onClickConfirmAction: () -> Unit = {}
) {
    PegasusBottomSheetLayout {
        Column(modifier = Modifier.fillMaxWidth()) {
            PegasusBottomSheetInformationTop(
                title = topTitle,
                iconResource = topIconResource,
                onClickButtonIcon = onClickTopIcon
            )

            if (hasMiddleContent) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = PegasusThemeProvider.spacing.spacing7)
                ) {
                    PegasusBottomSheetInformationMiddle(
                        text = middleTextAnnotated,
                        textStyle = middleTextStyle,
                        additionalContent = middleContent
                    )
                }
            }

            if (hasBottomContent) {
                if(hasMiddleContent) {
                    PegasusHorizontalDivider(modifier = Modifier.padding(top = PegasusThemeProvider.spacing.spacing6))
                }
                PegasusBottomSheetInformationBottom(
                    twoOptions = twoBottomActions,
                    cancelActionText = cancelActionText,
                    confirmActionText = confirmActionText,
                    onClickCancelAction = onClickCancelAction,
                    onClickConfirmAction = onClickConfirmAction
                )
            }

        }
    }
}

//region Previews
@Composable
@SofiaPreviews
private fun PegasusBottomSheetInformationLayout_Sofia_Preview() {
    SofiaTheme {
        val bgColor = PegasusThemeProvider.colorScheme.background.copy(
            alpha = 0.4f
        )
        Column(
            modifier = Modifier.background(
                color = bgColor
            )
        ) {
            //Full Layout
            Box(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing8)) {
                PegasusUIText(
                    text = "Pegasus Bottom Sheet Common Layout Full",
                    textStyle = MaterialTheme.typography.bodyLarge,
                    color = PegasusThemeProvider.colorScheme.background
                )
            }


            PegasusBottomSheetInformationLayout(
                topTitle = "Title",
                topIconResource = R.drawable.ic_ds_close,
                middleText = "A sua jornada de estudos começa agora! Faça seu onboarding para conhecer mais sobre nossas funcionalidades.",
                middleContent = {
                    Image(
                        imageVector = ImageVector.vectorResource(R.drawable.ic_image_placeholder_1),
                        contentDescription = null
                    )
                },
                confirmActionText = "Confirmar",
                cancelActionText = "Cancelar",
                twoBottomActions = true
            )

            //No Image layout
            Box(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing8)) {
                PegasusUIText(
                    text = "Pegasus Bottom Sheet Common Layout No Image",
                    textStyle = MaterialTheme.typography.bodyLarge,
                    color = PegasusThemeProvider.colorScheme.background
                )
            }

            PegasusBottomSheetInformationLayout(
                topTitle = "Title",
                topIconResource = R.drawable.ic_ds_close,
                middleText = "A sua jornada de estudos começa agora! Faça seu onboarding para conhecer mais sobre nossas funcionalidades.",
                confirmActionText = "Confirmar",
                cancelActionText = "Cancelar",
                twoBottomActions = true
            )


            //Empty middle layout
            Box(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing8)) {
                PegasusUIText(
                    text = "Pegasus Bottom Sheet Common Layout Empty Middle",
                    textStyle = MaterialTheme.typography.bodyLarge,
                    color = PegasusThemeProvider.colorScheme.background
                )
            }

            PegasusBottomSheetInformationLayout(
                topTitle = "Title",
                topIconResource = R.drawable.ic_ds_close,
                hasMiddleContent = false,
                middleText = null,
                confirmActionText = "Confirmar",
                cancelActionText = "Cancelar",
                twoBottomActions = true
            )
        }
    }
}


//endregion Previews