package com.example.marcelina_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.marcelina_1.presentacion.homeScreen.MainScreen
import com.example.marcelina_1.ui.theme.Marcelina_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Marcelina_1Theme {
                MainScreen()

            }
        }
    }
}
