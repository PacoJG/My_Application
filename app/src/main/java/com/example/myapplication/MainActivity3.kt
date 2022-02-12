package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }

    //Tercera forma de crear acciones a views, agregar funcion clicks en "onclick" dentro del archivo xml
    fun clicks(view: View) {
        //vinculacion
        val tvSaludo = findViewById<TextView>(R.id.tvSaludo)

        when(view.id){
            R.id.btnSaludar ->{
                tvSaludo.text = "Hola amigos"
            }
            R.id.tvSaludo ->{
                tvSaludo.text = "Hola amigas"
            }
        }
    }
}