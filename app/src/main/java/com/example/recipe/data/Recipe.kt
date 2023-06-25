package com.example.recipe.data

import java.io.Serializable

data class Recipe(
    val id: Int,
    val title: String,
    val type:String,
    val people: String,
    val difficultyLevel: String,
    val ingredients: String,
    val preparation: String,
    val recipeImageId: Int = 0
):Serializable