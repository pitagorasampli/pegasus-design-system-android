package br.com.cogna.pegasusdesignsystemandroid.components.divider

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
fun PegasusVerticalDivider(modifier: Modifier = Modifier) {
    Divider(
        modifier
            .width(1.dp)
            .fillMaxHeight(), color = PegasusThemeProvider.colorScheme.divider
    )
}

//region Previews
@Composable
@SofiaPreviews
@ShowkaseComposable(name = "Pegasus Vertical Divider Sofia", defaultStyle = true, group = "Divider")
fun PegasusVerticalDivider_Sofia_Preview() {
    SofiaTheme {
        Column(
            modifier = Modifier
                .wrapContentSize()
                .background(color = PegasusThemeProvider.colorScheme.background)
        ) {
            Box(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing6)) {
                PegasusVerticalDivider()
            }
        }
    }
}

@Composable
@SofiaPreviews
@ShowkaseComposable(
    name = "Pegasus Vertical Divider Saraiva",
    defaultStyle = true,
    group = "Divider"
)
fun PegasusVerticalDivider_Saraiva_Preview() {
    SaraivaTheme {
        Column(
            modifier = Modifier
                .wrapContentSize()
                .background(color = PegasusThemeProvider.colorScheme.background)
        ) {
            Box(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing6)) {
                PegasusVerticalDivider()
            }
        }
    }
}
//endregion Previews