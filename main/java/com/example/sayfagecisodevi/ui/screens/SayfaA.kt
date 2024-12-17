package com.example.sayfagecisodevi.ui.screens
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun SayfaA(navController: NavController) {
    Scaffold (
        topBar = { SayfaAppBar(
            title = "Sayfa A",
            navController = navController) }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Button(onClick = { navController.navigate("sayfaB") }) {
                Text("GİT > B")
            }
        }

        BackHandler(enabled = true) {
            navController.popBackStack("anasayfa", inclusive = false)
        }
    }
}
