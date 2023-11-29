package com.example.kotlinproject.component

import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import com.example.kotlinproject.view.HomeView

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ToggleDrawer(
  navController: NavController,
  navigateToHome: () -> Unit,
  navigateToEventMap: () -> Unit,
) {
  val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
  val coroutineScope = rememberCoroutineScope()
  MyNavigationDrawer(
    drawerState = drawerState,
    content = {
      HomeView(drawerState = drawerState, coroutineScope = coroutineScope)
    },
    navController = navController,
    navigateToHome = navigateToHome,
    navigateToEventMap = navigateToEventMap
  )
}