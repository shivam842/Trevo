package com.mcoders.wanderview.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mcoders.wanderview.ui.screens.DetailsScreen
import com.mcoders.wanderview.ui.screens.HomeScreen
import com.mcoders.wanderview.ui.screens.ProfileScreen

@Composable
fun NavGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = NavRoutes.Home.path) {
        composable(NavRoutes.Home.path) {
            HomeScreen(
                navigateToProfile = {
                    navController.navigate(NavRoutes.Profile.path)
                },
                navigateToDetails = { id ->
                    navController.navigate(NavRoutes.Details.withArgs(id))
                },
                exitApp = { navController.popBackStack() },
            )
        }

        composable(NavRoutes.Details.path) {
            DetailsScreen(
                onBackPressed = { navController.popBackStack() },
            )
        }

        composable(NavRoutes.Profile.path) {
            ProfileScreen(
                onBackPressed = { navController.popBackStack() },
            )
        }
    }
}
