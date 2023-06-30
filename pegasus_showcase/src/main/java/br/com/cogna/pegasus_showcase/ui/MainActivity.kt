package br.com.cogna.pegasus_showcase.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import br.com.cogna.pegasus_showcase.screens.PegasusShowcaseNavHost
import br.com.cogna.pegasusdesignsystemandroid.components.theme.PegasusBrandThemesProvider
import br.com.cogna.pegasusdesignsystemandroid.components.theme.PegasusTheme

class MainActivity : ComponentActivity() {

    private var currentTheme: String by mutableStateOf("Sofia")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PegasusTheme {
                PegasusShowcaseNavHost(
                    currentTheme = currentTheme,
                    brandList = PegasusBrandThemesProvider.brandList,
                    onChangeTheme = {
                        onChangeTheme(it)
                    })
            }
        }
    }

    private fun onChangeTheme(theme: String) {
        currentTheme = theme
    }

}

