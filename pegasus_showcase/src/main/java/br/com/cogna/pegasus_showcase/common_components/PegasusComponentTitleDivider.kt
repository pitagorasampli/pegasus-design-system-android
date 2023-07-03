package br.com.cogna.pegasus_showcase.common_components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import br.com.cogna.pegasusdesignsystemandroid.components.text.PegasusUIText
import br.com.cogna.pegasusdesignsystemandroid.components.theme.PegasusThemeProvider
import br.com.cogna.ui.pegasus_showcase.R

@Composable
fun PegasusComponentTitleDivider(text: String){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = PegasusThemeProvider.colorScheme.surface),
    ) {
        PegasusUIText(
            modifier = Modifier
                .padding(PegasusThemeProvider.spacing.spacing6)
                .fillMaxWidth()
                .background(color = PegasusThemeProvider.colorScheme.surface),
            text = text,
            color = PegasusThemeProvider.colorScheme.onSurface,
            textStyle = MaterialTheme.typography.titleSmall,
            fontWeight = FontWeight.Bold
        )
    }
}