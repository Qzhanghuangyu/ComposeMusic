package com.quick.app.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.quick.app.feature.main.mainScreen
import com.quick.app.feature.main.navigateToMain
import com.quick.app.feature.splash.SPLASH_ROUTER
import com.quick.app.feature.splash.splashScreen

@Composable
fun MyApp(navController: NavHostController) {
    NavHost(navController = navController, startDestination = SPLASH_ROUTER) {
        splashScreen(toMain = navController::navigateToMain)
        mainScreen(finishPage = navController::popBackStack)
    }

}