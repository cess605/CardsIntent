package com.example.myscreensapp.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.MyScreensApp.ui.theme.screens.calculator.CalcScreen
import com.example.myscreensapp.ui.theme.Bmi.BmiScreen
import com.example.myscreensapp.ui.theme.Intents.IntentsScreen

import com.example.sepcardsapplication.HomeScreen

@Composable
fun AppNavHost(
    modifier: Modifier=Modifier,
    navController: NavHostController= rememberNavController(),
    startDestination: String= ROUTE_HOME
){
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_HOME) {
           HomeScreen(navController = navController)
        }
        composable(ROUTE_CALCULATOR){
            CalcScreen(navController = navController)
        }
        composable(ROUTE_BMI){
            BmiScreen(navController = navController)
        }
        composable(ROUTE_INTENTS){
            IntentsScreen(navController = navController)
        }
    }
}
