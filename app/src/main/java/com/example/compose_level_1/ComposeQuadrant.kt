package com.example.compose_level_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_level_1.ui.theme.Compose_Level_1Theme

class ComposeQuadrant : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_Level_1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting2("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {

    Column {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(0.5F),

            ) {
            Quadrant(
                "Text composable",
                "Displays text and follows the recommended Material Design guidelines.",
                Modifier
                    .weight(0.5F)
                    .background(Color(0xFFEADDFF))
            )

            Quadrant(
                "Image composable",
                "Creates a composable that lays out and draws a given Painter class object.",

                Modifier
                    .weight(0.5F)
                    .background(Color(0xFFD0BCFF))
            )
        }
        Row(
            modifier = Modifier.weight(0.5F)
        ) {
            Quadrant(
                "Row composable",
                "A layout composable that places its children in a horizontal sequence.",

                Modifier
                    .weight(0.5F)
                    .background(Color(0xFFB69DF8))
            )

            Quadrant(
                "Column composable",
                "A layout composable that places its children in a vertical sequence.",

                Modifier
                    .weight(0.5F)
                    .background(Color(0xFFF6EDFF))
            )
        }
    }

}

@Composable
fun Quadrant(heading: String, desc: String, modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize(),
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            content = {
                Text(
                    text = heading,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = desc,
                    textAlign = TextAlign.Justify,
                    )
            })
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    Compose_Level_1Theme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            Greeting2("Android")
        }
    }
}