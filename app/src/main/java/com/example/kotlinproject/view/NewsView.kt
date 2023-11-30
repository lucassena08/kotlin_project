package com.example.kotlinproject.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NewsView (
  innerPadding: PaddingValues
) {
  val scrollState = rememberScrollState()
  Column(
    modifier = Modifier
      .padding(innerPadding)
      .fillMaxWidth()
      .requiredHeight(200.dp)
      .verticalScroll(scrollState)
  ) {
    Text("Teste teste teste")
    Text("Teste teste teste")
    Text("Teste teste teste")
    Text("Teste teste teste")
    Text("Teste teste teste")
    Text("Teste teste teste")
    Text("Teste teste teste")
    Text("Teste teste teste")
    Text("Teste teste teste")
    Text("Teste teste teste")
    Text("Teste teste teste")
    Text("Teste teste teste")
    Text("Teste teste teste")
    Text("Teste teste teste")
    Text("Teste teste teste")
    Text("Teste teste teste")
    Text("Teste teste teste")
    Text("Teste teste teste")
  }
}