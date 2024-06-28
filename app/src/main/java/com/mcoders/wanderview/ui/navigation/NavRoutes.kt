package com.mcoders.wanderview.ui.navigation

sealed class NavRoutes(val path: String){

    data object Home: NavRoutes(path = "home")

    data object Profile: NavRoutes(path = "profile")

    data object Details: NavRoutes(path = "details") {
        val id = "id"
    }


    // build navigation path (for screen navigation)
    fun withArgs(vararg args: String): String {
        return buildString {
            append(path)
            args.forEach{ arg ->
                append("/$arg")
            }
        }
    }

    // build and setup route format (in navigation graph)
    fun withArgsFormat(vararg args: String) : String {
        return buildString {
            append(path)
            args.forEach{ arg ->
                append("/{$arg}")
            }
        }
    }
}