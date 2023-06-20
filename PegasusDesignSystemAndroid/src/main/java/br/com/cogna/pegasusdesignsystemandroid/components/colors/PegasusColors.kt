package br.com.cogna.pegasusdesignsystemandroid.components.colors


import androidx.compose.material3.ColorScheme
import androidx.compose.ui.graphics.Color

data class PegasusColorsScheme(
    val material: ColorScheme,
    val primaryDark: Color,
    val onPrimaryDark: Color,
    val primaryLight: Color,
    val onPrimaryLight: Color,
    val secondaryDark: Color,
    val onSecondaryDark: Color,
    val secondaryLight: Color,
    val onSecondaryLight: Color,
    val onBackgroundPrimary: Color,
    val onBackgroundSecondary: Color,
    val divider: Color,
    val stroke: Color,
    val backdrop: Color,

    val alertInfo: Color,
    val alertInfoContainer: Color,
    val onAlertInfo: Color,
    val onAlertInfoContainer: Color,
    val success: Color,
    val successContainer: Color,
    val onSuccess: Color,
    val onSuccessContainer: Color,
    val warning: Color,
    val onWarning: Color,
    val warningContainer: Color,
    val onWarningContainer: Color,
) {

    //Material 3 Colors

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
    val scrim: Color get() = material.scrim
}