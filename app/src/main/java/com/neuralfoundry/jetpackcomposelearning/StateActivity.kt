package com.neuralfoundry.jetpackcomposelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.neuralfoundry.jetpackcomposelearning.ui.theme.JetpackComposeLearningTheme
import kotlin.random.Random

class StateActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(Modifier.fillMaxSize()) {
                val color = remember {
                    mutableStateOf(Color.Yellow)
                }
                ChangeColour(
                    Modifier
                        .weight(1f)
                        .fillMaxSize()

                ){
                    color.value = it
                }
                Box(modifier = Modifier.background(color.value).weight(1f).fillMaxSize())
            }

        }
    }
}

@Composable
fun ChangeColour(modifier: Modifier = Modifier,
                 updateColor: (Color) -> Unit) {
//    var color = remember{
//        mutableStateOf(Color.Yellow)
//    }
    //color is a state variable
    //the initial value of variable color is yellow
    //remember -> is a lambda function that helps to retain the state of a variable during recomposing.
    //if remember is not put, as per this code, when a click event is detected, the ChangeColour composable
    //re-renders or redraws itself, the value of color variable gets refreshed to yellow every time. Therefore no
    //changes will be visible on screen.

    Box(modifier = modifier
        .background(Color.Red)
        .clickable {
            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            )
        })
}

@Preview(showBackground = true)
@Composable
fun ChangeColourPreview() {
    JetpackComposeLearningTheme {
//        ChangeColour()
    }
}