package br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import br.com.cogna.pegasusdesignsystemandroid.components.theme.md_theme_light_inversePrimary
import br.com.cogna.pegasusdesignsystemandroid.components.theme.md_theme_light_inverseSurface
import br.com.cogna.pegasusdesignsystemandroid.components.theme.md_theme_light_outlineVariant
import br.com.cogna.pegasusdesignsystemandroid.components.theme.md_theme_light_scrim
import br.com.cogna.pegasusdesignsystemandroid.components.theme.md_theme_light_surfaceTint
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.SofiaSchemes
import br.com.cogna.pegasusdesignsystemandroid.components.colors.PegasusColorsScheme



//Material 3 colors for SofiaLightScheme
private val sofiaLightScheme = lightColorScheme(
    primary = SofiaSchemes.sofia_color_light_brand_primary_main,
    onPrimary = SofiaSchemes.sofia_color_light_brand_on_primary_main,
    primaryContainer = SofiaSchemes.sofia_color_light_brand_primary_container,
    onPrimaryContainer = SofiaSchemes.sofia_color_light_brand_on_primary_container,
    secondary = SofiaSchemes.sofia_color_light_brand_secondary_main,
    onSecondary = SofiaSchemes.sofia_color_light_brand_on_secondary_main,
    secondaryContainer = SofiaSchemes.sofia_color_light_brand_secondary_container,
    onSecondaryContainer = SofiaSchemes.sofia_color_light_brand_on_secondary_container,
    tertiary = SofiaSchemes.sofia_color_light_brand_secondary_main,
    onTertiary = SofiaSchemes.sofia_color_light_brand_on_secondary_main,
    tertiaryContainer = SofiaSchemes.sofia_color_light_brand_secondary_container,
    onTertiaryContainer = SofiaSchemes.sofia_color_light_brand_on_secondary_container,
    error = SofiaSchemes.sofia_color_light_alert_error,
    errorContainer = SofiaSchemes.sofia_color_light_alert_error_container,
    onError = SofiaSchemes.sofia_color_light_alert_on_error,
    onErrorContainer = SofiaSchemes.sofia_color_light_alert_on_error_container,
    background = SofiaSchemes.sofia_color_light_neutral_background,
    onBackground = SofiaSchemes.sofia_color_light_neutral_on_background_primary,
    surface = SofiaSchemes.sofia_color_light_neutral_surface,
    onSurface = SofiaSchemes.sofia_color_light_neutral_on_surface,
    surfaceVariant = SofiaSchemes.sofia_color_light_neutral_on_surface,
    onSurfaceVariant = SofiaSchemes.sofia_color_light_neutral_on_surface,
    outline = SofiaSchemes.sofia_color_light_brand_primary_main,
    inverseOnSurface = SofiaSchemes.sofia_color_light_neutral_surface
)

internal val sofiaLightSchemeColors = PegasusColorsScheme(
    material = sofiaLightScheme,
    primaryDark = SofiaSchemes.sofia_color_light_brand_primary_dark,
    onPrimaryDark = SofiaSchemes.sofia_color_light_brand_on_primary_dark,
    primaryLight = SofiaSchemes.sofia_color_light_brand_primary_light,
    onPrimaryLight = SofiaSchemes.sofia_color_light_brand_on_primary_light,
    backdrop = SofiaSchemes.sofia_color_light_others_backdrop,
    divider = SofiaSchemes.sofia_color_light_others_divider,
    stroke = SofiaSchemes.sofia_color_light_others_stroke,
    secondaryDark = SofiaSchemes.sofia_color_light_brand_secondary_dark,
    onSecondaryDark = SofiaSchemes.sofia_color_light_brand_on_secondary_dark,
    secondaryLight = SofiaSchemes.sofia_color_light_brand_secondary_light,
    onSecondaryLight = SofiaSchemes.sofia_color_light_brand_on_secondary_light,

    alertInfo = SofiaSchemes.sofia_color_light_alert_info,
    onAlertInfo = SofiaSchemes.sofia_color_light_alert_on_info,
    alertInfoContainer = SofiaSchemes.sofia_color_light_alert_info_container,
    onAlertInfoContainer = SofiaSchemes.sofia_color_light_alert_on_info_container,
    warning = SofiaSchemes.sofia_color_light_alert_warning,
    warningContainer = SofiaSchemes.sofia_color_light_alert_warning_container,
    onWarning = SofiaSchemes.sofia_color_light_alert_on_warning,
    onWarningContainer = SofiaSchemes.sofia_color_light_alert_on_warning_container,
    success = SofiaSchemes.sofia_color_light_alert_success,
    successContainer = SofiaSchemes.sofia_color_light_alert_success_container,
    onSuccess = SofiaSchemes.sofia_color_light_alert_on_success,
    onSuccessContainer = SofiaSchemes.sofia_color_light_alert_on_success_container,
    onBackgroundPrimary = SofiaSchemes.sofia_color_light_neutral_on_background_primary,
    onBackgroundSecondary = SofiaSchemes.sofia_color_light_neutral_on_background_secondary,
)





