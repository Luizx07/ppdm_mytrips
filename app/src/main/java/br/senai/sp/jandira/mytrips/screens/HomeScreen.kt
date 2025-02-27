package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Blue)

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
    }
}

@Preview(showSystemUi =  true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}