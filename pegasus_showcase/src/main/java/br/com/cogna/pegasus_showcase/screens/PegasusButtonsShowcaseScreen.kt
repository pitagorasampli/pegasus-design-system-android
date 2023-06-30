package br.com.cogna.pegasus_showcase.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Save
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.theme.SaraivaTheme
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaTheme
import br.com.cogna.pegasusdesignsystemandroid.components.button.PegasusActionButton
import br.com.cogna.pegasusdesignsystemandroid.components.button.PegasusActionButtonIcon
import br.com.cogna.pegasusdesignsystemandroid.components.button.PegasusActionButtonState
import br.com.cogna.pegasusdesignsystemandroid.components.theme.PegasusThemeProvider

@Composable
fun CurrentTheme(
    currentBrandTheme: String, darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true, content: @Composable () -> Unit
) {
    when (currentBrandTheme) {
        "Sofia" -> SofiaTheme(darkTheme, dynamicColor, content)
        "Saraiva" -> SaraivaTheme(darkTheme, dynamicColor, content)
    }
}

@Composable
fun PegasusButtonsScreen(currentBrandTheme: String) {
    CurrentTheme(currentBrandTheme) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .background(color = PegasusThemeProvider.colorScheme.background)
        ) {

            //Default Style
            Box(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing6)) {
                PegasusActionButton(text = "Default Style")
            }

            //Icon Left Style
            Box(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing6)) {
                PegasusActionButton(text = "With Icon Left", iconLeft = {
                    PegasusActionButtonIcon(Icons.Rounded.ShoppingCart)
                })
            }

            //Icon Right Style
            Box(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing6)) {
                PegasusActionButton(text = "With Icon Right", iconRight = {
                    PegasusActionButtonIcon(Icons.Rounded.ShoppingCart)
                })
            }

            //Loading Style
            var buttonStateForLoadingPreview by remember {
                mutableStateOf(PegasusActionButtonState.ENABLED)
            }

            Box(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing6)) {
                PegasusActionButton(text = "Click me to start Loading",
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
                    text = "Click me to disable",
                    buttonState = buttonStateForDisablePreview,
                    onClickEnabled = {
                        buttonStateForDisablePreview = PegasusActionButtonState.DISABLED
                    }
                )
            }


        }
    }

}