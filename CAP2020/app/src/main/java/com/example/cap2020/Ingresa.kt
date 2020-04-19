package com.example.cap2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Ingresa : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresa)
        private lateinit var auth: FirebaseAuth// ...
        auth = FirebaseAuth.getInstance()
    }
}
