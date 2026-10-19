package com.sena.actividad_2_kotlin.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DestinationItem(
    nombre: String,
    categoria: String,
    rating: String,
    descripcion: String,
    imageRes: Int
) {
    // Usamos un Row para poner la imagen a la izquierda y los textos a la derecha[cite: 16]
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = null,
            modifier = Modifier
                .size(90.dp)
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(12.dp))

        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(text = nombre, fontWeight = FontWeight.Bold, fontSize = 16.sp)
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = categoria, fontSize = 12.sp, color = Color.Gray)
                Spacer(modifier = Modifier.width(6.dp))
                Text(text = "★ $rating", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = Color(0xFFFFC107))
            }
            Text(text = descripcion, fontSize = 12.sp, color = Color.DarkGray, maxLines = 1)
        }

        Text(text = "›", fontSize = 22.sp, color = Color.Gray, fontWeight = FontWeight.Bold)
    }
}