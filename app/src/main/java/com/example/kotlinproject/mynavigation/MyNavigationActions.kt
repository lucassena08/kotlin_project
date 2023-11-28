package com.example.kotlinproject.mynavigation

import androidx.navigation.NavHostController

object Destinations {
  const val START_ROUTE = "start"
  const val EVENT_MAP = "map"
  const val COMPLETE_SCHEDULE = "complete schedule"
  const val SPEAKERS = "speakers"
  const val NOTICES = "notices"
  const val ACTIVITIES_LIST = "activities list"
}

class MyNavigationActions(navController: NavHostController) {
  val navigateToHome: () -> Unit = {
    navController.navigate(route = Destinations.START_ROUTE)
  }

  val navigateToEventMap: () -> Unit = {
    navController.navigate(route = Destinations.EVENT_MAP)
  }

  val navigateToCompleteSchedule: () -> Unit = {
    navController.navigate(route = Destinations.COMPLETE_SCHEDULE)
  }

  val navigateToSpeakers: () -> Unit = {
    navController.navigate(route = Destinations.SPEAKERS)
  }

  val navigateToNotices: () -> Unit = {
    navController.navigate(route = Destinations.NOTICES)
  }

  val activitiesList: () -> Unit = {
    navController.navigate(route = Destinations.ACTIVITIES_LIST)
  }
}