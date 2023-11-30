package com.example.kotlinproject.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NewsView(
  innerPadding: PaddingValues
) {
  val itemsList = (0..15).toList()
  LazyColumn(
    verticalArrangement = Arrangement.spacedBy(10.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier
      .padding(innerPadding)
      .offset(y = 100.dp)
      .height(130.dp)
      .fillMaxWidth()
  ) {
    items(itemsList) {
      Row {
        Text("Notícia $it, notícia $it, notícia $it", fontSize = 18.sp)
      }
    }
  }
}