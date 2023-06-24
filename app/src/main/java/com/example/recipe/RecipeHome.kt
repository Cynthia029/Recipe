package com.example.recipe

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.recipe.data.DataProvider
import androidx.compose.foundation.lazy.items
import androidx.navigation.compose.rememberNavController


@Composable
fun RecipeHomeContent (){
    val recipes = remember{DataProvider.recipeList}
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp,vertical = 8.dp ) )
    {
        items(
            items = recipes,
            itemContent={recipe ->
                RecipeListItem(recipe = recipe, navController = rememberNavController())
            }
        )
    }
}


