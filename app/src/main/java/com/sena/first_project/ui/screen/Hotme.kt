package com.sena.first_project.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.sena.first_project.ui.section.ContentSection
import com.sena.first_project.ui.section.FooterSection
import com.sena.first_project.ui.section.HeaderSection
import com.sena.first_project.ui.theme.Dimens

/**
 * Pantalla principal: solo ensambla las secciones.
 */
@Composable
fun Home(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = Color.Red
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Yellow)
                .padding(Dimens.ScreenPadding),
            verticalArrangement = Arrangement.spacedBy(Dimens.Spacing)
        ) {
            HeaderSection(title = "Actividad # 1")

            ContentSection(modifier = Modifier.weight(1f))

            FooterSection()
        }
    }
}