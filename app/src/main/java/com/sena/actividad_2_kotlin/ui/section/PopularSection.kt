package com.sena.actividad_2_kotlin.ui.section

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.actividad_2_kotlin.R
import com.sena.actividad_2_kotlin.ui.composable.DestinationItem

@Composable
fun PopularSection() {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Destinos populares", fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Text(text = "Ver todos", color = Color(0xFF6200EE), fontSize = 14.sp)
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Lista estática limpia basada en tarjetas reutilizables
        DestinationItem("Laguna Azul", "Naturaleza", "4.8", "Un paraíso natural rodeado de montañas.", R.drawable.elbicho4)
        DestinationItem("Playa del Sol", "Playa", "4.6", "Aguas cristalinas y arena blanca.", R.drawable.elbicho5)
        DestinationItem("Centro Histórico", "Cultura", "4.7", "Historia y arquitectura en un solo lugar.", R.drawable.elbicho7)
    }
}