
package com.example.recipe

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.recipe.data.Recipe
import com.example.recipe.ui.theme.RecipeTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipeTheme {
                MyApp {
                    startActivity(ProfileActivity.newIntent(this, it))
                }


                }
            }
        }

    }




@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MyApp(navigateToProfile: (Recipe) -> Unit) {
    Scaffold(
        content = {
            RecipeContent(navigateToProfile = navigateToProfile)
        }
    )
}
