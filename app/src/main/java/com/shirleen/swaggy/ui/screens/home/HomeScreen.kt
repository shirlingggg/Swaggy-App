package com.shirleen.swaggy.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.shirleen.swaggy.R
import com.shirleen.swaggy.navigation.ROUT_ITEM
import com.shirleen.swaggy.ui.theme.newPurple
import com.shirleen.swaggy.ui.theme.newPurpleLight

@Composable
fun HomeScreen(navController: NavController){
    Column(

        modifier = Modifier.fillMaxSize().background(newPurpleLight),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(R.drawable.clothes),
            contentDescription = "Clothes",
            modifier = Modifier.size(300.dp).clip(shape = CircleShape),
            contentScale = ContentScale.Crop
            )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Swaggy",
            fontSize = 40.sp,
            color = newPurple,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold
            )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Find More Products!!!!",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Find men's and women's clothes from your number one supplier!",
            fontSize = 20.sp,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                navController.navigate(ROUT_ITEM)
            },
             colors= ButtonDefaults.buttonColors(newPurple),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)

        ) {

            Text(text = "Get Started...")
        }








    }

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){

    HomeScreen(rememberNavController())
}