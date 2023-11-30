package com.example.kotlinproject.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinproject.R

@Composable
fun EventMapView(
  innerPadding: PaddingValues
) {
  Column(
    modifier = Modifier
      .padding(innerPadding)
      .offset(y = 100.dp)
      .fillMaxWidth(),
    horizontalAlignment = Alignment.CenterHorizontally,
  ) {
    Image(
      painter = painterResource(id = R.drawable.eventmap),
      contentDescription = "Event Map"
    )
    Text(
      "Av. Luís Viana Filho, 9581 - Paralela",
      fontSize = 20.sp,
      modifier = Modifier.offset(y = 20.dp)
    )
    Text(
      "Salvador - BA, 41730-101",
      fontSize = 20.sp,
      modifier = Modifier.offset(y = 20.dp)
    )
  }
}