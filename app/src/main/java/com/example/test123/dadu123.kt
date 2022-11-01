package com.example.test123

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arc.latihan.R

class dadu123 :ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Dadu()
        }
    }
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Dadu(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {

        var diceValue by remember{
            mutableStateOf(1)
        }

        val image = when (diceValue){
            1 -> R.drawable.ic_launcher_background
            2 -> R.drawable.ic_launcher_background
            3 -> R.drawable.ic_launcher_background
            4 -> R.drawable.ic_launcher_background
            5 -> R.drawable.ic_launcher_background
            6 -> R.drawable.ic_launcher_background
            else -> {
                R.drawable.ic_launcher_foreground
            }
        }

        Image(painter = painterResource(
            id = R.drawable.ic_launcher_background ),
            contentDescription ="Gambar"
        )
        Spacer(
            modifier = Modifier.height(24.dp)
        )
        Button(
            onClick = {
                diceValue = (1..6).random()
            },
            content = {
                Text(text = "Roll")
            }
        )

    }

}