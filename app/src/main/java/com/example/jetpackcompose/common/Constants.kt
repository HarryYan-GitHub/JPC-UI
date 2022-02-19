package com.example.jetpackcompose.common

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.jetpackcompose.R

object Constants {

    val fontFamily = FontFamily(
        Font(R.font.sourcecodeproextralight, FontWeight.ExtraLight),
        Font(R.font.sourcecodeprolight, FontWeight.Light),
        Font(R.font.sourcecodepromedium, FontWeight.Medium),
        Font(R.font.sourcecodeproregular, FontWeight.Normal),
        Font(R.font.sourcecodeprobold, FontWeight.Bold),
        Font(R.font.sourcecodeprosemibold, FontWeight.SemiBold),
        Font(R.font.sourcecodeproextrabold, FontWeight.ExtraBold),
        Font(R.font.sourcecodeproblack, FontWeight.Black)
    )
}