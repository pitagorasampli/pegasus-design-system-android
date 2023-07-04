package br.com.cogna.pegasusdesignsystemandroid.components.shadow

import android.graphics.BlurMaskFilter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class PegasusShadowProperties(
    val offsetX: Dp, val offsetY: Dp, val blur: Dp, val color: Color
)

fun Modifier.pegasusShadow(
    properties: PegasusShadowProperties
) = this.shadow(properties.color, properties.offsetX, properties.offsetY, properties.blur)

fun Modifier.shadow(
    color: Color = Color.Black,
    offsetX: Dp = 0.dp,
    offsetY: Dp = 0.dp,
    blurRadius: Dp = 0.dp,
) = then(drawBehind {
    drawIntoCanvas { canvas ->
        val paint = Paint()
        val frameworkPaint = paint.asFrameworkPaint()
        if (blurRadius != 0.dp) {
            frameworkPaint.maskFilter =
                (BlurMaskFilter(blurRadius.toPx(), BlurMaskFilter.Blur.NORMAL))
        }
        frameworkPaint.color = color.toArgb()
        val leftPixel = offsetX.toPx()
        val topPixel = offsetY.toPx()
        val rightPixel = size.width + topPixel
        val bottomPixel = size.height + leftPixel
        canvas.drawRect(
            left = leftPixel,
            top = topPixel,
            right = rightPixel,
            bottom = bottomPixel,
            paint = paint,
        )
    }
})

data class PegasusShadowProvider(
    val shadow1 : PegasusShadowProperties,
    val shadow2 : PegasusShadowProperties,
    val shadow3 : PegasusShadowProperties,
    val shadow4 : PegasusShadowProperties,
    val shadow5 : PegasusShadowProperties,
    val shadow6 : PegasusShadowProperties,
)