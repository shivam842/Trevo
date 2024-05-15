package com.mcoders.wanderview.ui.theme

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = Yellow,
    secondary = MintGreen,
    tertiary = Coral,
    secondaryContainer = Yellow,
    surface = White
)

private val shapes: Shapes
    @Composable get()
    = MaterialTheme.shapes.copy(large = CircleShape)

@Composable
fun WanderViewTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        content = content
    )
}