package com.example.kotlinproject

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kotlinproject.component.ActivitiesList
import com.example.kotlinproject.component.CompleteSchedule
import com.example.kotlinproject.component.EventMap
import com.example.kotlinproject.component.Home
import com.example.kotlinproject.component.News
import com.example.kotlinproject.component.Speakers
import com.example.kotlinproject.mynavigation.Destinations
import com.example.kotlinproject.mynavigation.MyNavigationActions

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
  val navController: NavHostController = rememberNavController()
  val navigationActions = remember(navController) {
    MyNavigationActions(navController)
  }

  MaterialTheme(
    // use default primary, onPrimary, primaryContainer colors...
    colorScheme = darkColorScheme()
  ) {
    NavHost(navController = navController, startDestination = Destinations.START_ROUTE) {

      composable(Destinations.START_ROUTE) {
        Home(
          title = "Home",
          navController = navController,
          navigationActions = navigationActions,
        )
      }

      composable(Destinations.EVENT_MAP) {
        EventMap(
          title = "Mapa do Evento",
          navController = navController,
          navigationActions = navigationActions,
        )
      }

      composable(Destinations.COMPLETE_SCHEDULE) {
        CompleteSchedule(
          title = "Programação Completa",
          navController = navController,
          navigationActions = navigationActions,
        )
      }

      composable(Destinations.SPEAKERS) {
        Speakers(
          title = "Palestrantes",
          navController = navController,
          navigationActions = navigationActions,
        )
      }

      composable(Destinations.NEWS) {
        News(
          title = "Notícias",
          navController = navController,
          navigationActions = navigationActions,
        )
      }

      composable(Destinations.ACTIVITIES_LIST) {
        ActivitiesList(
          title = "Lista de Atividades",
          navController = navController,
          navigationActions = navigationActions,
        )
      }
    }
  }

}
