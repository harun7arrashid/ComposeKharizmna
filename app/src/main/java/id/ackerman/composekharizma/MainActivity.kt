package id.ackerman.composekharizma

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @SuppressLint("UnrememberedMutableState")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val ubuntu = FontFamily(
                Font(R.font.ubuntu_regular, FontWeight.Normal),
                Font(R.font.ubuntu_medium, FontWeight.Medium)
            )

        setContent {
            Column(Modifier.padding(16.dp)) {
                Text(
                    text = "Custom Text",
                    fontSize = 28.sp,
                    fontFamily = ubuntu,
                    fontWeight = FontWeight.Thin // fontWeight ini ada batasannya tergantung dari fontFamily yg kita gunakan
                )
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

@Composable
fun HitungLuas() {

    var panjangState by remember { mutableStateOf("") }

    var lebarState by remember { mutableStateOf("") }

    var hasilState by remember { mutableStateOf(0) }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar   = {

            TopAppBar(title = { Text(text = "Persegi Panjang") })

        }
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp) // margin
        ) {

            TextField(
                value = panjangState,
                label = { Text("Panjang") },
                onValueChange = { panjangState = it },
                modifier = Modifier.fillMaxWidth()
            )

            TextField(
                value = lebarState,
                label = { Text("Lebar") },
                onValueChange = { lebarState = it },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.padding(16.dp))

            Button(
                onClick = {
                    hasilState = panjangState.toInt() * lebarState.toInt()
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Hitung")
            }

            Spacer(modifier = Modifier.padding(16.dp))

            Text(
                text = hasilState.toString(),
                style = TextStyle(
                    fontSize = 22.sp,
                    color = Color.Black
                )
            )
        }
    }
}

@Composable
private fun SetupRecyclerView() {

    LazyColumn() {
        itemsIndexed(listOf("Budi", "Fajar", "Teguh", "Didin")) { index, data ->

            Text(
                text = "list  $data",
                fontSize = 18.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)

            )

        }
        items(count = 300) {
            Text(
                text = "list $it",
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)

            )
        }
    }

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier.verticalScroll(scrollState)
    ) {

        for (i in 1..50) {

            Text(
                text = "list $i",
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)

            )
        }
    }

}