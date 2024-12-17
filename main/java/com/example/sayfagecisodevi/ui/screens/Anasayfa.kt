package com.example.sayfagecisodevi.ui.screens

import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.material3.*

@Composable
fun Anasayfa(navController: NavController) {
    Scaffold(
        topBar = { SayfaAppBar(
            title = "Anasayfa",
            navController = navController,
            showBackButton = false,) } // showBackButton'ı false yaparak geri tuşunu gizliyoruz

    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Button(onClick = { navController.navigate("sayfaA") }) {
                Text("GİT > A")
            }
            Button(onClick = { navController.navigate("sayfaX") }) {
                Text("GİT > X")
            }
        }
    }
}
