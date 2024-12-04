package com.example.navigation1.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation1.presentation.ui.screens.Screen1
import com.example.navigation1.presentation.ui.screens.Screen2
import com.example.navigation1.presentation.ui.screens.Screen3

@Composable
fun NavGraph(startDestination: String = Screen.Screen1.route) {
    val navController = rememberNavController()

    // Aquí se define el NavHost y las rutas
    NavHost(navController = navController, startDestination = startDestination) {
        // Ruta para Login
        composable(Screen.Screen1.route) {
            Screen1(navController)
        }
        composable(Screen.Screen2.route) {
            Screen2(navController)
        }
        composable(Screen.Screen3.route) {
            Screen3(navController)
        }
    }
}