package id.ackerman.composekharizma

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
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

            Column() {
                
                CustomButton(text = "Button Pertama", Color.Red)
                CustomButton(text = "Button Kedua", Color.Green)

            }
            
        }
    }
}

@Composable
fun CustomButton(text: String, color: Color) {
    
    Button(
        onClick = {  },
        modifier = Modifier
            .padding(16.dp)
            .clip(RoundedCornerShape(18.dp)),
        colors = ButtonDefaults.buttonColors(backgroundColor = color)
    ) {

        Text(
            text = text,
            color = Color.Black
        )

    }
    
}
