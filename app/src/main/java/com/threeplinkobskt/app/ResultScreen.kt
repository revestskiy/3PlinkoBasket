package com.threeplinkobskt.app

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun GameOverScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF2C0101)) // Задний фон 0xFF2C0101
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.resultbackground), // Фон "resultbackground"
                contentDescription = "Result Background",
                modifier = Modifier.fillMaxSize()
                    .size(320.dp, 355.dp)
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.backbutton), // Картинка "backbutton"
                        contentDescription = "Back Button",
                        modifier = Modifier
                            .size(50.dp)
                            .clickable {

                            }
                    )
                    Image(
                        painter = painterResource(id = R.drawable.againbutton), // Картинка "againbutton"
                        contentDescription = "Again Button",
                        modifier = Modifier
                            .size(140.dp,50.dp)
                            .clickable {

                            }
                    )
                }
            }
        }
    }
}