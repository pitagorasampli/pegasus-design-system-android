package br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.theme.shapes

import androidx.compose.foundation.shape.RoundedCornerShape
import br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.tokens.SaraivaBorderTokens
import br.com.cogna.pegasusdesignsystemandroid.components.shapes.PegasusBorderRadius

internal val saraivaBorderRadius = PegasusBorderRadius(
    extraSmall = RoundedCornerShape(SaraivaBorderTokens.border_radius_xs),
    small = RoundedCornerShape(SaraivaBorderTokens.border_radius_sm),
    medium = RoundedCornerShape(SaraivaBorderTokens.border_radius_md),
    large = RoundedCornerShape(SaraivaBorderTokens.border_radius_lg),
    extraLarge = RoundedCornerShape(SaraivaBorderTokens.border_radius_ul),
    button = RoundedCornerShape(SaraivaBorderTokens.border_radius_xs),
    card = RoundedCornerShape(SaraivaBorderTokens.border_radius_xs)
)