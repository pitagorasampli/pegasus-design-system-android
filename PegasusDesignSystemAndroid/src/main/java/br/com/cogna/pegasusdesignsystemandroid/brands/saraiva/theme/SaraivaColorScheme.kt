package br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.tokens.SaraivaColorSchemesTokens
import br.com.cogna.pegasusdesignsystemandroid.components.colors.PegasusColorsScheme
import br.com.cogna.pegasusdesignsystemandroid.components.theme.md_theme_light_inversePrimary
import br.com.cogna.pegasusdesignsystemandroid.components.theme.md_theme_light_inverseSurface
import br.com.cogna.pegasusdesignsystemandroid.components.theme.md_theme_light_outlineVariant
import br.com.cogna.pegasusdesignsystemandroid.components.theme.md_theme_light_scrim
import br.com.cogna.pegasusdesignsystemandroid.components.theme.md_theme_light_surfaceTint


//Material 3 colors for SaraivaLightScheme
private val saraivaLightScheme = lightColorScheme(
    primary = SaraivaColorSchemesTokens.saraiva_color_light_brand_primary_main,
    onPrimary = SaraivaColorSchemesTokens.saraiva_color_light_brand_on_primary_main,
    primaryContainer = SaraivaColorSchemesTokens.saraiva_color_light_brand_primary_container,
    onPrimaryContainer = SaraivaColorSchemesTokens.saraiva_color_light_brand_on_primary_container,
    secondary = SaraivaColorSchemesTokens.saraiva_color_light_brand_secondary_main,
    onSecondary = SaraivaColorSchemesTokens.saraiva_color_light_brand_on_secondary_main,
    secondaryContainer = SaraivaColorSchemesTokens.saraiva_color_light_brand_secondary_container,
    onSecondaryContainer = SaraivaColorSchemesTokens.saraiva_color_light_brand_on_secondary_container,
    tertiary = SaraivaColorSchemesTokens.saraiva_color_light_brand_secondary_main,
    onTertiary = SaraivaColorSchemesTokens.saraiva_color_light_brand_on_secondary_main,
    tertiaryContainer = SaraivaColorSchemesTokens.saraiva_color_light_brand_secondary_container,
    onTertiaryContainer = SaraivaColorSchemesTokens.saraiva_color_light_brand_on_secondary_container,
    error = SaraivaColorSchemesTokens.saraiva_color_light_alert_error,
    errorContainer = SaraivaColorSchemesTokens.saraiva_color_light_alert_error_container,
    onError = SaraivaColorSchemesTokens.saraiva_color_light_alert_on_error,
    onErrorContainer = SaraivaColorSchemesTokens.saraiva_color_light_alert_on_error_container,
    background = SaraivaColorSchemesTokens.saraiva_color_light_neutral_background,
    onBackground = SaraivaColorSchemesTokens.saraiva_color_light_neutral_on_background_primary,
    surface = SaraivaColorSchemesTokens.saraiva_color_light_neutral_surface,
    onSurface = SaraivaColorSchemesTokens.saraiva_color_light_neutral_on_surface,
    surfaceVariant = SaraivaColorSchemesTokens.saraiva_color_light_neutral_on_surface,
    onSurfaceVariant = SaraivaColorSchemesTokens.saraiva_color_light_neutral_on_surface,
    outline = SaraivaColorSchemesTokens.saraiva_color_light_brand_primary_main,
    inverseOnSurface = SaraivaColorSchemesTokens.saraiva_color_light_neutral_surface
)

