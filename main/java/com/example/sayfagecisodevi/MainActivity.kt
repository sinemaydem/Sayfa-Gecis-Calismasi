package com.example.sayfagecisodevi
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.compose.rememberNavController
import com.example.sayfagecisodevi.ui.screens.SayfaGecisleri
import com.example.sayfagecisodevi.ui.theme.SayfaGecisOdeviTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SayfaGecisOdeviTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    SayfaGecisleri()
                }
            }
        }
    }
}
