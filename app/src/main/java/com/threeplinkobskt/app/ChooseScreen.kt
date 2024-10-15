package com.threeplinkobskt.app

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.threeplinkobskt.app.ui.theme.nujnoefont


@Preview
@Composable
fun CharacterSelectionScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF2C0101))
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.backgroundchoose),
                    contentDescription = "Background Choose",
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(325.dp, 500.dp)
                )
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top,
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    fontFamily = nujnoefont,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 24.sp,
                                    color = Color.White,
                                    shadow = Shadow(
                                        color = Color(0xFF00B2FF),
                                        blurRadius = 6f
                                    )
                                )
                            ) {
                                append("CHOOSE A CHARACTER")
                            }
                        },
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 16.dp)
                    )
                    Spacer(modifier = Modifier.height(32.dp))
                    Row(
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.clickable {

                            }
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.basketwhite1),
                                contentDescription = "Stephen",
                                modifier = Modifier.size(130.dp, 300.dp)
                            )
                            Text(
                                text = "Stephen",
                                fontSize = 18.sp,
                                fontFamily = nujnoefont,
                                color = Color.White,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.clickable {

                            }
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.basketnotwhite1),
                                contentDescription = "Michael",
                                modifier = Modifier.size(130.dp, 300.dp)
                            )
                            Text(
                                text = "Michael",
                                fontSize = 18.sp,
                                fontFamily = nujnoefont,
                                color = Color.White,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}