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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recipe.data.Recipe
import com.example.recipeapp.R

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
                        recipe = recipe,
                    containerHeight = this@BoxWithConstraints.maxHeight)
                    ProfileContent(recipe=recipe,containerHeight = this@BoxWithConstraints.maxHeight)
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
private fun ProfileContent(recipe: Recipe,containerHeight: Dp ){
    Column {
        Title(recipe=recipe )
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
            style = MaterialTheme.typography.h6

        )
    }
}
@Composable
private fun Property(Label:String,value: String){
    Card(
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth(),
        elevation = 4.dp
    ){
    Column(modifier = Modifier.padding(start = 24.dp, end = 24.dp, bottom = 24.dp)) {
        Text(
            text = Label,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.caption,
        )
        Text(
            text =value,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.caption,
        )


    }

}}