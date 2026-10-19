package com.sena.actividad_2_kotlin.ui.section

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CategoriesSection() {
    val categorias = listOf("⛰️ Montaña", "🌲 Bosque", "🏖️ Playa", "🏙️ Ciudad", "💖 Favoritos")

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(categorias) { categoria ->
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFEDE7F6)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = categoria.take(2), fontSize = 20.sp)
                }
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = categoria.drop(3), fontSize = 12.sp, color = Color.Gray)
            }
        }
    }
}