private val sofiaDarkScheme = darkColorScheme(
    primary = SofiaSchemes.sofia_color_light_brand_primary_main,
    onPrimary = SofiaSchemes.sofia_color_light_brand_on_primary_main,
    primaryContainer = SofiaSchemes.sofia_color_light_brand_primary_container,
    onPrimaryContainer = SofiaSchemes.sofia_color_light_brand_on_primary_container,
    secondary = SofiaSchemes.sofia_color_light_brand_secondary_main,
    onSecondary = SofiaSchemes.sofia_color_light_brand_on_secondary_main,
    secondaryContainer = SofiaSchemes.sofia_color_light_brand_secondary_container,
    onSecondaryContainer = SofiaSchemes.sofia_color_light_brand_on_secondary_container,
    tertiary = SofiaSchemes.sofia_color_light_brand_secondary_main,
    onTertiary = SofiaSchemes.sofia_color_light_brand_on_secondary_main,
    tertiaryContainer = SofiaSchemes.sofia_color_light_brand_secondary_container,
    onTertiaryContainer = SofiaSchemes.sofia_color_light_brand_on_secondary_container,
    error = SofiaSchemes.sofia_color_light_alert_error,
    errorContainer = SofiaSchemes.sofia_color_light_alert_error_container,
    onError = SofiaSchemes.sofia_color_light_alert_on_error,
    onErrorContainer = SofiaSchemes.sofia_color_light_alert_on_error_container,
    background = SofiaSchemes.sofia_color_light_neutral_background,
    onBackground = SofiaSchemes.sofia_color_light_neutral_on_background_primary,
    surface = SofiaSchemes.sofia_color_light_neutral_surface,
    onSurface = SofiaSchemes.sofia_color_light_neutral_on_surface,
    surfaceVariant = SofiaSchemes.sofia_color_light_neutral_on_surface,
    onSurfaceVariant = SofiaSchemes.sofia_color_light_neutral_on_surface,
    outline = SofiaSchemes.sofia_color_light_brand_primary_main,
    inverseOnSurface = SofiaSchemes.sofia_color_light_neutral_surface,
    inverseSurface = md_theme_light_inverseSurface,
    inversePrimary = md_theme_light_inversePrimary,
    surfaceTint = md_theme_light_surfaceTint,
    outlineVariant = md_theme_light_outlineVariant,
    scrim = md_theme_light_scrim,
)


internal val sofiaDarkSchemeColors = PegasusColorsScheme(
    material = sofiaDarkScheme,
    primaryDark = SofiaSchemes.sofia_color_light_brand_primary_dark,
    onPrimaryDark = SofiaSchemes.sofia_color_light_brand_on_primary_dark,
    primaryLight = SofiaSchemes.sofia_color_light_brand_primary_light,
    onPrimaryLight = SofiaSchemes.sofia_color_light_brand_on_primary_light,
    backdrop = SofiaSchemes.sofia_color_light_others_backdrop,
    divider = SofiaSchemes.sofia_color_light_others_divider,
    stroke = SofiaSchemes.sofia_color_light_others_stroke,
    secondaryDark = SofiaSchemes.sofia_color_light_brand_secondary_dark,
    onSecondaryDark = SofiaSchemes.sofia_color_light_brand_on_secondary_dark,
    secondaryLight = SofiaSchemes.sofia_color_light_brand_secondary_light,
    onSecondaryLight = SofiaSchemes.sofia_color_light_brand_on_secondary_light,

    alertInfo = SofiaSchemes.sofia_color_light_alert_info,
    onAlertInfo = SofiaSchemes.sofia_color_light_alert_on_info,
    alertInfoContainer = SofiaSchemes.sofia_color_light_alert_info_container,
    onAlertInfoContainer = SofiaSchemes.sofia_color_light_alert_on_info_container,
    warning = SofiaSchemes.sofia_color_light_alert_warning,
    warningContainer = SofiaSchemes.sofia_color_light_alert_warning_container,
    onWarning = SofiaSchemes.sofia_color_light_alert_on_warning,
    onWarningContainer = SofiaSchemes.sofia_color_light_alert_on_warning_container,
    success = SofiaSchemes.sofia_color_light_alert_success,
    successContainer = SofiaSchemes.sofia_color_light_alert_success_container,
    onSuccess = SofiaSchemes.sofia_color_light_alert_on_success,
    onSuccessContainer = SofiaSchemes.sofia_color_light_alert_on_success_container,
    onBackgroundPrimary = SofiaSchemes.sofia_color_light_neutral_on_background_primary,
    onBackgroundSecondary = SofiaSchemes.sofia_color_light_neutral_on_background_secondary,
)