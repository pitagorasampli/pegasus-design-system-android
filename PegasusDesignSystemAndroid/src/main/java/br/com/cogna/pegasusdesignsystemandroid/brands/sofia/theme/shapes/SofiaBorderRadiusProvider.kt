package br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.shapes

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.tokens.SofiaBorderTokens
import br.com.cogna.pegasusdesignsystemandroid.components.shapes.PegasusBorderRadius

internal val sofiaBorderRadius = PegasusBorderRadius(
    extraSmall = RoundedCornerShape(SofiaBorderTokens.border_radius_xs),
    small = RoundedCornerShape(SofiaBorderTokens.border_radius_sm),
    medium = RoundedCornerShape(SofiaBorderTokens.border_radius_md),
    large = RoundedCornerShape(SofiaBorderTokens.border_radius_lg),
    extraLarge = RoundedCornerShape(SofiaBorderTokens.border_radius_ul),
    button = RoundedCornerShape(SofiaBorderTokens.border_radius_sm),
    card = RoundedCornerShape(SofiaBorderTokens.border_radius_sm),
    bottomSheet = RoundedCornerShape(
        topStart = SofiaBorderTokens.border_radius_sm,
        topEnd = SofiaBorderTokens.border_radius_sm,
        bottomStart = 0.dp,
        bottomEnd = 0.dp
    )
)
