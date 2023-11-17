package com.neuralfoundry.jetpackcomposelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.neuralfoundry.jetpackcomposelearning.ui.theme.JetpackComposeLearningTheme

class TextStyling : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Greeting4(name = "Jetpack Compose")
        }
    }
}

@Composable
fun Greeting4(name: String) {
    val fontFamily = FontFamily(
        Font(R.font.robotoslab_thin, FontWeight.Thin),
        Font(R.font.robotoslab_light, FontWeight.Light),
        Font(R.font.robotoslab_regular, FontWeight.Normal),
        Font(R.font.robotoslab_medium, FontWeight.Medium),
        Font(R.font.robotoslab_semibold, FontWeight.SemiBold),
        Font(R.font.robotoslab_bold, FontWeight.Bold),
        Font(R.font.robotoslab_extrabold, FontWeight.ExtraBold),
    )
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF000000))){
        Text(
            text = "$name",
            color= Color.White,
            fontSize = 30.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline

        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    JetpackComposeLearningTheme {
        Greeting4("JetPack Compose")
    }
}