package com.shirleen.swaggy.ui.screens.about

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons

import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shirleen.swaggy.ui.theme.newBlue

@Composable
fun AboutScreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Spacer(modifier = Modifier.height(170.dp))

        Icon(
            imageVector = Icons.Filled.ShoppingCart,
            contentDescription = "shopping cart",
            modifier = Modifier.size(90.dp),
            tint = newBlue
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Easy Shopping",
            color = newBlue,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 40.sp,
            fontFamily = FontFamily.SansSerif

        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "All your shipments in one place! Stay in the loop and check your shipment whenever you want-from browsing to checkout, everything happens in one smooth flow. ",
            color = newBlue,
            fontSize = 18.sp,
            fontFamily = FontFamily.SansSerif,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.SemiBold

        )
        Spacer(modifier = Modifier.height(170.dp))


        Row(
            modifier = Modifier.padding(bottom = 24.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier.size(10.dp).background(color = newBlue, shape = CircleShape)
            )


            Spacer(modifier = Modifier.width(8.dp))

            Box(
                modifier = Modifier.size(10.dp).background(color = Color.LightGray, shape = CircleShape)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Box(
                modifier = Modifier.size(10.dp).background(color = Color.LightGray, shape = CircleShape)
            )

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                modifier = Modifier.padding(end = 10.dp, start = 200.dp)


            ) {
                Text(text = "Skip",
                    color = newBlue,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,


                )
            }



        }


    }




}

@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){

    AboutScreen()
}