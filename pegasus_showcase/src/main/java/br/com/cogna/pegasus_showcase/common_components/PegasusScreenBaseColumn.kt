package br.com.cogna.pegasus_showcase.common_components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun PegasusComponentBaseScreen(currentBrandTheme: String, content: @Composable () -> Unit) {
    PegasusCurrentTheme(currentBrandTheme) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            content()
        }
    }
}