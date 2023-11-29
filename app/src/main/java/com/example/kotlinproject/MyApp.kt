package com.example.kotlinproject

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kotlinproject.component.EventMap
import com.example.kotlinproject.component.ToggleDrawer
import com.example.kotlinproject.mynavigation.Destinations
import com.example.kotlinproject.mynavigation.MyNavigationActions

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp(
  navController: NavHostController = rememberNavController()
) {
  val navigatorActions = remember(navController) {
    MyNavigationActions(navController)
  }

  NavHost(navController = navController, startDestination = Destinations.START_ROUTE) {

    composable(Destinations.START_ROUTE) {
      ToggleDrawer(
        navController = navController,
        navigateToHome = navigatorActions.navigateToHome,
        navigateToEventMap = navigatorActions.navigateToEventMap
      )
    }

    composable(Destinations.EVENT_MAP) {
      EventMap(
        navController = navController,
        navigateToHome = navigatorActions.navigateToHome,
        navigateToEventMap = navigatorActions.navigateToEventMap,
      )
    }

    composable(Destinations.COMPLETE_SCHEDULE) {}

    composable(Destinations.SPEAKERS) {}

    composable(Destinations.NOTICES) {}

    composable(Destinations.ACTIVITIES_LIST) {}
  }

}