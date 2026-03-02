package com.example.kmpdemo

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.toSize

fun Modifier.backgroundImageAndColor(
    image: Painter? = null,
    color: Color? = null,
    shape: Shape = RectangleShape
): Modifier {
    return this
        .clip(shape)
        .drawWithContent {
            // Draw background color first
            if (color != null) {
                drawRect(color = color)
            }

            // Draw background image using *layout size*, not intrinsic size
            if (image != null) {
                with(image) {
                    draw(
                        size = size, // 🔥 CRITICAL FIX
                        alpha = 1f
                    )
                }
            }

            // Draw actual content LAST
            drawContent()
        }
}
