package com.example.proyectorelampago

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectorelampago.R.layout
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_home.*

enum class ProviderType {
    BASIC
}

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Setup
        val bundle = intent.extras
        val email = bundle?.getString("email")
        val provider = bundle?.getString("provider")
        setup(email ?: "--", provider ?: "--")
    }

    private fun setup(email: String, provider: String) {

        title = "Inicio"
        emailTextView.text = email
        providerTextView.text = provider

        logOutbutton.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            onBackPressed()
        }
    }
}
