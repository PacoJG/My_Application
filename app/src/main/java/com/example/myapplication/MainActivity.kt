package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        val a = 5
        val b = 10
        val c = a+b
        Log.i("INFORMACION", "El valor de a es $a")
        Log.i("INFORMACION", "El valor de b es $b")
        Log.i("INFORMACION", "El valor de a + b es $c")
        Log.i("INFORMACION", "El valor de a * b es ${a*b}")
        Log.i("INFORMACION", "El nombre de la app es: ${getString(R.string.app_name)}") */

        //Vinculacion basica para los id's
        val tvSaludo = findViewById<TextView>(R.id.tvSaludo)
        val btnSaludar = findViewById<Button>(R.id.btnSaludar)

        //Listener del boton, cuando es presionado, programamos lo que queremos que se haga
        //Primera forma de crear acciones a views
        btnSaludar.setOnClickListener {
            tvSaludo.text = "Hola Francisco"
        }


    }
}