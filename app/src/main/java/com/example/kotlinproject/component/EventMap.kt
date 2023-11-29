package com.example.kotlinproject.component

import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import com.example.kotlinproject.mynavigation.MyNavigationActions
import com.example.kotlinproject.view.EventMapView

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EventMap(
  title: String,
  navController: NavController,
  navigationActions: MyNavigationActions
) {
  val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
  val coroutineScope = rememberCoroutineScope()
  MyNavigationDrawer(
    content = {
      Scaffold(
        topBar = {
          CenterTopBar(title, drawerState, coroutineScope)
        }
      ) {
        EventMapView(it)
      }
    },
    drawerState = drawerState,
    navigationActions = navigationActions,
    navController = navController
  )
}