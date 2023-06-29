package br.com.cogna.pegasusdesignsystemandroid.components.bottom_sheet.information

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import br.com.cogna.pegasusdesignsystemandroid.R
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaPreviews
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaTheme
import br.com.cogna.pegasusdesignsystemandroid.components.button.PegasusIconButton
import br.com.cogna.pegasusdesignsystemandroid.components.divider.PegasusHorizontalDivider
import br.com.cogna.pegasusdesignsystemandroid.components.text.PegasusUIText
import br.com.cogna.pegasusdesignsystemandroid.components.theme.PegasusThemeProvider


@Composable
fun PegasusBottomSheetInformationTop(
    title: String,
    @DrawableRes iconResource: Int? = null,
    onClickButtonIcon: (() -> Unit)? = null
) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = PegasusThemeProvider.spacing.spacing7,
                    bottom = PegasusThemeProvider.spacing.spacing6,
                    start = PegasusThemeProvider.spacing.spacing8,
                    end = PegasusThemeProvider.spacing.spacing8
                ),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            PegasusUIText(text = title, textStyle = MaterialTheme.typography.titleSmall)

            iconResource?.let { resource ->
                PegasusIconButton(
                    iconResource = resource,
                    onClick = { onClickButtonIcon?.invoke() })
            }
        }

        PegasusHorizontalDivider()
    }
}


//region Previews
@Composable
@SofiaPreviews
fun PegasusBottomSheetInformationTop_Sofia_Preview() {
    SofiaTheme {
        Column(Modifier.background(color = PegasusThemeProvider.colorScheme.background)) {
            PegasusBottomSheetInformationTop("Title", iconResource = R.drawable.ic_ds_close)
        }
    }
}


//endregion Previews