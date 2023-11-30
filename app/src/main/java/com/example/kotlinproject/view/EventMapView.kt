package com.example.kotlinproject.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.kotlinproject.R

@Composable
fun EventMapView(
  innerPadding: PaddingValues
) {
  Column(
    modifier = Modifier.padding(innerPadding)
  ) {
    Image(
      painter = painterResource(id = R.drawable.eventmap),
      contentDescription = "Even Map"
    )
  }
}