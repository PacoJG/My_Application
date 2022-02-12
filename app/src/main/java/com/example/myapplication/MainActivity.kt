package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = 5
        val b = 10
        val c = a+b
        Log.i("INFORMACION", "El valor de a es $a")
        Log.i("INFORMACION", "El valor de b es $b")
        Log.i("INFORMACION", "El valor de a + b es $c")
        Log.i("INFORMACION", "El valor de a * b es ${a*b}")
        Log.i("INFORMACION", "El nombre de la app es: ${getString(R.string.app_name)}")
    }
}