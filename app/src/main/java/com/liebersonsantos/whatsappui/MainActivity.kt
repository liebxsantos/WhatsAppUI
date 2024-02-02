package com.liebersonsantos.whatsappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.liebersonsantos.whatsappui.ui.screens.HomeScreen
import com.liebersonsantos.whatsappui.ui.theme.WhatsAppUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsAppUITheme {
                HomeScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WhatsAppUIPreview() {
    WhatsAppUITheme {
        HomeScreen()
    }
}