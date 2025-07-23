package com.shirleen.swaggy.ui.screens.about

import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
        Icon(
            imageVector = Icons.Filled.ShoppingCart,
            contentDescription = "shopping cart",
            modifier = Modifier.size(90.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Easy Shopping",
            color = newBlue,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 30.sp,
            fontFamily = FontFamily.Monospace

        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "All your shipments in one place! Stay in the loop and check your shipment whenever you want!",
            color = newBlue,
            fontSize = 15.sp,
            fontFamily = FontFamily.Monospace,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(100.dp))


        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Spacer(modifier = Modifier.width(10.dp))

            Text(text = "Skip",
            color = newBlue,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.padding(end = 10.dp)


            )
        }


    }




}

@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){

    AboutScreen()
}