package com.example.recipe

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import com.example.recipe.data.DataProvider
import com.example.recipe.data.Recipe

@Composable
fun RecipeContent(navigateToProfile: (Recipe) -> Unit) {
    val recipes = remember { DataProvider.recipeList}
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        item {
            Text(
                text = "Recipes",
                style = typography.h4,
                modifier = Modifier.padding(12.dp)
            )
        }
        items(
            items = recipes,
            itemContent = {
                RecipeList(recipe = it, navigateToProfile)
            }
        )
    }
}