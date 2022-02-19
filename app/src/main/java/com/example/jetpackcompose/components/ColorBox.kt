package com.example.jetpackcompose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

@Composable
fun ColorBox(
    modifier: Modifier = Modifier,
    updateUiColor: (Color) -> Unit
) {

    val internalColor = remember {
        mutableStateOf(Color.Yellow)
    }

    Box(modifier = modifier
        .background(internalColor.value)
        .clickable {
            internalColor.value = Color(
                Random.nextFloat(),
                Random.nextFloat(),
                Random.nextFloat(),
                1f
            )
            updateUiColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            )
        }
    )
}