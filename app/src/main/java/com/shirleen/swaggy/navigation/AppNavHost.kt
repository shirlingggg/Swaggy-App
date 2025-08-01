package com.shirleen.swaggy.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.shirleen.swaggy.ui.screens.about.AboutScreen
import com.shirleen.swaggy.ui.screens.category.CategoryScreen
import com.shirleen.swaggy.ui.screens.contact.ContactScreen
import com.shirleen.swaggy.ui.screens.dashboard.DashboardScreen
import com.shirleen.swaggy.ui.screens.dashboard.DashboardScreen2
import com.shirleen.swaggy.ui.screens.detail.DetailScreen
import com.shirleen.swaggy.ui.screens.home.HomeScreen
import com.shirleen.swaggy.ui.screens.intent.IntentScreen
import com.shirleen.swaggy.ui.screens.item.ItemScreen
import com.shirleen.swaggy.ui.screens.scaffold.ScaffoldScreen
import com.shirleen.swaggy.ui.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }

        composable(ROUT_CONTACT) {
            ContactScreen(navController)
        }

        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }

        composable(ROUT_CATEGORY) {
            CategoryScreen(navController)
        }

        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUT_SCAFFOLD) {
           ScaffoldScreen(navController)
        }

        composable(ROUT_DETAIL) {
            DetailScreen(navController)
        }

        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }

        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController)
        }

        composable(ROUT_DASHBOARD2) {
            DashboardScreen2(navController)
        }


    }
}