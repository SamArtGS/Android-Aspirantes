package com.example.cap2020

import android.R.attr.button
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_ingresa.*


class Ingresa : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresa)
        botonRegistro.setOnClickListener{
            val intent = Intent(this, Registro::class.java)
            startActivity(intent)
        }
        botonOlvidoContrasena.setOnClickListener{
            val intent = Intent(this,OlvidoContrasena::class.java)
            startActivity(intent)
        }


        botonIngreso.setOnClickListener {
            ingresar()
        }
    }
    private lateinit var mAuth: FirebaseAuth
    fun ingresar(){
        mAuth = FirebaseAuth.getInstance()
        val email = correoIngresa.text.toString()
        val password = contrasenaIngresa.text.toString()
        if (!TextUtils.isEmpty(email) && !TextUtils.isEmpty(password)) {
            //Iniciamos sesión con el método signIn y enviamos usuario y contraseña
            mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) {
                        task ->
                    if (task.isSuccessful) {
                        val intent = Intent(this,MainActivity::class.java)
                        startActivity(intent)
                    } else {
                        // sino le avisamos el usuairo que orcurrio un problema
                        Toast.makeText(this, "Nombre de usuario/contraseña incorrecto",
                            Toast.LENGTH_SHORT).show()
                    }
                }
        } else {
            //En caso que el usuario no haya ingresado todos los campos
            Toast.makeText(this, "No has capturado todos los campos", Toast.LENGTH_SHORT).show()
        }
    }

}
