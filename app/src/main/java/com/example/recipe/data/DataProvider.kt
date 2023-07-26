package com.example.recipe.data

import com.example.recipeapp.R

object DataProvider{
    val recipeList = listOf(
        Recipe(
            id = 1,
            title ="Pilau",
            type = "Lunch",
            people = "Serves 3 people",
            difficultyLevel ="Beginner",
            ingredients = "2 cups of Basmati rice\n" +
                    "1 kg of chicken (cut into pieces)\n" +
                    "1 large onion (finely chopped)\n" +
                    "3 cloves of garlic (minced)\n" +
                    "1-inch piece of ginger (grated)\n" +
                    "2 tomatoes (chopped)\n" +
                    "2 tablespoons of Pilau masala\n" +
                    "1 teaspoon of turmeric powder\n" +
                    "1 teaspoon of cumin seeds\n" +
                    "4 cups of chicken broth\n" +
                    "Salt to taste\n" +
                    "Cooking oil",
            preparation = "Rinse the Basmati rice thoroughly and soak it in water for about 30 minutes. Drain and set aside.\n" +
                    "Heat oil in a large pot or pan over medium heat. Add the chopped onion and sauté until it turns golden brown.\n" +
                    "Add the minced garlic and grated ginger to the pot and sauté for another minute.\n" +
                    "Add the chicken pieces to the pot and cook until they are browned on all sides.\n" +
                    "Stir in the chopped tomatoes, Pilau masala, turmeric powder, cumin seeds, and salt. Cook for a few minutes until the tomatoes are soft and the spices are well combined.\n" +
                    "Add the soaked and drained Basmati rice to the pot and gently mix it with the chicken and spices.\n" +
                    "Pour in the chicken broth and bring the mixture to a boil. Reduce the heat to low, cover the pot with a lid, and let it simmer for about 15-20 minutes or until the rice is cooked and the liquid is absorbed.\n" +
                    "Once the Pilau is cooked, remove it from heat and let it sit for a few minutes before fluffing it with a fork.\n" +
                    "Serve the delicious Pilau hot and enjoy!",
            recipeImageId = R.drawable.pilau
        ),
        Recipe(
            id = 2,
            title ="Burger",
            type = "Lunch",
            people = "Serves 4 people",
            difficultyLevel ="Beginner",
            ingredients = "",
            preparation = "",
            recipeImageId = R.drawable.burger
        ),
        Recipe(
            id = 3,
            title ="Scrambled eggs",
            type = "Breakfast",
            people = "Serves 2 people",
            difficultyLevel ="Beginner",
            ingredients = "",
            preparation = "",
            recipeImageId = R.drawable.srambledeggs
        ),
        Recipe(
            id = 4,
            title ="Chicken",
            type = "Dinner",
            people = "Serves 5 people",
            difficultyLevel ="Intermediate",
            ingredients = "",
            preparation = "",
            recipeImageId = R.drawable.chicken
        ),
        Recipe(
            id = 5,
            title ="Chapati",
            type = "Dinner",
            people = "Serves 5 people",
            difficultyLevel ="Intermediate",
            ingredients = "",
            preparation = "",
            recipeImageId = R.drawable.chapati

        ),
        )
}