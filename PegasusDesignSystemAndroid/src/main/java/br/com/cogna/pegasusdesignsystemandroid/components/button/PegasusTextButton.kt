package br.com.cogna.pegasusdesignsystemandroid.components.button

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.SwapHoriz
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.theme.SaraivaTheme
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaPreviews
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaTheme
import br.com.cogna.pegasusdesignsystemandroid.components.theme.PegasusThemeProvider
import com.airbnb.android.showkase.annotation.ShowkaseComposable


enum class PegasusTextButtonState {
    ENABLED, DISABLED
}


@Composable
fun PegasusTextButton(
    modifier: Modifier = Modifier,
    backgroundModifier: Modifier = Modifier,
    enabledElementsColor: Color = PegasusThemeProvider.colorScheme.primary,
    disabledElementsColor: Color = PegasusThemeProvider.colorScheme.onBackgroundSecondary,
    text: String,
    buttonState: PegasusTextButtonState = PegasusTextButtonState.ENABLED,
    contentDescription: String? = null,
    iconLeft: (@Composable () -> Unit)? = null,
    iconRight: (@Composable () -> Unit)? = null,
    onClickEnabled: () -> Unit = {}
) {

    PegasusTextButtonEnabled(
        modifier = modifier,
        backgroundModifier = backgroundModifier,
        enabledElementsColor = enabledElementsColor,
        disabledElementsColor = disabledElementsColor,
        text = text,
        buttonState = buttonState,
        contentDescription = contentDescription,
        iconLeft = iconLeft,
        iconRight = iconRight,
        onClickEnabled = onClickEnabled
    )

}

private object NoRippleTheme : RippleTheme {
    @Composable
    override fun defaultColor() = Color.Unspecified

    @Composable
    override fun rippleAlpha(): RippleAlpha = RippleAlpha(0.0f,0.0f,0.0f,0.0f)
}

@Composable
fun PegasusTextButtonEnabled(
    modifier: Modifier = Modifier,
    backgroundModifier: Modifier = Modifier,
    enabledElementsColor: Color = PegasusThemeProvider.colorScheme.primary,
    disabledElementsColor: Color = PegasusThemeProvider.colorScheme.onBackgroundSecondary,
    text: String,
    buttonState: PegasusTextButtonState = PegasusTextButtonState.ENABLED,
    contentDescription: String? = null,
    iconLeft: (@Composable () -> Unit)? = null,
    iconRight: (@Composable () -> Unit)? = null,
    onClickEnabled: () -> Unit
) {

    CompositionLocalProvider(LocalRippleTheme provides NoRippleTheme) {

        //TODO: Chamar Naila, cor neutral 80 nao tem color role atribuida a ela para o texto no disabled
        Button(
            modifier = modifier,
            enabled = buttonState == PegasusTextButtonState.ENABLED,
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Transparent,
                contentColor = enabledElementsColor,
                disabledBackgroundColor = Color.Transparent,
                disabledContentColor = disabledElementsColor
            ),
            elevation = ButtonDefaults.elevation(0.dp),
            contentPadding = PaddingValues(),
            shape = MaterialTheme.shapes.medium,
            onClick = {
                onClickEnabled()
            }
        ) {

            Box(
                modifier = backgroundModifier
                    .fillMaxWidth()
                    .then(modifier),
                contentAlignment = Alignment.Center,
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center, modifier = modifier.padding(
                        PegasusThemeProvider.spacing.spacing6
                    )
                ) {
                    iconLeft?.invoke()

                    PegasusButtonText(
                        description = contentDescription,
                        text = text,
                        elementsColor = if (buttonState == PegasusTextButtonState.ENABLED) enabledElementsColor else disabledElementsColor
                    )

                    iconRight?.invoke()

                }
            }
        }
    }
}

//region Sofia Previews
@Composable
fun PegasusTextButtonPreview() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = PegasusThemeProvider.colorScheme.background)
    ) {
        //Default Style
        Box(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing6)) {
            PegasusTextButton(text = "Click me button", onClickEnabled = {})
        }

        Divider()

        //Disable with icon left Style

        var buttonStateLeftIcon by remember {
            mutableStateOf(PegasusTextButtonState.ENABLED)
        }
        Box(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing6)) {
            PegasusTextButton(text = "Click To Disable me",
                iconLeft = {
                    PegasusActionButtonIcon(imageVector = Icons.Default.SwapHoriz)
                },
                buttonState = buttonStateLeftIcon,
                onClickEnabled = {
                    buttonStateLeftIcon = PegasusTextButtonState.DISABLED
                })
        }

        Divider()

        var buttonStateRightIcon by remember {
            mutableStateOf(PegasusTextButtonState.ENABLED)
        }
        //Disable with icon right Style
        Box(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing6)) {
            PegasusTextButton(text = "Click To Disable me",
                iconRight = {
                    PegasusActionButtonIcon(imageVector = Icons.Default.SwapHoriz)
                },
                buttonState = buttonStateRightIcon,
                onClickEnabled = {
                    buttonStateRightIcon = PegasusTextButtonState.DISABLED
                })
        }
    }
}

@Composable
@SofiaPreviews
@ShowkaseComposable(name = "Pegasus Text Button", group = "Buttons", defaultStyle = true)
fun PegasusTextButton_Sofia_Preview() {
    SofiaTheme {
        PegasusTextButtonPreview()
    }
}


@Composable
@SofiaPreviews
@ShowkaseComposable(name = "Pegasus Text Button Sofia", group = "Buttons", defaultStyle = true)
fun PegasusTextButton_Saraiva_Preview() {
    SaraivaTheme {
        PegasusTextButtonPreview()
    }
}
//endregion Sofia Previews
