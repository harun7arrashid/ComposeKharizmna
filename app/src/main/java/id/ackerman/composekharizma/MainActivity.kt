package id.ackerman.composekharizma

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.ackerman.composekharizma.ui.theme.ComposeKharizmaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            // gda vertical dan horizontal, jd Box ini kek menimpa satu sama lain
            Box(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .fillMaxHeight(0.5f) // setengah dari layar
                    .background(color = Color.Red)
                    .padding(16.dp)
            ) {

                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .background(color = Color.Yellow)
                        .padding(16.dp)
                        .border(2.dp, color = Color.Black)
                        .padding(16.dp)
                        .border(width = 2.dp, color = Color.Blue)
                )
            }
        }
    }
}
