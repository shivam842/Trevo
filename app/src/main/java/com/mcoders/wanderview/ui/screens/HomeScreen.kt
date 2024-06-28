package com.mcoders.wanderview.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(
    navigateToProfile: () -> Unit,
    navigateToDetails: (id: String) -> Unit,
    exitApp: () -> Unit,
) {
    Scaffold(
        topBar = { TopAppBar() }
    ) {
        Box(modifier = Modifier.fillMaxSize().padding(it)){

        }
    }
}

@Composable
fun TopAppBar() {

}
