package com.example.androidapptemplate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.androidapptemplate.ui.theme.AndroidAppTemplateTheme
import dagger.hilt.android.AndroidEntryPoint

/**
 * Main entry point of app
 */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidAppTemplateTheme {

            }
        }
    }
}