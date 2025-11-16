package com.example.mad_23012531058_pra_5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.mad_23012531058_pra_5.ui.theme.MAD_23012531058_PRA_5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MAD_23012531058_PRA_5Theme {
                AppNavigation(this)
            }
        }
    }
}

