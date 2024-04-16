package com.Jayson.mvvm_jayson.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.Jayson.mvvm_jayson.ui.theme.screens.Login.LoginScreen
import com.Jayson.mvvm_jayson.ui.theme.screens.Registeration.RegistrationScreen
import com.Jayson.mvvm_jayson.ui.theme.screens.about.AbtScreen
import com.Jayson.mvvm_jayson.ui.theme.screens.home.Homescreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_HOME) {
    NavHost(navController = navController, modifier = modifier,
        startDestination = startDestination){
        composable(ROUTE_HOME){
            Homescreen(navController)
        }
        composable(ROUTE_ABOUT){
            AbtScreen(navController)
        }

        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTRATION){
            RegistrationScreen(navController)
        }
//

    }

}