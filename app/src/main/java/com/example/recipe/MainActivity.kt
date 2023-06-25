
package com.example.recipe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.recipe.data.Recipe
import com.example.recipe.ui.theme.RecipeTheme
import com.example.recipe.data.DataProvider


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




@Suppress("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp(navigateToProfile: (Recipe) -> Unit){
    Scaffold(
        content = {
            HomeContent(navigateToProfile=navigateToProfile)
        }
    )

}
@Composable
fun HomeContent(navigateToProfile: (Recipe) -> Unit) {
    val recipe = remember { DataProvider.recipeList }
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = recipe,
            itemContent = {
                RecipeListItem(recipe = it, navigateToProfile )
            })
    }

}
@Composable
fun RecipeListItem(recipe:Recipe, navigateToProfile: (Recipe) -> Unit){
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 3.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(corner= CornerSize(16.dp))
    )
    {
        Row(Modifier.clickable {navigateToProfile(recipe)   }) {
            RecipeImage(recipe)
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)


            ) {
                Text(text = recipe.title, style = MaterialTheme.typography.headlineMedium)
                Text(text = "View Detail", style = MaterialTheme.typography.headlineSmall)
            }
        }
    }}
@Composable
private fun RecipeImage(recipe: Recipe) {
    Image(
        painter = painterResource(id = recipe.recipeImageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(84.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}