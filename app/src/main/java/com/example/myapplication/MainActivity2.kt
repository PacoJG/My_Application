package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity(), View.OnClickListener {

    //Poner variables en inicializacion tardia, asi podremos usar tvSaludo
    private lateinit var tvSaludo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //vinculacion
        val btnSaludar = findViewById<Button>(R.id.btnSaludar)
        btnSaludar.setOnClickListener(this)
        //vinculacion con la variable global
        tvSaludo = findViewById(R.id.tvSaludo)
        tvSaludo.setOnClickListener(this)
    }

    //Funcion para hacer acciones a las views clickeables
    override fun onClick(view: View?) {
        when(view?.id){
            //Boton saludar
            R.id.btnSaludar -> {
                //val tvSaludo = findViewById<TextView>(R.id.tvSaludo)
                tvSaludo.text = "Hola Sergio"
            }
            //Text view saludo
            R.id.tvSaludo ->{
                tvSaludo.text = "Hola diplomado"
            }
        }
    }
}