package id.ackerman.composekharizma

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.ackerman.composekharizma.ui.theme.ComposeKharizmaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(
                modifier = Modifier.padding(16.dp)
            ) {

                Column(
                    modifier = Modifier
                        .border(width = 1.dp, color = Color.Red)
                        .fillMaxWidth() // match_parent
                        .height(200.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(text = "Jetpack Compose Mantap 1")
                    Text(
                        text = "Text ke 2",
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )

                }

                Spacer(modifier = Modifier.padding(16.dp))

                Row(
                    modifier = Modifier
                        .border(width = 1.dp, color = Color.Blue)
                        .fillMaxWidth() // match_parent
                        .height(200.dp),
                    horizontalArrangement = Arrangement.Center // ngakalin gmna caranya center di Row
                ) {

                    Text(
                        text = "Jetpack Compose Mantap 1",
                        modifier = Modifier.align(
                            Alignment.CenterVertically
                        )
                    )
                    Text(
                        text = "Mantap 2",
                        modifier = Modifier.align(
                            Alignment.CenterVertically
                        )
                    )

                }
            }
        }
    }
}
