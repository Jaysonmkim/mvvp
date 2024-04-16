package com.Jayson.mvvm_jayson.ui.theme.screens.home

import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

import androidx.navigation.compose.rememberNavController
import com.Jayson.mvvm_jayson.R
import com.Jayson.mvvm_jayson.navigation.ROUTE_ABOUT


@Composable
fun Homescreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.d),
            contentDescription ="Background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()

        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()

        ) {
            Text(
                text = "WELCOME TO \n   OUR APP",
                color = Color.White,
                fontFamily = FontFamily.Serif,
                fontSize = 30.sp
            )
            Spacer(modifier = Modifier.height(50.dp))
            Text(text = "Fresh food for every one",
                color = Color.White,
                fontSize = 20.sp,
            )
            Spacer(modifier = Modifier.height(50.dp))
            Text(text = "welcome tyo ouyr app, we amke food deliveries all over",
                color= Color.White,
                fontSize = 20.sp,
            )
            Spacer(modifier = Modifier.height(50.dp))

            OutlinedButton(
                onClick = {
                    navController.navigate(ROUTE_ABOUT)
                },
                colors = ButtonDefaults.buttonColors(Color.White),
                shape = RoundedCornerShape(56.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Sign in",
                    color = Color.Black,
                    fontSize = 30.sp

                )
            }

        }

    }
}
@Preview
@Composable
private fun Homeprev() {
    Homescreen(navController = rememberNavController())

}