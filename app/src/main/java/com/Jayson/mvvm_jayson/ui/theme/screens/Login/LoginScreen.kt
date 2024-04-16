package com.Jayson.mvvm_jayson.ui.theme.screens.Login


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField

import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.Jayson.mvvm_jayson.R
import com.Jayson.mvvm_jayson.navigation.ROUTE_LOGIN


@Composable
fun LoginScreen(navController: NavController) {
    var username by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.d ),
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
                text = "WELCOME BACK",
                color = Color.White,
                fontFamily = FontFamily.Serif,
                fontSize = 30.sp
            )
            Spacer(modifier = Modifier.height(50.dp))
            Text(text = "Login to your Account",
                color = Color.White,
                fontSize = 20.sp,
            )
            Spacer(modifier = Modifier.height(50.dp))
            OutlinedTextField(
                value = username,
                onValueChange = {username=it},
                leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "person")},
                label = { Text(text = "User Name/Mail" ,
                    color=Color.White,
                    fontFamily = FontFamily.Default,



                    ) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                shape = RoundedCornerShape(16.dp),


                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                keyboardActions = KeyboardActions()
            )
            Spacer(modifier = Modifier.height(50.dp))
            OutlinedTextField(
                value = password,
                onValueChange = {password=it},
                leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "password") },
                label = { Text(text = "Password" ,
                    color=Color.White,
                    fontFamily = FontFamily.Default,
                ) },
//                colors = TextFieldDefaults.O.colors(
//                    backgroundColor = Color.White, // does not work
//                    unfocusedBorderColor = Color.Red,
//                    textColor = Color.Red
//                ),




                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                shape = RoundedCornerShape(16.dp),


                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                keyboardActions = KeyboardActions()
            )
            Spacer(modifier = Modifier.height(50.dp))


            OutlinedButton(
                onClick = {
                    navController.navigate(ROUTE_LOGIN)
                },
                colors = ButtonDefaults.buttonColors(Color.White),
                shape = RoundedCornerShape(56.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Login ",
                    color = Color.Black,
                    fontSize = 30.sp

                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Don't have an account?             Sign up",
                color= Color.White

            )

        }

    }
}
@Preview
@Composable
private fun Welcomeprev() {
    LoginScreen(navController = rememberNavController())

}