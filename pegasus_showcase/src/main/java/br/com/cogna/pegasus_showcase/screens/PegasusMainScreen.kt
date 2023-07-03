package br.com.cogna.pegasus_showcase.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.cogna.pegasus_showcase.common_components.PegasusThemeTopBar
import br.com.cogna.pegasus_showcase.navigation.PegasusScreen
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
                PegasusShowcaseMainScreen {
                    navController.navigate(PegasusScreen.Buttons.route)
                }
            }
            composable(PegasusScreen.Buttons.route) {
                PegasusButtonsScreen(currentTheme)
            }
        }
    })
}



@Composable
fun PegasusShowcaseMainScreen(onNavigateToButtonScreen: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
    ) {
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable { onNavigateToButtonScreen() }) {

            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = stringResource(id = R.string.screen_buttons),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    }
}