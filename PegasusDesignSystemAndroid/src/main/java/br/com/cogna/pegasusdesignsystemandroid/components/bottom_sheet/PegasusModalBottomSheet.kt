package br.com.cogna.pegasusdesignsystemandroid.components.bottom_sheet

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetState
import androidx.compose.runtime.Composable
import br.com.cogna.pegasusdesignsystemandroid.components.theme.PegasusThemeProvider


@ExperimentalMaterialApi
@Composable
fun PegasusModalBottomSheet(
    modalSheetState: ModalBottomSheetState,
    sheetContent: @Composable ColumnScope.() -> Unit,
    contentBehind: @Composable () -> Unit
) {
    ModalBottomSheetLayout(
        sheetState = modalSheetState,
        sheetShape = PegasusThemeProvider.borderRadius.bottomSheet,
        sheetContent = sheetContent,
        content = contentBehind
    )
}