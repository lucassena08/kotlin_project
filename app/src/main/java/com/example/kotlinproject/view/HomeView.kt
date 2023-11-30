package com.example.kotlinproject.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(
  innerPadding: PaddingValues,
) {
  Column(modifier = Modifier.padding(innerPadding)) {
    Text("Home")
  }
}
