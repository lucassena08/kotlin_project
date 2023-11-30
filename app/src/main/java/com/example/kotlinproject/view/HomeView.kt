package com.example.kotlinproject.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeView(
  innerPadding: PaddingValues,
) {
  Column(
    modifier = Modifier
      .padding(innerPadding)
      .fillMaxWidth(),
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Text(
      "Interaja com o menu para obter mais informações sobre o evento",
      fontSize = 18.sp,
      textAlign = TextAlign.Center,
      modifier = Modifier.offset(y = 30.dp)
    )
  }
}