internal val saraivaLightSchemeColors = PegasusColorsScheme(
    material = saraivaLightScheme,
    primaryDark = SaraivaColorSchemesTokens.saraiva_color_light_brand_primary_dark,
    onPrimaryDark = SaraivaColorSchemesTokens.saraiva_color_light_brand_on_primary_dark,
    primaryLight = SaraivaColorSchemesTokens.saraiva_color_light_brand_primary_light,
    onPrimaryLight = SaraivaColorSchemesTokens.saraiva_color_light_brand_on_primary_light,
    backdrop = SaraivaColorSchemesTokens.saraiva_color_light_others_backdrop,
    divider = SaraivaColorSchemesTokens.saraiva_color_light_others_divider,
    stroke = SaraivaColorSchemesTokens.saraiva_color_light_others_stroke,
    secondaryDark = SaraivaColorSchemesTokens.saraiva_color_light_brand_secondary_dark,
    onSecondaryDark = SaraivaColorSchemesTokens.saraiva_color_light_brand_on_secondary_dark,
    secondaryLight = SaraivaColorSchemesTokens.saraiva_color_light_brand_secondary_light,
    onSecondaryLight = SaraivaColorSchemesTokens.saraiva_color_light_brand_on_secondary_light,

    alertInfo = SaraivaColorSchemesTokens.saraiva_color_light_alert_info,
    onAlertInfo = SaraivaColorSchemesTokens.saraiva_color_light_alert_on_info,
    alertInfoContainer = SaraivaColorSchemesTokens.saraiva_color_light_alert_info_container,
    onAlertInfoContainer = SaraivaColorSchemesTokens.saraiva_color_light_alert_on_info_container,
    warning = SaraivaColorSchemesTokens.saraiva_color_light_alert_warning,
    warningContainer = SaraivaColorSchemesTokens.saraiva_color_light_alert_warning_container,
    onWarning = SaraivaColorSchemesTokens.saraiva_color_light_alert_on_warning,
    onWarningContainer = SaraivaColorSchemesTokens.saraiva_color_light_alert_on_warning_container,
    success = SaraivaColorSchemesTokens.saraiva_color_light_alert_success,
    successContainer = SaraivaColorSchemesTokens.saraiva_color_light_alert_success_container,
    onSuccess = SaraivaColorSchemesTokens.saraiva_color_light_alert_on_success,
    onSuccessContainer = SaraivaColorSchemesTokens.saraiva_color_light_alert_on_success_container,
    onBackgroundPrimary = SaraivaColorSchemesTokens.saraiva_color_light_neutral_on_background_primary,
    onBackgroundSecondary = SaraivaColorSchemesTokens.saraiva_color_light_neutral_on_background_secondary,
)





private val saraivaDarkScheme = darkColorScheme(
    primary = SaraivaColorSchemesTokens.saraiva_color_light_brand_primary_main,
    onPrimary = SaraivaColorSchemesTokens.saraiva_color_light_brand_on_primary_main,
    primaryContainer = SaraivaColorSchemesTokens.saraiva_color_light_brand_primary_container,
    onPrimaryContainer = SaraivaColorSchemesTokens.saraiva_color_light_brand_on_primary_container,
    secondary = SaraivaColorSchemesTokens.saraiva_color_light_brand_secondary_main,
    onSecondary = SaraivaColorSchemesTokens.saraiva_color_light_brand_on_secondary_main,
    secondaryContainer = SaraivaColorSchemesTokens.saraiva_color_light_brand_secondary_container,
    onSecondaryContainer = SaraivaColorSchemesTokens.saraiva_color_light_brand_on_secondary_container,
    tertiary = SaraivaColorSchemesTokens.saraiva_color_light_brand_secondary_main,
    onTertiary = SaraivaColorSchemesTokens.saraiva_color_light_brand_on_secondary_main,
    tertiaryContainer = SaraivaColorSchemesTokens.saraiva_color_light_brand_secondary_container,
    onTertiaryContainer = SaraivaColorSchemesTokens.saraiva_color_light_brand_on_secondary_container,
    error = SaraivaColorSchemesTokens.saraiva_color_light_alert_error,
    errorContainer = SaraivaColorSchemesTokens.saraiva_color_light_alert_error_container,
    onError = SaraivaColorSchemesTokens.saraiva_color_light_alert_on_error,
    onErrorContainer = SaraivaColorSchemesTokens.saraiva_color_light_alert_on_error_container,
    background = SaraivaColorSchemesTokens.saraiva_color_light_neutral_background,
    onBackground = SaraivaColorSchemesTokens.saraiva_color_light_neutral_on_background_primary,
    surface = SaraivaColorSchemesTokens.saraiva_color_light_neutral_surface,
    onSurface = SaraivaColorSchemesTokens.saraiva_color_light_neutral_on_surface,
    surfaceVariant = SaraivaColorSchemesTokens.saraiva_color_light_neutral_on_surface,
    onSurfaceVariant = SaraivaColorSchemesTokens.saraiva_color_light_neutral_on_surface,
    outline = SaraivaColorSchemesTokens.saraiva_color_light_brand_primary_main,
    inverseOnSurface = SaraivaColorSchemesTokens.saraiva_color_light_neutral_surface,
    inverseSurface = md_theme_light_inverseSurface,
    inversePrimary = md_theme_light_inversePrimary,
    surfaceTint = md_theme_light_surfaceTint,
    outlineVariant = md_theme_light_outlineVariant,
    scrim = md_theme_light_scrim,
)


