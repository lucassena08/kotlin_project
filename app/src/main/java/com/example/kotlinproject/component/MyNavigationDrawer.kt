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
import com.example.kotlinproject.mynavigation.MyNavigationActions

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyNavigationDrawer(
  drawerState: DrawerState,
  navController: NavController,
  navigationActions: MyNavigationActions,
  content: @Composable () -> Unit,
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
            navigationActions.navigateToHome()
          })
        NavigationDrawerItem(
          label = { Text(text = "Mapa do Evento") },
          selected = false,
          onClick = {
            navigationActions.navigateToEventMap()
          }
        )
        NavigationDrawerItem(
          label = {
            Text(text = "Programação Completa")
          },
          selected = false,
          onClick = {
            navigationActions.navigateToCompleteSchedule()
          }
        )
        NavigationDrawerItem(
          label = {
            Text(text = "Palestrantes")
          },
          selected = false,
          onClick = {
            navigationActions.navigateToSpeakers()
          }
        )
        NavigationDrawerItem(
          label = {
            Text(text = "Notícias")
          },
          selected = false,
          onClick = {
            navigationActions.navigateToNews()
          }
        )
        NavigationDrawerItem(
          label = {
            Text(text = "Lista de Atividades")
          },
          selected = false,
          onClick = {
            navigationActions.navigateToActivitiesList()
          }
        )
      }
    },
  ) {
    content()
  }
}