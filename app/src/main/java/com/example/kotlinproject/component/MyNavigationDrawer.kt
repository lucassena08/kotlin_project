package com.example.kotlinproject.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyNavigationDrawer(
  content: @Composable () -> Unit,
  drawerState: DrawerState,
  navigateToHome: () -> Unit,
  navigateToEventMap: () -> Unit,
  navController: NavController
) {
  ModalNavigationDrawer(
    drawerState = drawerState,
    drawerContent = {
      ModalDrawerSheet {
        Text("Menu", modifier = Modifier.padding(16.dp))
        NavigationDrawerItem(
          label = {
            Text(text = "Home")
          },
          selected = false,
          onClick = {
            navigateToHome()
          })
        NavigationDrawerItem(
          label = { Text(text = "Mapa do Evento") },
          selected = false,
          onClick = {
            navigateToEventMap()
          }
        )
        NavigationDrawerItem(
          label = {
            Text(text = "Programação Completa")
          },
          selected = false,
          onClick = {

          }
        )
        NavigationDrawerItem(
          label = {
            Text(text = "Palestrantes")
          },
          selected = false,
          onClick = {

          }
        )
        NavigationDrawerItem(
          label = {
            Text(text = "Notícias")
          },
          selected = false,
          onClick = {

          }
        )
        NavigationDrawerItem(
          label = {
            Text(text = "Lista de Atividades")
          },
          selected = false,
          onClick = {

          }
        )
      }
    },
  ) {
    content()
  }
}