package br.com.cogna.pegasusdesignsystemandroid.components.bottom_sheet

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import br.com.cogna.pegasusdesignsystemandroid.components.theme.PegasusThemeProvider

@Composable
fun PegasusBottomSheetLayout(content: @Composable () -> Unit) {
    Card(
        backgroundColor = PegasusThemeProvider.colorScheme.background,
        modifier = Modifier.fillMaxWidth(),
        shape = PegasusThemeProvider.borderRadius.bottomSheet
    ) {
        content()
    }
}

