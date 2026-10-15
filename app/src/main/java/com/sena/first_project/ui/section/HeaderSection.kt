package com.sena.first_project.ui.section

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.sena.first_project.ui.composable.InfoBox
import com.sena.first_project.ui.theme.Dimens

/** Caja superior con el título de la actividad. */
@Composable
fun HeaderSection(
    title: String,
    modifier: Modifier = Modifier
) {
    InfoBox(
        modifier = modifier
            .fillMaxWidth()
            .height(Dimens.SectionHeight),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Actividad # 1")
    }
}