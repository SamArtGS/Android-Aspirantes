package com.proteco.almacenesssa

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
        if (!TextUtils.isEmpty(correoOlvido.text.toString())) {
            mAuth!!.sendPasswordResetEmail(correoOlvido.text.toString())
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        val intent = Intent(this, Ingresa::class.java)
                        startActivity(intent)
                        Toast.makeText(this, "Email Enviado", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "No se encontró el usuario con este correo",
                            Toast.LENGTH_SHORT).show()
                    }
                }
        } else {
            Toast.makeText(this, "Ingrese un correo válido", Toast.LENGTH_SHORT).show()
        }
    }
}