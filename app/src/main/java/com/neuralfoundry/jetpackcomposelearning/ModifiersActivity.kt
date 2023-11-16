package com.neuralfoundry.jetpackcomposelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.neuralfoundry.jetpackcomposelearning.ui.theme.JetpackComposeLearningTheme

class ModifiersActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Greeting3()
        }
    }
}

@Composable
fun Greeting3() {
    Column(
        modifier = Modifier
            .background(Color.Green)
            .fillMaxHeight(0.5f)        //50% of screen height
//            .width(600.dp)                    setting 600 dp width. But if the screen width is less
                                                //then the width will be limited to the screen width

            //.requiredWidth(600.dp)
            .fillMaxWidth()
            .padding(top = 50.dp)       //adding passing to top only. We can add padding how ever we want.
                                        //There are several options for padding.
            .border(5.dp,Color.Magenta)
            .padding(10.dp)
            .border(5.dp, Color.Blue)
            .padding(10.dp)
            .border(10.dp,Color.Red)
            .padding(10.dp)
    ){
        Text("Hello",modifier = Modifier
            .border(5.dp,Color.Yellow)
            .padding(5.dp)
            .offset(20.dp,20.dp)
            .border(10.dp, Color.Cyan)
            .padding(10.dp))
        Spacer(modifier=Modifier.height(50.dp))
        Text("World",modifier = Modifier.clickable {
            //add function to execute when the "World" heading is clicked
            //Other interactable  modifiers include zoomable, draggable, scrollable etc..
        })
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    JetpackComposeLearningTheme {
        Greeting3()
    }
}