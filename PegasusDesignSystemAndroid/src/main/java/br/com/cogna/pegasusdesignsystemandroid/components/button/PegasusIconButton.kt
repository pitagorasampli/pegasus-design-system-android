package br.com.cogna.pegasusdesignsystemandroid.components.button

import androidx.annotation.DrawableRes
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.Dp
import br.com.cogna.pegasusdesignsystemandroid.R
import br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.theme.SaraivaPreviews
import br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.theme.SaraivaTheme
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaPreviews
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaTheme
import br.com.cogna.pegasusdesignsystemandroid.components.theme.PegasusThemeProvider
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import kotlinx.coroutines.delay

enum class PegasusIconButtonState {
    UNPRESSED, PRESSED
}

@Composable
fun PegasusIconButton(
    @DrawableRes iconResource: Int,
    iconTintUnpressed: Color = PegasusThemeProvider.colorScheme.onSurfaceVariant,
    iconTintPressed: Color = PegasusThemeProvider.colorScheme.primary,
    iconSize: Dp = PegasusThemeProvider.spacing.spacing8,
    stateLayerSize: Dp = PegasusThemeProvider.spacing.spacing10,
    contentDescription: String? = null,
    onClick: () -> Unit
) {

    var state by remember {
        mutableStateOf(PegasusIconButtonState.UNPRESSED)
    }

    val iconTintAnimated: Color by animateColorAsState(
        targetValue =
        if (state == PegasusIconButtonState.PRESSED) {
            iconTintPressed
        } else {
            iconTintUnpressed
        },
        label = "Icon State", animationSpec = tween(400)
    )

    //Returns Icon back to original unpressed state after pressed
    LaunchedEffect(state) {
        if (state == PegasusIconButtonState.PRESSED) {
            delay(500)
            state = PegasusIconButtonState.UNPRESSED
        }
    }

    IconButton(modifier = Modifier.size(stateLayerSize), onClick = {
        state = PegasusIconButtonState.PRESSED
        onClick()
    }) {
        Icon(
            modifier = Modifier.size(iconSize),
            imageVector = ImageVector.vectorResource(iconResource),
            contentDescription = contentDescription,
            tint = iconTintAnimated
        )
    }


}

//region Previews

@SofiaPreviews
@Composable
@ShowkaseComposable(name = "Pegasus Icon Button Sofia", group = "Buttons")
fun PegasusIconButton_Sofia_Preview() {
    SofiaTheme {
        Column(
            modifier = Modifier
                .wrapContentSize()
                .background(color = PegasusThemeProvider.colorScheme.background)
        ) {

            Box(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing6)) {
                PegasusIconButton(iconResource = R.drawable.ic_ds_app_settings_alt,
                    onClick = {

                    })

            }
        }

    }
}


@SaraivaPreviews
@Composable
@ShowkaseComposable(name = "Pegasus Icon Button Saraiva", group = "Buttons")
fun PegasusIconButton_Saraiva_Preview() {
    SaraivaTheme {
        Column(
            modifier = Modifier
                .wrapContentSize()
                .background(color = PegasusThemeProvider.colorScheme.background)
        ) {

            Box(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing6)) {
                PegasusIconButton(iconResource = R.drawable.ic_ds_app_settings_alt,
                    onClick = {

                    })

            }
        }

    }
}
//endregion Previews