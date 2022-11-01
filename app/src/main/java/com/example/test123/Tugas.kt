package com.example.test123

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Tugas : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EchoText()
        }
    }
}
    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun EchoText() {
        var displayedText = remember {
            mutableStateOf("")
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ){
            OutlinedTextField(
                value = displayedText.value,
                onValueChange = {
                    displayedText.value = it
                },
                label = { Text(text = "Nama")}
            )
            Spacer(modifier = Modifier.heightIn(24.dp))
            Text(
                text = "Halo "+ displayedText.value +", Egi"
            )
        }
    }