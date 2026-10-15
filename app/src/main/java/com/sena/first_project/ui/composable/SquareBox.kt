package com.sena.first_project.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.sena.first_project.ui.theme.Dimens

/**
 * Cuadro pequeño con borde negro (los 3 cuadros de la caja central).
 */
@Composable
fun SquareBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .size(Dimens.SquareSize)
            .background(Color.Blue)
            .border(
                Dimens.BorderWidth,
                Color.Black,
                RoundedCornerShape(Dimens.SquareRadius)
            )
    )
}