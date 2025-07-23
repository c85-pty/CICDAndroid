package com.code4galaxy.cicdandroiddemo

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.code4galaxy.cicdandroiddemo.ui.theme.CICDAndroidDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CICDAndroidDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val context: Context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            modifier = Modifier
                .size(width = 340.dp, height = 300.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize()
                    .fillMaxWidth()
                    .padding(30.dp)
            ) {
                Text(
                    text = "Hello $name!, great Successfully",
                    modifier = modifier
                )
                Button(
                    onClick = {
                        Toast.makeText(context, "Hola Mundo UTP!", Toast.LENGTH_LONG).show()
                    }
                ) {
                    Text(text = "Imprimir mensaje")
                }
            }
        }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CICDAndroidDemoTheme {
        Greeting("Android")
    }
}