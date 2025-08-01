package com.shirleen.swaggy.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.shirleen.swaggy.R
import com.shirleen.swaggy.navigation.ROUT_HOME
import com.shirleen.swaggy.navigation.ROUT_ITEM
import com.shirleen.swaggy.ui.theme.newPurple

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){
//Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {

        },

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = newPurple
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        //navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.DateRange, contentDescription = "Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.BookmarkBorder, contentDescription = "Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.AccountCircle, contentDescription = "Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }

                )


            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = Color.LightGray,
                modifier = Modifier.offset(y = 50.dp)
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())



            ) {


                //Main Contents of the page
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier.padding(start = 10.dp)
                    ) {
                        Text(text = "Hi Samantha", fontSize = 40.sp, fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(15.dp))
                        Text("Here are your projects", fontSize = 17.sp)
                        Spacer(modifier = Modifier.height(8.dp))
                    }

                    Image(
                        painter = painterResource(R.drawable.welcome),
                        contentDescription = "welcome",
                        modifier = Modifier.size(150.dp)
                    )

                }



                Spacer(modifier = Modifier.height(40.dp))

                //Row
                Row(
                    modifier = Modifier.padding(start = 20.dp).horizontalScroll(rememberScrollState())


                ) {
                    //Card
                    Card(
                        onClick = {navController.navigate(ROUT_HOME)},
                        modifier = Modifier.width(150.dp).height(250.dp),
                        elevation = CardDefaults.elevatedCardElevation(5.dp),
                        //colors = CardDefaults.cardColors(newPurple)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(R.drawable.crypto),
                                contentDescription = "Clothes",
                                modifier = Modifier.fillMaxWidth().height(300.dp),
                                contentScale = ContentScale.Crop
                            )


                            Text(text = "Cryptocurrency landing page", fontSize = 17.sp, fontWeight = FontWeight.Bold, color = Color.LightGray, modifier = Modifier.padding(start = 20.dp, top = 20.dp))
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(text = "12 tasks", fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color.LightGray,  modifier = Modifier.padding(top = 250.dp, end = 45.dp))
                        }
                    }
                    //End of card


                    Spacer(modifier = Modifier.width(15.dp))

                    //Card
                    Card(
                        onClick = {},
                        modifier = Modifier.width(150.dp).height(250.dp),
                        elevation = CardDefaults.elevatedCardElevation(5.dp),
                        //colors = CardDefaults.cardColors(newPurple)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(R.drawable.orange),
                                contentDescription = "Clothes",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                            Text(text = "Statistics Dashboard", fontSize = 17.sp, fontWeight = FontWeight.Bold, color = Color.LightGray, modifier = Modifier.padding(start = 20.dp, top = 20.dp))
                            Spacer(modifier = Modifier.height(6.dp))

                            Text(text = "2 tasks", fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color.LightGray,  modifier = Modifier.padding(top = 250.dp, end = 45.dp))
                        }
                    }
                    //End of card


                    Spacer(modifier = Modifier.width(15.dp))

                    //Card
                    Card(
                        onClick = {},
                        modifier = Modifier.width(150.dp).height(250.dp),
                        elevation = CardDefaults.elevatedCardElevation(5.dp),
                        //colors = CardDefaults.cardColors(newPurple)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(R.drawable.teal),
                                contentDescription = "Clothes",
                                modifier = Modifier.fillMaxWidth().height(300.dp),
                                contentScale = ContentScale.Crop
                            )

                            Text(text = "Cryptocurrency landing page", fontSize = 17.sp, fontWeight = FontWeight.Bold, color = Color.LightGray, modifier = Modifier.padding(start = 20.dp, top = 20.dp))
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(text = "12 tasks", fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color.LightGray,  modifier = Modifier.padding(top = 250.dp, end = 45.dp))
                        }
                    }
                    //End of card


                    Spacer(modifier = Modifier.height(30.dp))

                }
            //End of Row
                Spacer(modifier = Modifier.height(30.dp))



                //Card- personal tasks
                Card(
                    onClick = {},
                    modifier = Modifier.fillMaxSize(),
                    shape = RoundedCornerShape(16.dp),
                    elevation = CardDefaults.elevatedCardElevation(5.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp),

                    ) {
                        Text(
                            text = "Personal Tasks",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp

                        )
                        Spacer(modifier = Modifier.height(10.dp))


                        //NDA Card
                        Card(
                            onClick = {},
                            colors = CardDefaults.cardColors(containerColor = Color.White),
                            modifier = Modifier.height(100.dp).fillMaxWidth(),

                        ) {
                            Row(

                            ) {
                                Box(
                                    modifier = Modifier.fillMaxWidth()

                                ) {
                                    Image(painter = painterResource(R.drawable.video),
                                        contentDescription = "Video",
                                        modifier = Modifier.width(70.dp).height(70.dp).padding(start = 15.dp, top = 10.dp),
                                        contentScale = ContentScale.FillBounds
                                    )

                                    Text(
                                        text = "NDA Review for Website project",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 15.sp,
                                        modifier = Modifier.padding(start = 10.dp, top = 20.dp).fillMaxWidth(),
                                        textAlign = TextAlign.Center
                                    )
                                }
                            }
                            Column() {
                                Text(
                                    text = "Today- 10pm",
                                    modifier = Modifier.padding(start = 50.dp, end = 50.dp).fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )

                            }
                        }
                    //End of NDA Card

                        Spacer(modifier = Modifier.height(20.dp))


                        //Email Card
                        Card(
                            onClick = {},
                            colors = CardDefaults.cardColors(containerColor = Color.White),
                            modifier = Modifier.height(100.dp).fillMaxWidth(),

                            ) {
                            Row(

                            ) {
                                Box(
                                    modifier = Modifier.fillMaxWidth()

                                ) {
                                    Image(painter = painterResource(R.drawable.email),
                                        contentDescription = "Video",
                                        modifier = Modifier.width(60.dp).height(60.dp).padding(start = 15.dp, top = 10.dp),
                                        contentScale = ContentScale.FillBounds
                                    )

                                    Text(
                                        text = "Email Reply for Green Project",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 15.sp,
                                        modifier = Modifier.padding(start = 10.dp, top = 20.dp).fillMaxWidth(),
                                        textAlign = TextAlign.Center
                                    )
                                }
                            }
                            Column() {
                                Text(
                                    text = "Today- 10pm",
                                    modifier = Modifier.padding(start = 50.dp, end = 50.dp).fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )

                            }
                        }
                        //End of Email Card




                    }

                }

                //end of card


            }
        }
    )

    //End of scaffold






}

@Preview
@Composable
fun DashboardScreenPreview(){

    DashboardScreen(rememberNavController())
}