package com.example.kotlinproject.view

import androidx.compose.material3.Button
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView (
  drawerState: DrawerState,
  coroutineScope: CoroutineScope,
) {

  Button(
    onClick = {
      if (drawerState.isClosed) {
        coroutineScope.launch { drawerState.open() }
      } else {
        coroutineScope.launch { drawerState.close() }
      }
    }
  ) {
    Text(text = "Toggle Drawer")
  }

}
