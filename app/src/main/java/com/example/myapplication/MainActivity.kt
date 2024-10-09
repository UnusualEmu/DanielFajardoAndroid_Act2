package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // Referenciamos los TextViews
        val textUno = findViewById<TextView>(R.id.textOne)
        val textDos = findViewById<TextView>(R.id.textOne2)

        // Referenciamos el ConstraintLayout
        val constraintLayout = findViewById<ConstraintLayout>(R.id.main)

        // Obtenemos el color desde colors.xml
        val color = resources.getColor(R.color.color_fondo, theme) //Usamos el color de xml para esto

        // Referenciamos el botón
        val button = findViewById<Button>(R.id.button)

        // Configuramos el listener para cambiar el fondo al presionar el botón y el texto desde xml
        button.setOnClickListener {
            constraintLayout.setBackgroundColor(color)
            textUno.text = getString(R.string.text_two)
            textDos.text = getString(R.string.text_one)
        }
    }
}
