package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }

        //planeta
        // Crear una instancia de la clase Planeta
        val tierra = Planeta("Jupiter", "Gaseoso", 1.89813e27)

        // Mostrar información sobre la Tierra
        val Informacion = tierra.obtenerInformacion()
       println("Informaciondel planeta" +Informacion )

        // Cambiar el tipo de la Tierra
        tierra.cabiarTipo("Gaseoso")
        println( "Nuevo tipo del planeta: ${tierra.tipo}")

        // Aumentar la masa de la Tierra
        tierra.aumentarMasa(1e24)
       println("Nueva masa del planeta: ${tierra.masa}")


        //Triangulo

        val triangulo =Triangulo(2.1,3.2,4.1)
        val tipoTriangulo =triangulo.TipoTriangulo()
        println("Tipo de triangulo : $tipoTriangulo")

        val esRectangulo =triangulo.Rectangulo()
        if(esRectangulo) {
            println("Es rectangulo")
        } else{
            print("No lo es")
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
    MyApplicationTheme {
        Greeting("Android")
    }
}