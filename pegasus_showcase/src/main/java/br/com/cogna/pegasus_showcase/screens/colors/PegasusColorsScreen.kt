package br.com.cogna.pegasus_showcase.screens.colors

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.cogna.pegasus_showcase.common_components.PegasusCurrentTheme
import br.com.cogna.pegasusdesignsystemandroid.components.text.PegasusUIText
import br.com.cogna.pegasusdesignsystemandroid.components.theme.PegasusThemeProvider
import okhttp3.internal.toHexString

data class ColorScreen(
    val colorName: String,
    val color: Color,
    val onColor: Color?,
    val onColorName: String?,
) {
    private val fullColorName = "${colorName} : ${color.toArgb().toHexString()}"
    private val onColorFullName = if (onColor != null) {
        "$onColorName : ${onColor.toArgb().toHexString()}"
    } else {
        null
    }

    val fullName = if (onColorFullName != null) {
        fullColorName + "\n\n" + onColorFullName
    } else {
        fullColorName
    }
}

@Composable
fun PegasusColorsScreen(currentBrand: String) {

    PegasusCurrentTheme(currentBrandTheme = currentBrand) {
        val colorScreenList = getColorScreenList()

        LazyVerticalGrid(columns = GridCells.Adaptive(132.dp), contentPadding = PaddingValues(
            start = 12.dp,
            top = 16.dp,
            end = 12.dp,
            bottom = 16.dp
        ), content = {
            items(colorScreenList.size) { index ->
                Card(
                    backgroundColor = colorScreenList[index].color,
                    modifier = Modifier
                        .padding(4.dp)
                        .fillMaxWidth(),
                    elevation = 8.dp,
                ) {
                    PegasusUIText(
                        text = colorScreenList[index].fullName,
                        modifier = Modifier.padding(16.dp),
                        color = colorScreenList[index].onColor
                            ?: PegasusThemeProvider.colorScheme.onBackground,
                        textStyle = MaterialTheme.typography.titleMedium
                    )
                }
            }
        })

    }


    /* val colors = listOf(PegasusThemeProvider.)
     val primary: Color get() = material.primary
     val onPrimary: Color get() = material.onPrimary
     val primaryContainer: Color get() = material.primaryContainer
     val onPrimaryContainer: Color get() = material.onPrimaryContainer
     val secondary: Color get() = material.secondary
     val onSecondary: Color get() = material.onSecondary
     val secondaryContainer: Color get() = material.secondaryContainer
     val onSecondaryContainer: Color get() = material.onSecondaryContainer
     val tertiary: Color get() = material.tertiary
     val onTertiary: Color get() = material.onTertiary
     val tertiaryContainer: Color get() = material.tertiaryContainer
     val onTertiaryContainer: Color get() = material.onTertiaryContainer
     val error: Color get() = material.error
     val errorContainer: Color get() = material.errorContainer
     val onError: Color get() = material.onError
     val onErrorContainer: Color get() = material.onErrorContainer
     val background: Color get() = material.background
     val onBackground: Color get() = material.onBackground
     val surface: Color get() = material.surface
     val onSurface: Color get() = material.onSurface
     val surfaceVariant: Color get() = material.surfaceVariant
     val onSurfaceVariant: Color get() = material.onSurfaceVariant
     val outline: Color get() = material.outline
     val inverseOnSurface: Color get() = material.inverseOnSurface
     val inverseSurface: Color get() = material.inverseSurface
     val inversePrimary: Color get() = material.inversePrimary
     val surfaceTint: Color get() = material.surfaceTint
     val outlineVariant: Color get() = material.outlineVariant
     val scrim: Color get() = material.scrim*/

}

@Composable
private fun getColorScreenList(): List<ColorScreen> {
    return listOf(
        ColorScreen(
            colorName = "Primary",
            color = PegasusThemeProvider.colorScheme.primary,
            onColor = PegasusThemeProvider.colorScheme.onPrimary,
            onColorName = "onPrimary",
        ),
        ColorScreen(
            colorName = "PrimaryDark",
            color = PegasusThemeProvider.colorScheme.primaryDark,
            onColor = PegasusThemeProvider.colorScheme.onPrimaryDark,
            onColorName = "onPrimaryDark",
        ),
        ColorScreen(
            colorName = "PrimaryLight",
            color = PegasusThemeProvider.colorScheme.primaryLight,
            onColor = PegasusThemeProvider.colorScheme.onPrimaryLight,
            onColorName = "onPrimaryLight",
        ),
        ColorScreen(
            colorName = "Secondary",
            color = PegasusThemeProvider.colorScheme.secondary,
            onColor = PegasusThemeProvider.colorScheme.onSecondary,
            onColorName = "onSecondary",
        ),
        ColorScreen(
            colorName = "Tertiary",
            color = PegasusThemeProvider.colorScheme.tertiary,
            onColor = PegasusThemeProvider.colorScheme.onTertiary,
            onColorName = "onTertiary",
        ),

        ColorScreen(
            colorName = "Surface",
            color = PegasusThemeProvider.colorScheme.surface,
            onColor = PegasusThemeProvider.colorScheme.onSurface,
            onColorName = "onSurface",
        ),
        ColorScreen(
            colorName = "Background",
            color = PegasusThemeProvider.colorScheme.background,
            onColor = PegasusThemeProvider.colorScheme.onBackground,
            onColorName = "onBackground",
        ),
        ColorScreen(
            colorName = "Error",
            color = PegasusThemeProvider.colorScheme.error,
            onColor = PegasusThemeProvider.colorScheme.onError,
            onColorName = "onError",
        ),
        ColorScreen(
            colorName = "Success",
            color = PegasusThemeProvider.colorScheme.success,
            onColor = PegasusThemeProvider.colorScheme.onSuccess,
            onColorName = "onSuccess",
        ),
        ColorScreen(
            colorName = "SuccessContainer",
            color = PegasusThemeProvider.colorScheme.successContainer,
            onColor = PegasusThemeProvider.colorScheme.onSuccessContainer,
            onColorName = "onSuccessContainer",
        ),
        ColorScreen(
            colorName = "Divider",
            color = PegasusThemeProvider.colorScheme.divider,
            onColor = null,
            onColorName = null,
        ),

        )
}

@Preview
@Composable
fun PegasusColorsScreen_Preview() {
    PegasusColorsScreen(currentBrand = "Sofia")
}