package com.example.test123

import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val warna1 = 0xf6942066

class DemoActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Red)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.download_logo_polban_2),
                    contentDescription = "")

                Surface(color = Color.Blue, modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "halo bandung by egi",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp,16.dp,16.dp,4.dp),
                        color = Color(warna1),
                        textAlign = TextAlign.Center
                    )
                }

                Surface(color = Color.Cyan, modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "by egi",
                        modifier = Modifier.padding(16.dp,0.dp,16.dp,4.dp),
                        color = Color.Green,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}