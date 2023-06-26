package br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.shapes

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.tokens.SofiaBorderTokens

val sofiaShapes = Shapes(
    // Shapes None and Full are omitted as None is a RectangleShape and Full is a CircleShape.
    extraSmall = RoundedCornerShape(SofiaBorderTokens.border_radius_xs),
    small = RoundedCornerShape(SofiaBorderTokens.border_radius_sm),
    medium = RoundedCornerShape(SofiaBorderTokens.border_radius_md),
    large = RoundedCornerShape(SofiaBorderTokens.border_radius_lg),
    extraLarge = RoundedCornerShape(SofiaBorderTokens.border_radius_ul),
)

