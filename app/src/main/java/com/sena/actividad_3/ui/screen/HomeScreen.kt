package com.sena.actividad_3.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    onNavigateToProducts: () -> Unit,
    onNavigateToProductDetail: (String) -> Unit,
    onNavigateToCart: (String?) -> Unit,
    onNavigateToProfile: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Pantalla de Inicio")
        
        Spacer(modifier = Modifier.height(16.dp))
        
        Button(onClick = onNavigateToProducts) {
            Text(text = "Ir a Productos")
        }
        
        Spacer(modifier = Modifier.height(8.dp))
        
        Button(onClick = { onNavigateToProductDetail("101") }) {
            Text(text = "Ir a Producto 101")
        }
        
        Spacer(modifier = Modifier.height(8.dp))
        
        Button(onClick = { onNavigateToCart(null) }) {
            Text(text = "Ir al Carrito")
        }
        
        Spacer(modifier = Modifier.height(8.dp))
        
        Button(onClick = { onNavigateToCart("DESCUENTO10") }) {
            Text(text = "Ir al Carrito con Cupón")
        }
        
        Spacer(modifier = Modifier.height(8.dp))
        
        Button(onClick = { onNavigateToProfile("Carlos") }) {
            Text(text = "Ir al Perfil de Carlos")
        }
    }
}
