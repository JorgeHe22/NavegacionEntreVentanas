package com.example.ejercicio1.Screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.example.ejercicio2.Screen.PersonasViewModel

//rememberNavController(): funcion que crea un nuevo navControles que es un componente que gestiona la navegacion
//composable("screenA") define las diferentes rutas que puede navegar
//startDestination = "screen_a" Define cual sera la pantalla inicial
//navController = navController Se le pasa la instancia a NavController
//navHost(): Este componente actua como contenedor para las pantallas (composables) de la aplicacion




@Preview(showBackground = true)
@Composable
fun NavegacionApp() {
    val navController = rememberNavController()
    val viewModel: PersonasViewModel = viewModel()

    NavHost(navController = navController, startDestination = "screen_a") {
        composable("screen_a") {
            ScreenA(navController = navController, viewModel = viewModel)
        }
        composable("screen_b") {
            ScreenB(navController = navController, viewModel = viewModel)
        }
    }
}