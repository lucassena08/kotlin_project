package com.example.kotlinproject

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MyApp(
  navController: NavHostController = rememberNavController()
) {
  NavHost(navController = navController, startDestination = "second") {
    composable("start") {
      Column(
        modifier = Modifier
          .fillMaxWidth()
          .fillMaxHeight()
      ) {
        Button(
          onClick = {},
          modifier = Modifier.absoluteOffset(x = 150.dp, y = 700.dp)
        ) {
          Text("Press me")
        }
      }
    }
    composable("second") {
      Button(onClick = { /*TODO*/ }) {
        Text("Press me 2")
      }
    }
  }

}