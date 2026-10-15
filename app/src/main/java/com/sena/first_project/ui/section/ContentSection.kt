package com.sena.first_project.ui.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.sena.first_project.ui.composable.InfoBox
import com.sena.first_project.ui.composable.SquareBox

/**
 * Caja central con la fila de 3 cuadros.
 * El weight(1f) se pasa desde la pantalla, porque solo funciona dentro de un Column.
 */
@Composable
fun ContentSection(modifier: Modifier = Modifier) {
    InfoBox(modifier = modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            repeat(3) {
                SquareBox()
            }
        }
    }
}

