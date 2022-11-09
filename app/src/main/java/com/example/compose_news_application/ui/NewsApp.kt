package com.example.compose_news_application.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.compose_news_application.ui.screen.DetailScreen
import com.example.compose_news_application.ui.screen.TopNews

@Composable
fun NewsApp(){
    Navigation()
}

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "TopNews"
    ){
        composable("TopNews"){
            TopNews(navController = navController)
        }
        composable("DetailScreen"){
            DetailScreen(navController = navController)
        }
    }
}
