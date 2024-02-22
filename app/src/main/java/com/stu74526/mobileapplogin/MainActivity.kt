package com.stu74526.mobileapplogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.stu74526.mobileapplogin.ui.theme.MobileAppLoginTheme
import java.util.stream.IntStream

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column (modifier = Modifier
                .background(Color.Red)
                .fillMaxHeight()
                .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround)
                {
                    Box(
                        modifier = Modifier
                        .height(150.dp)
                        .width(150.dp)
                        .background(Color.White)
                    )
                    Column (modifier = Modifier
                        .height(50.dp)
                        .fillMaxWidth()
                        , horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Mobile Server Name", color=Color.White,
                            fontSize = 20.sp,fontWeight = FontWeight.Bold)
                        Text(text = "Please provide your server credentials", color = Color.White)
                    }
                    Column(modifier = Modifier.width(300.dp) ,
                        horizontalAlignment = Alignment.CenterHorizontally)
                    {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(300.dp)
                                .background(Color.White)

                            , contentAlignment = Alignment.CenterStart
                        )
                        {
                            Column (modifier = Modifier
                                .fillMaxHeight()
                                .padding(all = 10.dp),
                                verticalArrangement = Arrangement.SpaceAround
                            ){
                                Text(text = "Username", color = Color.Gray,
                                    fontSize = 18.sp)
                                Box(modifier = Modifier
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .background(Color.Gray))
                                Text(text = "Password", color = Color.Gray,
                                    fontSize = 18.sp)
                                Box(modifier = Modifier
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .background(Color.Gray))
                            }
                        }
                        Row (modifier = Modifier
                            .padding(vertical = 20.dp)

                            .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                            , verticalAlignment = Alignment.CenterVertically

                        )
                        {
                            Box(
                                modifier = Modifier
                                    .height(40.dp)
                                    .width(145.dp)
                                    .background(Color.White)
                                , contentAlignment = Alignment.Center
                            )
                            {
                                Text(text = "CANCEL",
                                    fontSize = 20.sp,fontWeight = FontWeight.Bold,
                                    color = Color.Gray)
                            }
                            Box(
                                modifier = Modifier
                                    .height(40.dp)
                                    .width(145.dp)
                                    .background(Color.White)
                                , contentAlignment = Alignment.Center
                            )
                            {
                                Text(text = "LOGIN", color = Color.Red,
                                    fontSize = 20.sp,fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                    Text(text = "Footer text goes here", color = Color.White)
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MobileAppLoginTheme {
        Greeting("Android")
    }
}