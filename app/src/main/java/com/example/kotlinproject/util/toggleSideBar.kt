package com.example.kotlinproject.util

import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
fun toggleSideBar(
  drawerState: DrawerState,
  coroutineScope: CoroutineScope
) {
  coroutineScope.launch { drawerState.apply { if (isClosed) open() else close()} }
}