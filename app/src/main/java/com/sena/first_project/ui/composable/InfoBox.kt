package com.sena.first_project.ui.composable


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.sena.first_project.ui.theme.Dimens

/**
 * Caja blanca con borde redondeado. Se reutiliza en header, contenido y footer.
 */
@Composable
fun InfoBox(
    modifier: Modifier = Modifier,
    contentAlignment: Alignment = Alignment.TopStart,
    content: @Composable BoxScope.() -> Unit
) {
    val shape = RoundedCornerShape(Dimens.CardRadius)

    Box(
        modifier = modifier
            .border(Dimens.BorderWidth, Color.DarkGray, shape)
            .background(Color.White, shape)
            .padding(Dimens.InnerPadding),
        contentAlignment = contentAlignment,
        content = content
    )
}