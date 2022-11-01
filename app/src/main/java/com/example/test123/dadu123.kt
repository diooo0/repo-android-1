package com.example.test123

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class DaduActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiceApp()
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DiceApp(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        var diceValue by remember {
            mutableStateOf(1)
        }

        val image = when (diceValue) {
            1 -> R.drawable.dice_1_b_svg
            2 -> R.drawable.dice_2_b_svg
            3 -> R.drawable.dice_3_b_svg
            4 -> R.drawable.dice_4_b_svg
            5 -> R.drawable.dice_5_b_svg
            else -> {
                R.drawable.dice_6_b_svg
            }
        }

        androidx.compose.foundation.Image(
            painter = painterResource(id = image),
            contentDescription = null
        )

        Spacer(
            modifier = Modifier.height(28.dp)
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
