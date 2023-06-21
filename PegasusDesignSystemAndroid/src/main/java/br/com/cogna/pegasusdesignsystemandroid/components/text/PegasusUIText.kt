package br.com.cogna.pegasusdesignsystemandroid.components.text

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaPreviews
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaTheme
import br.com.cogna.pegasusdesignsystemandroid.components.theme.PegasusThemeProvider

@Composable
fun PegasusUIText(text: String, textStyle: TextStyle) {
    Text(text = text, style = textStyle)
}

@SofiaPreviews
@Composable
fun PegasusUIText_Sofia_Preview() {
    SofiaTheme {
        Column(Modifier.background(color = PegasusThemeProvider.colorScheme.background)) {

            Column(modifier = Modifier.padding(16.dp)) {
                PegasusUIText(
                    text = "displayLarge",
                    textStyle = MaterialTheme.typography.displayLarge
                )

                Spacer(modifier = Modifier.height(16.dp))

                PegasusUIText(
                    text = "displayMedium",
                    textStyle = MaterialTheme.typography.displayMedium
                )
                Spacer(modifier = Modifier.height(16.dp))

                PegasusUIText(
                    text = "displaySmall",
                    textStyle = MaterialTheme.typography.displaySmall
                )
                Spacer(modifier = Modifier.height(16.dp))

                PegasusUIText(
                    text = "headlineLarge",
                    textStyle = MaterialTheme.typography.headlineLarge
                )
                Spacer(modifier = Modifier.height(16.dp))

                PegasusUIText(
                    text = "headlineMedium",
                    textStyle = MaterialTheme.typography.headlineMedium
                )
                Spacer(modifier = Modifier.height(16.dp))

                PegasusUIText(
                    text = "headlineSmall",
                    textStyle = MaterialTheme.typography.headlineSmall
                )
                Spacer(modifier = Modifier.height(16.dp))

                PegasusUIText(text = "titleLarge", textStyle = MaterialTheme.typography.titleLarge)

                Spacer(modifier = Modifier.height(16.dp))

                PegasusUIText(
                    text = "titleMedium",
                    textStyle = MaterialTheme.typography.titleMedium
                )

                Spacer(modifier = Modifier.height(16.dp))

                PegasusUIText(text = "titleSmall", textStyle = MaterialTheme.typography.titleSmall)
                Spacer(modifier = Modifier.height(16.dp))

                PegasusUIText(text = "bodyLarge", textStyle = MaterialTheme.typography.bodyLarge)
                Spacer(modifier = Modifier.height(16.dp))

                PegasusUIText(text = "bodyMedium", textStyle = MaterialTheme.typography.bodyMedium)
                Spacer(modifier = Modifier.height(16.dp))

                PegasusUIText(text = "labelSmall", textStyle = MaterialTheme.typography.labelSmall)

            }


        }
    }
}