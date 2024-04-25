package com.example.iasprueba

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.widget.AppCompatButton
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.iasprueba.empleados.GestionEmpleados
import com.example.iasprueba.ui.theme.IASpruebaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val gestion = GestionEmpleados();
        gestion.main();

        setContent {
            IASpruebaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }

                val btnStart = findViewById<AppCompatButton>(R.id.btnStart)

                btnStart.setOnClickListener {

                    val gestion = GestionEmpleados();
                    gestion.main();

                    val intent = Intent(this, ResultActivity::class.java)

                    startActivity(intent)

                }
            }
        }


    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IASpruebaTheme {
        Greeting("Android")
    }
}