package br.com.cogna.pegasus_showcase.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.cogna.pegasus_showcase.common_components.PegasusComponentTitleDivider
import br.com.cogna.pegasus_showcase.common_components.PegasusMainScreenCard
import br.com.cogna.pegasus_showcase.common_components.PegasusThemeTopBar
import br.com.cogna.pegasus_showcase.navigation.PegasusScreen
import br.com.cogna.pegasus_showcase.screens.buttons.PegasusButtonActionScreen
import br.com.cogna.pegasus_showcase.screens.buttons.PegasusButtonTextScreen
import br.com.cogna.pegasus_showcase.screens.buttons.PegasusButtonsScreen
import br.com.cogna.pegasus_showcase.screens.colors.PegasusColorsScreen
import br.com.cogna.pegasus_showcase.screens.typography.PegasusTypographyScreen
import br.com.cogna.ui.pegasus_showcase.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PegasusShowcaseNavHost(
    currentTheme: String,
    modifier: Modifier = Modifier,
    brandList: List<String>,
    onChangeTheme: (String) -> Unit,
    navController: NavHostController = rememberNavController(),
    startDestination: String = PegasusScreen.Main.route
) {
    Scaffold(topBar = {
        PegasusThemeTopBar(brandList = brandList, onChangeTheme = onChangeTheme)
    }, content = { innerPadding ->
        NavHost(
            modifier = modifier.padding(innerPadding),
            navController = navController,
            startDestination = startDestination
        ) {
            composable(PegasusScreen.Main.route) {
                PegasusShowcaseMainScreen(

                    onNavigateToButtonScreen = { navController.navigate(PegasusScreen.Buttons.route) },
                    onNavigateToTypography = { navController.navigate(PegasusScreen.Typography.route) },
                    onNavigateToColors = { navController.navigate(PegasusScreen.Colors.route) }

                )
            }
            composable(PegasusScreen.Buttons.route) {
                PegasusButtonsScreen(currentTheme, onNavigateToActionButtons = {
                    navController.navigate(PegasusScreen.ButtonAction.route)
                }, onNavigateToTextButtons = {
                    navController.navigate(PegasusScreen.ButtonText.route)
                })
            }

            composable(PegasusScreen.Typography.route) {
                PegasusTypographyScreen(currentTheme)
            }
            composable(PegasusScreen.Colors.route) {
                PegasusColorsScreen(currentTheme)
            }

            composable(PegasusScreen.ButtonAction.route) {
                PegasusButtonActionScreen(currentBrandTheme = currentTheme)
            }
            composable(PegasusScreen.ButtonText.route) {
                PegasusButtonTextScreen(currentBrandTheme = currentTheme)
            }
        }
    })
}


@Composable
fun PegasusShowcaseMainScreen(
    onNavigateToButtonScreen: () -> Unit,
    onNavigateToTypography: () -> Unit,
    onNavigateToColors: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
    ) {
        PegasusComponentTitleDivider(text = stringResource(id = R.string.screen_buttons))

        PegasusMainScreenCard(
            cardTitle = stringResource(id = R.string.screen_buttons),
            onClickCard = onNavigateToButtonScreen
        )

        PegasusComponentTitleDivider(text = stringResource(id = R.string.screen_typography))

        PegasusMainScreenCard(
            cardTitle = stringResource(id = R.string.screen_typography),
            onClickCard = onNavigateToTypography
        )

        PegasusComponentTitleDivider(text = stringResource(id = R.string.screen_colors))

        PegasusMainScreenCard(
            cardTitle = stringResource(id = R.string.screen_colors),
            onClickCard = onNavigateToColors
        )

    }
}