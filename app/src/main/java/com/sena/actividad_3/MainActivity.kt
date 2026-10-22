package com.sena.actividad_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.sena.actividad_3.ui.navigation.AppNavigation
import com.sena.actividad_3.ui.theme.Actividad_3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Actividad_3Theme {
                AppNavigation()
            }
        }
    }
}