package com.example.kotlinproject

import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kotlinproject.component.MyNavigationDrawer
import com.example.kotlinproject.mynavigation.Destinations
import com.example.kotlinproject.mynavigation.MyNavigationActions
import com.example.kotlinproject.view.EventMapView
import com.example.kotlinproject.view.HomeView

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
      val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
      val coroutineScope = rememberCoroutineScope()
      MyNavigationDrawer(
        drawerState = drawerState,
        content = {
          HomeView(drawerState = drawerState, coroutineScope = coroutineScope)
        },
        navController = navController,
        navigateToHome = navigatorActions.navigateToHome,
        navigateToEventMap = navigatorActions.navigateToEventMap
      )
    }

    composable(Destinations.EVENT_MAP) {
      val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
      val coroutineScope = rememberCoroutineScope()
      MyNavigationDrawer(
        content = {
          EventMapView()
        },
        drawerState = drawerState,
        navigateToHome = navigatorActions.navigateToHome,
        navigateToEventMap = navigatorActions.navigateToEventMap,
        navController = navController
      )
    }

    composable(Destinations.COMPLETE_SCHEDULE) {}

    composable(Destinations.SPEAKERS) {}

    composable(Destinations.NOTICES) {}

    composable(Destinations.ACTIVITIES_LIST) {}
  }

}