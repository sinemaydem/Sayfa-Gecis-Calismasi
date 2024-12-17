package com.example.sayfagecisodevi.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun SayfaGecisleri() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "anasayfa") {

        composable("anasayfa") {
            Anasayfa(navController) }

        composable("sayfaA") {
            SayfaA(navController) }

        composable("sayfaB") {
            SayfaB(navController) }

        composable("sayfaX") {
            SayfaX(navController) }

        composable("sayfaY") {
            SayfaY(navController) }
    }
}
