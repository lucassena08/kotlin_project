package com.example.kotlinproject.view

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.kotlinproject.R

@Composable
fun EventMapView(

) {

  Image(
    painter = painterResource(id = R.drawable.eventmap),
    contentDescription = "Even Map"
  )

}