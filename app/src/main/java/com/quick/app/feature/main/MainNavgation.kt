package com.quick.app.feature.main

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.quick.app.feature.splash.SPLASH_ROUTER
import com.quick.app.feature.splash.SplashRouter

const val MAIN_ROUTER = "main"
fun NavGraphBuilder.mainScreen(finishPage: () -> Unit) {
    composable(MAIN_ROUTER) {
        MainRouter(finishPage = finishPage)
    }
}

fun NavController.navigateToMain() {
    navigate(MAIN_ROUTER)
}