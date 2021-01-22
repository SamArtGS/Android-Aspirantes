package com.proteco.proyectofinalandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_oxigeno.*

class Oxigeno : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oxigeno)

        btn_Ox.setOnClickListener {
            val intent : Intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }
    }
}