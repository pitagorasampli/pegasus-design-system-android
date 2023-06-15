package br.com.cogna.pegasusdesignsystemandroid.components.card

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.SofiaSpacing
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaPreviews
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaTheme
import br.com.cogna.pegasusdesignsystemandroid.components.theme.PegasusTheme
import com.airbnb.android.showkase.annotation.ShowkaseComposable

@Composable
fun PegasusPrimaryCard(modifier: Modifier, content: @Composable () -> Unit) {
    Card(
        modifier = modifier,
        shape = MaterialTheme.shapes.medium,
        backgroundColor = MaterialTheme.colorScheme.surface,
        contentColor = MaterialTheme.colorScheme.onSurface,
        content = content
    )
}

@Composable
@SofiaPreviews
@ShowkaseComposable(name = "Pegasus Primary Card", group = "Cards", defaultStyle = true)
fun PegasusPrimaryCard_Sofia_Preview() {
    SofiaTheme {
        Column(modifier = Modifier.background(color = MaterialTheme.colorScheme.background)) {
            PegasusPrimaryCard(modifier = Modifier.padding(SofiaSpacing.spacing_6)) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        style = MaterialTheme.typography.bodyLarge.copy(
                            color = MaterialTheme.colorScheme.onSurface, fontWeight = FontWeight.Bold
                        ), text = "Title"
                    )

                    Text(
                        modifier = Modifier.padding(top = 16.dp),
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color = MaterialTheme.colorScheme.onSurface
                        ), text = "Subtitle"
                    )
                    Text(
                        modifier = Modifier.padding(top = 8.dp),
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = MaterialTheme.colorScheme.onSurface
                        ), text = "Description of a long text"
                    )


                }
            }
        }
    }
}
