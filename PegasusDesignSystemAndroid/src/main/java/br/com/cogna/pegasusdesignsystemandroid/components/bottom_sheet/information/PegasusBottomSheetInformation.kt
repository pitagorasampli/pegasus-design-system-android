package br.com.cogna.pegasusdesignsystemandroid.components.bottom_sheet.information

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetState
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import br.com.cogna.pegasusdesignsystemandroid.R
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaPreviews
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaTheme
import br.com.cogna.pegasusdesignsystemandroid.components.bottom_sheet.PegasusModalBottomSheet
import br.com.cogna.pegasusdesignsystemandroid.components.button.PegasusActionButton
import br.com.cogna.pegasusdesignsystemandroid.components.theme.PegasusThemeProvider
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@ExperimentalMaterialApi
@Composable
fun PegasusBottomSheetInformation(
    modalSheetState: ModalBottomSheetState,
    scope: CoroutineScope,
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
    onCancelAction: () -> Unit = {},
    onConfirmAction: () -> Unit = {},
    contentBehind: @Composable () -> Unit
) {
    PegasusModalBottomSheet(
        modalSheetState = modalSheetState,
        sheetContent = {
            PegasusBottomSheetInformationLayout(
                topTitle = topTitle,
                topIconResource = topIconResource,
                onClickTopIcon = onClickTopIcon,
                hasMiddleContent = hasMiddleContent,
                middleContent = middleContent,
                middleTextAnnotated = middleTextAnnotated,
                middleTextStyle = middleTextStyle,
                hasBottomContent = hasBottomContent,
                twoBottomActions = twoBottomActions,
                cancelActionText = cancelActionText,
                confirmActionText = confirmActionText,
                onClickCancelAction = {
                    scope.launch { modalSheetState.hide() }
                    onCancelAction()
                },
                onClickConfirmAction = {
                    scope.launch { modalSheetState.hide() }
                    onConfirmAction()
                }
            )
        },
        contentBehind = contentBehind
    )
}


@ExperimentalMaterialApi
@Composable
fun PegasusBottomSheetInformation(
    modalSheetState: ModalBottomSheetState,
    scope: CoroutineScope,
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
    onCancelAction: () -> Unit = {},
    onConfirmAction: () -> Unit = {},
    contentBehind: @Composable () -> Unit
) {
    PegasusModalBottomSheet(
        modalSheetState = modalSheetState,
        sheetContent = {
            PegasusBottomSheetInformationLayout(
                topTitle = topTitle,
                topIconResource = topIconResource,
                onClickTopIcon = onClickTopIcon,
                hasMiddleContent = hasMiddleContent,
                middleContent = middleContent,
                middleText = middleText,
                middleTextStyle = middleTextStyle,
                hasBottomContent = hasBottomContent,
                twoBottomActions = twoBottomActions,
                cancelActionText = cancelActionText,
                confirmActionText = confirmActionText,
                onClickCancelAction = {
                    scope.launch { modalSheetState.hide() }
                    onCancelAction()
                },
                onClickConfirmAction = {
                    scope.launch { modalSheetState.hide() }
                    onConfirmAction()
                }
            )
        },
        contentBehind = contentBehind
    )
}

//region Previews
@OptIn(ExperimentalMaterialApi::class)
@Composable
@SofiaPreviews
@ShowkaseComposable(
    name = "Pegasus Bottom Sheet Common Sofia",
    defaultStyle = true,
    group = "Bottom Sheet"
)
fun PegasusBottomSheetInformation_Sofia_Preview() {
    SofiaTheme {
        val modalSheetState = rememberModalBottomSheetState(
            initialValue = ModalBottomSheetValue.Hidden,
            skipHalfExpanded = true
        )
        val scope = rememberCoroutineScope()

        PegasusBottomSheetInformation(
            modalSheetState = modalSheetState,
            scope = scope,
            middleText = null,
            topTitle = "Titulo",
            confirmActionText = "Confirmar",
            middleContent = {
                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.ic_image_placeholder_1),
                    contentDescription = null
                )
            },
            contentBehind = {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = PegasusThemeProvider.colorScheme.background)
                ) {

                    PegasusActionButton(text = "Show hide Bottom Sheet", onClickEnabled = {
                        scope.launch {
                            modalSheetState.show()
                        }
                    })
                }
            })
    }
}


//endregion Previews
