package com.proteco.proyectofinalandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton_farmacia.setOnClickListener {
            val intent: Intent = Intent(this,Farmacia::class.java)
            startActivity(intent)
        }

        boton_hospital.setOnClickListener {
            val intent: Intent = Intent(this,Hospital::class.java)
            startActivity(intent)
        }

        boton_oxigeno.setOnClickListener {
            val intent: Intent = Intent(this,Oxigeno::class.java)
            startActivity(intent)
        }
    }
}