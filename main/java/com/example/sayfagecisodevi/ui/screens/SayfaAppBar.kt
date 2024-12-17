package com.example.sayfagecisodevi.ui.screens

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.sayfagecisodevi.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SayfaAppBar(
    title: String,
    navController: NavController,
    isYPage: Boolean = false,
    showBackButton: Boolean = true
) {
    TopAppBar(
        title = { Text(text = title) },
        navigationIcon = if (showBackButton) { // showBackButton true ise geri tuşunu göster
            {
                IconButton(onClick = {
                    //Y sayfasında ise ana sayfaya doğrudan dönmek için kullanıyoruz
                    if (isYPage) {
                        navController.popBackStack("anasayfa", inclusive = false)
                    } else {
                        //Diğer sayfalarda önceki sayfaya dönmek için kullanıyoruz
                        navController.navigateUp()
                    }
                }) {
                    Icon(
                        painter = painterResource(id = R.drawable.back),
                        contentDescription = "Geri"
                    )
                }
            }
        } else {
            @Composable { /* No-op */ }
        }
    )
}








