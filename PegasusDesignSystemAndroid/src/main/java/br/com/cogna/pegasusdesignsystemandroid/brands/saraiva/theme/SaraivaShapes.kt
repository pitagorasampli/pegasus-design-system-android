package br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.SofiaBorders

val saraivaShapes = Shapes(
    // Shapes None and Full are omitted as None is a RectangleShape and Full is a CircleShape.
    extraSmall = RoundedCornerShape(SofiaBorders.border_radius_xs),
    small = RoundedCornerShape(SofiaBorders.border_radius_sm),
    medium = RoundedCornerShape(SofiaBorders.border_radius_md),
    large = RoundedCornerShape(SofiaBorders.border_radius_lg),
    extraLarge = RoundedCornerShape(SofiaBorders.border_radius_ul),
)