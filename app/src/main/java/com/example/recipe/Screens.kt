package com.example.recipe

sealed class Screens (val route: String) {
    object List: Screens(route="list_screen")
    object Profile: Screens (route ="profile_screen")
}
