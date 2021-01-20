package com.proteco.proyectofinalandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hospital.*

class Hospital : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospital)

        btn_Hos.setOnClickListener {
            val intent : Intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }
    }
}