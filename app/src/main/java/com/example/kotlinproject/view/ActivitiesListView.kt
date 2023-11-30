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
fun ActivitiesListView (
  innerPadding: PaddingValues,
) {
  val itemsList = (0..15).toList()
  LazyColumn(
    verticalArrangement = Arrangement.spacedBy(10.dp),
    modifier = Modifier
      .padding(innerPadding)
      .height(130.dp)
      .fillMaxWidth()
  ) {
    items(itemsList) {
      Row {
        Text("Item is $it, item is $it, item is $it", fontSize = 18.sp)
      }
    }
  }
}