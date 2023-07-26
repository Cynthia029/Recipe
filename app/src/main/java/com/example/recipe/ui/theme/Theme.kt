package com.example.recipe.ui.theme


import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable


private val DarkColorPallete = darkColors(
    primary = Purple80,
    secondary = PurpleGrey80,

)

private val LightColorPallete = lightColors(
    primary = Purple40,
    secondary = PurpleGrey40,

)

@Composable
fun RecipeTheme(
    darkTheme: Boolean = true,
    content: @Composable () -> Unit)
{
    val colors = if(darkTheme) {
        DarkColorPallete
    }else {
        LightColorPallete
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        content = content
    )
}
