package com.example.recipe

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.recipe.data.Recipe

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(navController = navController,
        startDestination = Screens.List.route)
    {
composable(
    route = Screens.List.route
){
    RecipeHomeContent()

}
        composable(
            route = Screens.Profile.route
        ){
            ProfileScreen()
        }
    }
}

