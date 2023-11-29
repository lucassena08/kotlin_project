package com.example.kotlinproject.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import com.example.kotlinproject.util.toggleSideBar
import kotlinx.coroutines.CoroutineScope

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CenterTopBar(
  title: String,
  drawerState: DrawerState,
  coroutineScope: CoroutineScope
//  navController: NavController,
//  navigationActions: MyNavigationActions
) {
  CenterAlignedTopAppBar(
    colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
      containerColor = MaterialTheme.colorScheme.primaryContainer,
      titleContentColor = MaterialTheme.colorScheme.primary
    ),
    title = {
      Text(text = title)
    },
    actions = {
      IconButton(
        onClick = {
          toggleSideBar(drawerState, coroutineScope)
        }
      ) {
        Icon(
          imageVector = Icons.Filled.Menu,
          contentDescription = "Menu",
        )
      }
    },
  )
}