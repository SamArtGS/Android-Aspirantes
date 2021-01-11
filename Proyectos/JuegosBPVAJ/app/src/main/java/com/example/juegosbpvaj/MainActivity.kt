package com.example.juegosbpvaj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        juego1.setOnClickListener {
            val intento1= Intent(this,juego1::class.java)
                startActivity(intento1)
            }
        }

    }

}