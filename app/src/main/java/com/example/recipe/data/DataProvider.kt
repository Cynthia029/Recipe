package com.example.recipe.data

import com.example.recipe.R

object DataProvider{
    val recipeList = listOf(
        Recipe(
            id = 1,
            title ="Pilau",
            type = "Lunch",
            people = "Serves 4 people",
            difficultyLevel ="Beginner",
            ingredients = "",
            preparation = "",
            recipeImageId= R.drawable.pilau
        ),
        Recipe(
            id = 2,
            title ="Biryani",
            type = "Lunch",
            people = "Serves 4 people",
            difficultyLevel ="Beginner",
            ingredients = "",
            preparation = "",
            recipeImageId= R.drawable.biryani
        ),
        Recipe(
            id = 3,
            title ="Scrambled eggs",
            type = "Breakfast",
            people = "Serves 2 people",
            difficultyLevel ="Beginner",
            ingredients = "",
            preparation = "",
            recipeImageId= R.drawable.eggs
        ),
        Recipe(
            id = 4,
            title ="Chicken",
            type = "Dinner",
            people = "Serves 2 people",
            difficultyLevel ="Intermediate",
            ingredients = "",
            preparation = "",
            recipeImageId= R.drawable.chicken
        ),
        Recipe(
            id = 5,
            title ="Bhajia",
            type = "Dinner",
            people = "Serves 2 people",
            difficultyLevel ="Intermediate",
            ingredients = "",
            preparation = "",
            recipeImageId= R.drawable.bhajia
        ),
        Recipe(
            id = 6,
            title ="Chapati",
            type = "Dinner",
            people = "Serves 2 people",
            difficultyLevel ="Intermediate",
            ingredients = "",
            preparation = "",
            recipeImageId= R.drawable.chapati
        ),

        )

}