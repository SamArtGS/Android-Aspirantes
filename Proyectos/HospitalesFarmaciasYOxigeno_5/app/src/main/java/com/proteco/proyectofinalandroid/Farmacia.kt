package com.proteco.proyectofinalandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_farmacia.*

class Farmacia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_farmacia)

        btn_Far.setOnClickListener {
            val intent : Intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }
    }
}