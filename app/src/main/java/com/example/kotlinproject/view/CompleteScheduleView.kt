package com.example.kotlinproject.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CompleteScheduleView(
  innerPadding: PaddingValues
) {
  Column(
    verticalArrangement = Arrangement.spacedBy(10.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier
      .padding(innerPadding)
      .height(130.dp)
      .offset(y = 80.dp)
      .fillMaxWidth()
  ) {
    Text(" - Apresentação dos Palestrantes: 18:00", fontSize = 18.sp)
    Text(" - Início do Evento: 18:30", fontSize = 18.sp)
    Text(" - Término: 22:00", fontSize = 18.sp)
  }
}