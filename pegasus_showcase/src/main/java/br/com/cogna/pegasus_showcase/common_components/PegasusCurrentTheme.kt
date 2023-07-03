package br.com.cogna.pegasus_showcase.common_components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.theme.SaraivaTheme
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaTheme

@Composable
fun PegasusCurrentTheme(
    currentBrandTheme: String, darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true, content: @Composable () -> Unit
) {
    when (currentBrandTheme) {
        "Sofia" -> SofiaTheme(darkTheme, dynamicColor, content)
        "Saraiva" -> SaraivaTheme(darkTheme, dynamicColor, content)
    }
}