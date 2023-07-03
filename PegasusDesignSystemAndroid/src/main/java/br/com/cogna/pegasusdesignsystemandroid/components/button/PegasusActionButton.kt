package br.com.cogna.pegasusdesignsystemandroid.components.button

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.LocalContentColor
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Refresh
import androidx.compose.material.icons.rounded.Save
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import br.com.cogna.pegasusdesignsystemandroid.R
import br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.theme.SaraivaPreviews
import br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.theme.SaraivaTheme
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaPreviews
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaTheme
import br.com.cogna.pegasusdesignsystemandroid.components.theme.PegasusThemeProvider
import com.airbnb.android.showkase.annotation.ShowkaseComposable

enum class PegasusActionButtonState {
    ENABLED, DISABLED, LOADING
}


@Composable
fun PegasusActionButton(
    text: String,
    modifier: Modifier = Modifier,
    backgroundModifier: Modifier = Modifier,
    iconLeft: (@Composable () -> Unit)? = null,
    iconRight: (@Composable () -> Unit)? = null,
    buttonState: PegasusActionButtonState = PegasusActionButtonState.ENABLED,
    backgroundColor: Color = PegasusThemeProvider.colorScheme.primary,
    disabledBackgroundColor: Color = PegasusThemeProvider.colorScheme.surface,
    enabledElementsColor: Color = PegasusThemeProvider.colorScheme.onPrimary,
    disabledElementsColor: Color = PegasusThemeProvider.colorScheme.onBackgroundSecondary,
    contentDescription: String? = null,
    onClickEnabled: () -> Unit = {},
) {

    when (buttonState) {
        PegasusActionButtonState.LOADING -> {
            PegasusActionButtonLoading(
                modifier = modifier,
                backgroundModifier = backgroundModifier
            )
        }

        else -> {
            PegasusActionButtonEnabled(
                modifier = modifier,
                backgroundModifier = backgroundModifier,
                backgroundColor = backgroundColor,
                enabledElementsColor = enabledElementsColor,
                disabledBackgroundColor = disabledBackgroundColor,
                disabledElementsColor = disabledElementsColor,
                text = text,
                buttonState = buttonState,
                contentDescription = contentDescription,
                iconLeft = iconLeft,
                iconRight = iconRight,
                onClickEnabled = onClickEnabled
            )
        }
    }
}


@Composable
fun PegasusActionButtonEnabled(
    modifier: Modifier = Modifier,
    backgroundModifier: Modifier = Modifier,
    backgroundColor: Color = PegasusThemeProvider.colorScheme.primary,
    disabledBackgroundColor: Color = PegasusThemeProvider.colorScheme.surface,
    enabledElementsColor: Color = PegasusThemeProvider.colorScheme.onPrimary,
    disabledElementsColor: Color = PegasusThemeProvider.colorScheme.onBackgroundSecondary,
    text: String,
    buttonState: PegasusActionButtonState = PegasusActionButtonState.ENABLED,
    contentDescription: String? = null,
    iconLeft: (@Composable () -> Unit)? = null,
    iconRight: (@Composable () -> Unit)? = null,
    onClickEnabled: () -> Unit
) {

    //TODO: Chamar Naila, cor neutral 80 nao tem color role atribuida a ela para o texto no disabled
    Button(
        modifier = modifier,
        enabled = buttonState == PegasusActionButtonState.ENABLED,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = enabledElementsColor,
            disabledBackgroundColor = disabledBackgroundColor,
            disabledContentColor = disabledElementsColor
        ),
        elevation = ButtonDefaults.elevation(1.dp),
        contentPadding = PaddingValues(),
        shape = PegasusThemeProvider.borderRadius.button,
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
                    horizontal = PegasusThemeProvider.spacing.spacing6,
                    vertical = PegasusThemeProvider.spacing.spacing4
                )
            ) {
                iconLeft?.invoke()

                PegasusButtonText(
                    description = contentDescription,
                    text = text,
                    elementsColor = if (buttonState == PegasusActionButtonState.ENABLED) enabledElementsColor else disabledElementsColor
                )

                iconRight?.invoke()

            }
        }
    }
}


