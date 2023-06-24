package com.example.recipe

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.recipe.data.Recipe

@Composable
fun RecipeListItem(recipe: Recipe, navController: NavController) {
    CustomCard(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),

    ) {
        Row(
            modifier = Modifier.clickable{
                navController.navigate(route = Screens.Profile.route)
            }
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RecipeImage(recipe )
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = recipe.title, style = typography.headlineMedium)
                Text(text = "View Detail", style = typography.headlineMedium)
            }
        }
    }
}
@Composable
private fun RecipeImage(recipe: Recipe){ Image(
    painter = painterResource(id = recipe.recipeImageId),
    contentDescription = null,
    contentScale = ContentScale.Crop,
    modifier = Modifier
        .padding(8.dp)
        .size(84.dp)
        .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
)
}
@Composable
fun CustomCard(
    modifier: Modifier,
    shape: RoundedCornerShape,
    content: @Composable ColumnScope.() -> Unit
) {
    Card(
        modifier = modifier,
        shape = shape,
        content =content)}