internal val saraivaDarkSchemeColors = PegasusColorsScheme(
    material = saraivaDarkScheme,
    primaryDark = SaraivaColorSchemesTokens.saraiva_color_light_brand_primary_dark,
    onPrimaryDark = SaraivaColorSchemesTokens.saraiva_color_light_brand_on_primary_dark,
    primaryLight = SaraivaColorSchemesTokens.saraiva_color_light_brand_primary_light,
    onPrimaryLight = SaraivaColorSchemesTokens.saraiva_color_light_brand_on_primary_light,
    backdrop = SaraivaColorSchemesTokens.saraiva_color_light_others_backdrop,
    divider = SaraivaColorSchemesTokens.saraiva_color_light_others_divider,
    stroke = SaraivaColorSchemesTokens.saraiva_color_light_others_stroke,
    secondaryDark = SaraivaColorSchemesTokens.saraiva_color_light_brand_secondary_dark,
    onSecondaryDark = SaraivaColorSchemesTokens.saraiva_color_light_brand_on_secondary_dark,
    secondaryLight = SaraivaColorSchemesTokens.saraiva_color_light_brand_secondary_light,
    onSecondaryLight = SaraivaColorSchemesTokens.saraiva_color_light_brand_on_secondary_light,

    alertInfo = SaraivaColorSchemesTokens.saraiva_color_light_alert_info,
    onAlertInfo = SaraivaColorSchemesTokens.saraiva_color_light_alert_on_info,
    alertInfoContainer = SaraivaColorSchemesTokens.saraiva_color_light_alert_info_container,
    onAlertInfoContainer = SaraivaColorSchemesTokens.saraiva_color_light_alert_on_info_container,
    warning = SaraivaColorSchemesTokens.saraiva_color_light_alert_warning,
    warningContainer = SaraivaColorSchemesTokens.saraiva_color_light_alert_warning_container,
    onWarning = SaraivaColorSchemesTokens.saraiva_color_light_alert_on_warning,
    onWarningContainer = SaraivaColorSchemesTokens.saraiva_color_light_alert_on_warning_container,
    success = SaraivaColorSchemesTokens.saraiva_color_light_alert_success,
    successContainer = SaraivaColorSchemesTokens.saraiva_color_light_alert_success_container,
    onSuccess = SaraivaColorSchemesTokens.saraiva_color_light_alert_on_success,
    onSuccessContainer = SaraivaColorSchemesTokens.saraiva_color_light_alert_on_success_container,
    onBackgroundPrimary = SaraivaColorSchemesTokens.saraiva_color_light_neutral_on_background_primary,
    onBackgroundSecondary = SaraivaColorSchemesTokens.saraiva_color_light_neutral_on_background_secondary,
)