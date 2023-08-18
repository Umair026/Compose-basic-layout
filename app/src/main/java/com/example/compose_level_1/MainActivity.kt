package com.example.compose_level_1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_level_1.ui.theme.Compose_Level_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_Level_1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PracticeTasks()
                }
            }
        }
    }
}

@Composable
private fun PracticeTasks(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier,
    ) {

        Text(
            text = "Jetpack Compose Tutorial",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(bottom = 50.dp)
        )

        val context = LocalContext.current

        MyButton(
            text = "Birthday Card",
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
            onClick = {
                context.startActivity(Intent(context, BirthdayCard::class.java))
            })

        MyButton(
            text = "Compose Article",
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
            onClick = {
                context.startActivity(Intent(context, ComposeArticle::class.java))
            },
        )
        MyButton(
            text = "Task Manager",
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
            onClick = {
                context.startActivity(Intent(context, TaskManagerUI::class.java))
            },
        )
        MyButton(
            text = "Compose Quadrant",
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
            onClick = { context.startActivity(Intent(context, ComposeQuadrant::class.java)) },
        )
        MyButton(
            text = "Business Card",
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
            onClick = { context.startActivity(Intent(context, BusinessCard::class.java)) },
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainActivityPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        PracticeTasks()

    }
}

@Composable
fun MyButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: (() -> Unit) = {}
) {
    Button(
        onClick = onClick,
        modifier = modifier
    ) {
        Text(text = text)
    }
}