@Composable
fun PegasusActionButtonLoading(
    modifier: Modifier = Modifier,
    backgroundModifier: Modifier = Modifier
) {

    Button(
        modifier = modifier,
        enabled = false,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = PegasusThemeProvider.colorScheme.surface,
            contentColor = PegasusThemeProvider.colorScheme.onBackgroundSecondary,
            disabledBackgroundColor = PegasusThemeProvider.colorScheme.surface,
            disabledContentColor = PegasusThemeProvider.colorScheme.onBackgroundSecondary
        ),
        elevation = ButtonDefaults.elevation(1.dp),
        contentPadding = PaddingValues(),
        shape = PegasusThemeProvider.borderRadius.button,
        onClick = {}
    ) {


        Box(
            modifier = backgroundModifier
                .fillMaxWidth()
                .then(modifier),
            contentAlignment = Alignment.Center,
        ) {
            Row(
                horizontalArrangement = Arrangement.Center, modifier = modifier.padding(
                    horizontal = PegasusThemeProvider.spacing.spacing7,
                    vertical = PegasusThemeProvider.spacing.spacing4,
                )
            ) {
                PegasusActionButtonLoadingIcon()
            }
        }
    }
}

@Composable
fun PegasusActionButtonLoadingIcon(tint: Color = LocalContentColor.current.copy(alpha = LocalContentAlpha.current)) {
    val infiniteTransition = rememberInfiniteTransition(label = "")
    val rotation by infiniteTransition.animateFloat(
        initialValue = 0F,
        targetValue = 360F,
        animationSpec = infiniteRepeatable(
            animation = tween(1000, easing = LinearEasing),
        ), label = ""
    )
    Icon(
        imageVector = Icons.Rounded.Refresh,
        contentDescription = null,
        tint = tint,
        modifier = Modifier
            .padding(end = 4.dp)
            .graphicsLayer {
                rotationZ = rotation
            }
    )
}

@Composable
fun PegasusActionButtonIcon(
    imageVector: ImageVector,
    tint: Color = LocalContentColor.current.copy(alpha = LocalContentAlpha.current)
) {
    Icon(
        imageVector = imageVector,
        contentDescription = null,
        tint = tint,
        modifier = Modifier.padding(end = 4.dp)
    )
}


@Composable
fun RowScope.PegasusButtonText(
    description: String?,
    text: String,
    elementsColor: Color,
    fontWeight: FontWeight = FontWeight.Bold
) {
    val commonTextModifier = Modifier.Companion
        .padding(horizontal = 4.dp)
        .align(Alignment.CenterVertically)
        .semantics {
            description?.let {
                contentDescription = description
            }
        }

    Text(
        text = text, style = MaterialTheme.typography.bodyLarge.copy(
            color = elementsColor, fontWeight = fontWeight
        ), modifier = commonTextModifier
    )

}

//region Previews
@Composable
fun PegasusActionButtonPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = PegasusThemeProvider.colorScheme.background)
    ) {

        //Default Style
        Box(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing6)) {
            PegasusActionButton(text = stringResource(id = R.string.button_preview_text))
        }

        //Icon Left Style
        Box(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing6)) {
            PegasusActionButton(text = stringResource(id = R.string.button_preview_text), iconLeft = {
                PegasusActionButtonIcon(Icons.Rounded.ShoppingCart)
            })
        }

        //Icon Right Style
        Box(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing6)) {
            PegasusActionButton(text = stringResource(id = R.string.button_preview_text), iconRight = {
                PegasusActionButtonIcon(Icons.Rounded.ShoppingCart)
            })
        }

        //Loading Style
        var buttonStateForLoadingPreview by remember {
            mutableStateOf(PegasusActionButtonState.ENABLED)
        }

        Box(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing6)) {
            PegasusActionButton(text = stringResource(id = R.string.button_preview_text_loading),
                iconLeft = {
                    PegasusActionButtonIcon(imageVector = Icons.Rounded.Save)
                }, buttonState = buttonStateForLoadingPreview, onClickEnabled = {
                    buttonStateForLoadingPreview =
                        PegasusActionButtonState.LOADING
                }
            )
        }

        var buttonStateForDisablePreview by remember {
            mutableStateOf(PegasusActionButtonState.ENABLED)
        }

        //Disable Style
        Box(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing6)) {
            PegasusActionButton(
                text = stringResource(id = R.string.button_preview_text_disable),
                buttonState = buttonStateForDisablePreview,
                onClickEnabled = {
                    buttonStateForDisablePreview = PegasusActionButtonState.DISABLED
                }
            )
        }
    }
}


@Composable
@SofiaPreviews
@ShowkaseComposable(name = "Pegasus Action Button Sofia", group = "Buttons", defaultStyle = true)
fun PegasusActionButton_Sofia_Preview() {
    SofiaTheme {
        PegasusActionButtonPreview()
    }
}



@Composable
@SaraivaPreviews
@ShowkaseComposable(name = "Pegasus Action Button Saraiva", group = "Buttons", defaultStyle = true)
fun PegasusActionButton_Saraiva_Preview() {
    SaraivaTheme {
        PegasusActionButtonPreview()
    }
}


//endregion Previews