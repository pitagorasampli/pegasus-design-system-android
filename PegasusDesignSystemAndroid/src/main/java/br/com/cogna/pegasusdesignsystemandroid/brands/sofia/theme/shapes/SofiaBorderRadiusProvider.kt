package br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.shapes

import androidx.compose.foundation.shape.RoundedCornerShape
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.tokens.SofiaBorderTokens
import br.com.cogna.pegasusdesignsystemandroid.components.shapes.PegasusBorderRadius

internal val sofiaBorderRadius = PegasusBorderRadius(
    extraSmall = RoundedCornerShape(SofiaBorderTokens.border_radius_xs),
    small = RoundedCornerShape(SofiaBorderTokens.border_radius_sm),
    medium = RoundedCornerShape(SofiaBorderTokens.border_radius_md),
    large = RoundedCornerShape(SofiaBorderTokens.border_radius_lg),
    extraLarge = RoundedCornerShape(SofiaBorderTokens.border_radius_ul),
    button = RoundedCornerShape(SofiaBorderTokens.border_radius_sm),
    card = RoundedCornerShape(SofiaBorderTokens.border_radius_sm)
)