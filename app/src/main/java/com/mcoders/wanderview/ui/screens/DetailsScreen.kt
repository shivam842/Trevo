package com.mcoders.wanderview.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.mcoders.wanderview.data.models.Details
import com.mcoders.wanderview.ui.viewmodels.DetailsViewModel

@Composable
fun DetailsScreen(onBackPressed: () -> Unit) {

    val viewModel: DetailsViewModel = hiltViewModel()

    val details = viewModel.details.collectAsState()

    Details(details = details.value, onBackPressed = onBackPressed)
}

@Composable
fun Details(details: Details, onBackPressed: () -> Unit) {

    BackHandler(true, onBackPressed)

    Box(modifier = Modifier.fillMaxSize()) {

        //Design your detail page
    }
}
