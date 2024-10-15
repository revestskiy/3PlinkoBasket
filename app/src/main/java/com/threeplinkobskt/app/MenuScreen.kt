package com.threeplinkobskt.app

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun MainMenuScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF2C0101)) // Задний фон цвет 0xFF2C0101
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(34.dp))
            Image(
                painter = painterResource(id = R.drawable.monetbar), // Картинка "monetbar"
                contentDescription = "Monet Bar",
                modifier = Modifier
                    .size(130.dp, 40.dp)
            )
            Spacer(modifier = Modifier.height(64.dp))
            Image(
                painter = painterResource(id = R.drawable.playbutton), // Картинка "playbutton"
                contentDescription = "Play Button",
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .size(270.dp, 70.dp)
                    .clickable {

                    }
            )
            Image(
                painter = painterResource(id = R.drawable.skinsbutton), // Картинка "skingbutton"
                contentDescription = "Skins Button",
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .size(270.dp, 70.dp)
                    .clickable {

                    }
            )
            Spacer(modifier = Modifier.height(64.dp))
            Image(
                painter = painterResource(id = R.drawable.basketbackground), // Картинка "basketbackground"
                contentDescription = "Basket Background",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .size(400.dp)

            )
        }
    }
}