@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.recipe

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.recipe.data.Recipe
import com.example.recipe.ui.theme.RecipeTheme


class MainActivity : ComponentActivity() {
    @ExperimentalMaterial3Api
    lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            RecipeTheme {
                navController = rememberNavController( )
                SetupNavGraph(navController = navController)
                // A surface container using the 'background' color from the theme
                MyApp()


                }
            }
        }
    }



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
fun MyApp() {
    val navController = rememberNavController()
    Scaffold(
        content = {
            RecipeHomeContent()
        }
            )

    }

