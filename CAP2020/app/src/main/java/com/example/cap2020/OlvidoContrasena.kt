package com.example.cap2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_ingresa.*
import kotlinx.android.synthetic.main.activity_olvido_contrasena.*

class OlvidoContrasena : AppCompatActivity() {

    private var mAuth: FirebaseAuth? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_olvido_contrasena)
        enviar.setOnClickListener {
            enviarCorreo()
        }
    }
    fun enviarCorreo(){
        mAuth = FirebaseAuth.getInstance()
        if (!TextUtils.isEmpty(correoIngresa.text.toString())) {
            mAuth!!
                .sendPasswordResetEmail(correoIngresa.text.toString())
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(this, "Email Enviado", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, MainActivity::class.java)
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "No se encontró el usuario con este correo", Toast.LENGTH_SHORT).show()
                    }
                }
        } else {
            Toast.makeText(this, "Ingrese un correo", Toast.LENGTH_SHORT).show()
        }
    }
}
