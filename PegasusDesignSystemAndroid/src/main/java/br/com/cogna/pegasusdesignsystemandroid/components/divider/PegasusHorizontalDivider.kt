package br.com.cogna.pegasusdesignsystemandroid.components.divider

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.theme.SaraivaTheme
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaPreviews
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaTheme
import br.com.cogna.pegasusdesignsystemandroid.components.theme.PegasusThemeProvider
import com.airbnb.android.showkase.annotation.ShowkaseComposable

@Composable
fun PegasusHorizontalDivider(modifier: Modifier = Modifier) {
    Divider(
        modifier
            .height(1.dp)
            .fillMaxWidth(), color = PegasusThemeProvider.colorScheme.divider
    )
}

//region Previews
@Composable
@SofiaPreviews
@ShowkaseComposable(name = "Pegasus Horizontal Divider Sofia", defaultStyle = true, group = "Divider")
fun PegasusHorizontalDivider_Sofia_Preview() {
    SofiaTheme {
        Column(
            modifier = Modifier
                .wrapContentSize()
                .background(color = PegasusThemeProvider.colorScheme.background)
        ) {
            Box(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing6)) {
                PegasusHorizontalDivider()
            }
        }
    }
}

@Composable
@SofiaPreviews
@ShowkaseComposable(name = "Pegasus Horizontal Divider Saraiva", defaultStyle = true, group = "Divider")
fun PegasusHorizontalDivider_Saraiva_Preview() {
    SaraivaTheme {
        Column(
            modifier = Modifier
                .wrapContentSize()
                .background(color = PegasusThemeProvider.colorScheme.background)
        ) {
            Box(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing6)) {
                PegasusHorizontalDivider()
            }
        }
    }
}
//endregion Previews