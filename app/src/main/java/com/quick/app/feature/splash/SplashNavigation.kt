package com.quick.app.feature.splash

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder

import androidx.navigation.compose.composable

const val SPLASH_ROUTER = "splash"

fun NavGraphBuilder.splashScreen(
    toMain: () -> Unit
) {
    composable(SPLASH_ROUTER) {
        SplashRouter(toMain = toMain)
    }

}