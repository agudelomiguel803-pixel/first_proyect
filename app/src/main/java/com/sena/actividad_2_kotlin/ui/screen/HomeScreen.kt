package com.sena.actividad_2_kotlin.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sena.actividad_2_kotlin.R
import com.sena.actividad_2_kotlin.ui.section.CategoriesSection
import com.sena.actividad_2_kotlin.ui.section.FeaturedSection
import com.sena.actividad_2_kotlin.ui.section.HeaderSection
import com.sena.actividad_2_kotlin.ui.section.PopularSection

@Composable
fun HomeScreen() {
    // Contenedor principal de toda la pantalla con scroll vertical[cite: 6, 8]
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        HeaderSection()

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            FeaturedSection()
            CategoriesSection()
            PopularSection()
        }
    }
}