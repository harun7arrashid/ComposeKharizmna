package id.ackerman.composekharizma

import android.annotation.SuppressLint
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.ackerman.composekharizma.ui.theme.ComposeKharizmaTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnrememberedMutableState")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            ScaffoldExample()

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

@Composable
fun CustomCheckBox(
    title: String,
    checkboxState: Boolean,
    onCheckboxPressed: ((Boolean) -> Unit)?
) {

    Row(
        modifier = Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Checkbox(
            checked = checkboxState,
            onCheckedChange = onCheckboxPressed
        )

        Spacer(modifier = Modifier.padding(4.dp))
        Text(text = title)

    }

}

@Composable
fun ScaffoldExample() {
    val materialBlue700 = Color(0xff1976D2)  // kode color di compose itu diawali dgn 0xff
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Scaffold Tutorial") },
                backgroundColor = materialBlue700
            )
        },

        bottomBar = {

            BottomAppBar(backgroundColor = materialBlue700) {

                Text("Bottom bar")

            }
        },

        floatingActionButton = {

            FloatingActionButton(onClick = {}) {

                Text("+")

            }
        },

        floatingActionButtonPosition = FabPosition.End,
        drawerContent = { Text(text = "Ini drawer") },
        content = { Text(text = "Ini Konten") }

    )
}