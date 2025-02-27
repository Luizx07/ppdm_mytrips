package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Gray)

    ){         Card(
        modifier = Modifier
            .width(150.dp)
            .height(50.dp)
            .align(Alignment.TopEnd),
        shape = RoundedCornerShape(
            bottomStart = 32.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.Black
        )
    ) {

    }
        Card(
            modifier = Modifier
                .width(150.dp)
                .height(50.dp)
                .align(Alignment.BottomStart),
            shape = RoundedCornerShape(
                topEnd = 32.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color.Black
            )
        ) {}
        Column (
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ){ Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Text(
                text = stringResource(
                    R.string.login
                ),
                color = Color.White,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
            )
            Text(
                text = stringResource(
                    R.string.sign_continue
                ),
                color = Color.DarkGray,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(bottom = 50.dp)
            )
            Column (
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.End,
            ){ TextField(
                value = "",
                onValueChange = {},
                label = { Text("text@gmail.com") },
                textStyle = TextStyle(color = Color.White,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                shape = RoundedCornerShape(15.dp),
            )
            TextField(
                value = "",
                onValueChange = {},
                label = { Text("**********") },
                textStyle = TextStyle(color = Color.White,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
                    .padding(bottom = 45.dp),
                shape = RoundedCornerShape(15.dp),

               )
            }
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(15.dp)
                    .height(50.dp)
                    .align(Alignment.End),
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.buttonColors(
                    Color.White
            )
            ) {
                Text(
                    text = stringResource(
                        R.string.sign_up
                    ),
                    fontSize = 22.sp,
                    color = Color.Black
                )
            }
            Row (
                modifier = Modifier
                    .padding(top = 5.dp)
                    .align(Alignment.End)
            ) {
                    Text(
                    text = stringResource(
                        R.string.account
                    ),
                        color = Color.White
                )
                Text(
                    text = stringResource(
                        R.string.sign_up,
                    ),
                    color = Color.DarkGray,
                    fontWeight = FontWeight.Bold

                )
            }
          }
        }
    }
}
@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}