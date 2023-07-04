package br.com.cogna.pegasus_showcase.common_components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PegasusMainScreenCard(cardTitle: String, onClickCard: () -> Unit) {
    Card(
        elevation = 2.dp,
        modifier = Modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.surface)
            .padding(16.dp)
            .clickable { onClickCard() }) {

        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = cardTitle,
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}