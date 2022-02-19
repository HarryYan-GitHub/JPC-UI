package com.example.jetpackcompose.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CircularBox() {
    var animPlayed by remember {
        mutableStateOf(false)
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { animPlayed = true },
                modifier = Modifier
                    .padding(16.dp)
                    .weight(1f),
                colors = ButtonDefaults
                    .buttonColors(
                        disabledBackgroundColor = Color.LightGray
                    ),
                enabled = !animPlayed
            ) {
                Text(text = "Animate")
            }
            Button(
                onClick = { animPlayed = false },
                modifier = Modifier
                    .padding(16.dp)
                    .weight(1f),
                colors = ButtonDefaults
                    .buttonColors(
                        disabledBackgroundColor = Color.LightGray
                    ),
                enabled = animPlayed
            ) {
                Text(text = "Reset")
            }
        }
        CircularAnimation(
            percentage = 0.74f,
            number = 100,
            radius = 80.dp,
            modifier = Modifier
                .size(80.dp * 2f)
                .align(Alignment.TopCenter)
                .padding(24.dp),
            animPlayed = animPlayed,
            animDuration = 1000
        )
    }
}
