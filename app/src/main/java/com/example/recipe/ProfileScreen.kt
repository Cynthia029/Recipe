package com.example.recipe

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.recipe.data.Recipe

@Composable
fun ProfileScreen(recipe: Recipe){
    val scrollState= rememberScrollState()
    Column(modifier = Modifier.fillMaxSize()){
        BoxWithConstraints {
            Surface{
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(scrollState)
                    ){
                    ProfileHeader(
                        recipe,
                    this@BoxWithConstraints.maxHeight)
                    ProfileContent(recipe)
                }
            }

        }
    }
}
@Composable
private fun ProfileHeader(
    recipe:Recipe,
    containerHeight: Dp
){
    Image(
        modifier = Modifier
            .heightIn(max = containerHeight / 3)
            .fillMaxWidth(),
        painter = painterResource(id = recipe.recipeImageId),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}
@Composable
private fun ProfileContent(recipe: Recipe, ){
    Column {
        Title(recipe )
        Property(stringResource(R.string.type),recipe.type )
        Property(stringResource(R.string.people),recipe.people)
        Property(stringResource(R.string.difficultyLevel),recipe.difficultyLevel)
        Property(stringResource(R.string.ingredients),recipe.ingredients )
        Property(stringResource(R.string.preparation ),recipe.preparation )

    }
}
@Composable
private fun Title(
    recipe: Recipe
) {
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)) {
        Text(
            text = recipe.title,
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Bold
        )
    }
}
@Composable
private fun Property(Label:String,value: String){
    Column(modifier = Modifier.padding(start = 24.dp, end = 24.dp, bottom = 24.dp)) {
        Text(
            text = Label,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.headlineSmall
        )
        Text(
            text =value,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.bodySmall
        )


    }

}