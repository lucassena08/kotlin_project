package com.example.kotlinproject.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SpeakersView(
  innerPadding: PaddingValues,
) {
  val itemsList = (0..3).toList()
  val palestrantList = listOf<String>("Rodrigo", "Bernardo", "Pedro", "Augusto")
  LazyColumn(
    verticalArrangement = Arrangement.spacedBy(25.dp),
    modifier = Modifier
      .padding(innerPadding)
      .height(400.dp)
      .fillMaxWidth()
  ) {
    items(itemsList) {
      Row {
        Text("Palestrante ${it + 1}: ${palestrantList[it]}", fontSize = 25.sp)
      }
    }
  }
}