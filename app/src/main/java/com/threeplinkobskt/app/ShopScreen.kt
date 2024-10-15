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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun SkinsSelectionScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF2C0101))
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.backbutton),
                    contentDescription = "Back Button",
                    modifier = Modifier
                        .size(33.dp)
                        .clickable {

                        }
                )
                Image(
                    painter = painterResource(id = R.drawable.monetbackground2),
                    contentDescription = "Monet Background",
                    modifier = Modifier
                        .size(96.dp, 33.dp)
                )
            }
            Spacer(modifier = Modifier.height(32.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(32.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.unlocked),
                        contentDescription = "Unlocked Skin",
                        modifier = Modifier.size(140.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Image(
                        painter = painterResource(id = R.drawable.monet0),
                        contentDescription = "Monet 0",
                        modifier = Modifier.size(140.dp, 35.dp)
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.locked1),
                        contentDescription = "Locked Skin 1",
                        modifier = Modifier.size(140.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Image(
                        painter = painterResource(id = R.drawable.buybutton100),
                        contentDescription = "Buy Button 100",
                        modifier = Modifier
                            .size(140.dp, 35.dp)
                            .clickable {

                            }
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.locked2),
                        contentDescription = "Locked Skin 2",
                        modifier = Modifier.size(140.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Image(
                        painter = painterResource(id = R.drawable.buybutton100),
                        contentDescription = "Buy Button 100",
                        modifier = Modifier
                            .size(140.dp, 35.dp)
                            .clickable {

                            }
                    )
                }
            }
        }
    }
}