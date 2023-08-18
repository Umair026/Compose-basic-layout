package com.example.compose_level_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_level_1.ui.theme.Compose_Level_1Theme
import com.example.compose_level_1.ui.theme.Green

class BusinessCard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_Level_1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Greeting3("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting3(name: String, modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        Column(
            modifier = modifier.align(alignment = Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_task_completed),
                contentDescription = null,
                Modifier.width(100.dp)
            )
            Text(
                text = "Umair Irshad",
                fontWeight = FontWeight.Bold,
                fontSize = 36.sp
            )
            Text(
                text = "Android Developer Extraordinaire",
                modifier = modifier.padding(top = 10.dp),
                color = Green
            )
        }

        Column(
            modifier = modifier
                .align(alignment = Alignment.BottomCenter)
                .padding(bottom = 20.dp)
        ) {

            RowItem(
                painter = painterResource(R.drawable.ic_call),
                "+92-342-2269994"
            )
            RowItem(
                painter = painterResource(id = R.drawable.ic_share),
                "@Android"
            )
            RowItem(
                painter = painterResource(id = R.drawable.ic_email),
                "umairdev02@gmail.com"
            )
        }
    }
}

@Composable
fun RowItem(painter: Painter, text: String) {

    Row {
        Image(
            painter = painter,
            contentDescription = null,
            Modifier.padding(end = 5.dp)
        )
        Text(
            text = text,
            Modifier.padding(bottom = 15.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    Compose_Level_1Theme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            Greeting3("Android")
        }
    }
}