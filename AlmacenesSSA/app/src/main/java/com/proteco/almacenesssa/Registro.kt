package com.proteco.almacenesssa

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_registro.*
import kotlinx.android.synthetic.main.activity_registro.*

class Registro: AppCompatActivity() {
    private lateinit var databaseReference: DatabaseReference
    private lateinit var database: FirebaseDatabase
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        registrarte.setOnClickListener {
            nuevaCuenta()
        }

    }

    private fun nuevaCuenta() {
        var progressBar = ProgressDialog(this)
        database = FirebaseDatabase.getInstance()
        auth = FirebaseAuth.getInstance()
        databaseReference = database.reference.child("Usuarios")
        var nombre:String = editText4.text.toString()
        var apellido:String = editText3.text.toString()
        var email = editText.text.toString()
        var password = editText2.text.toString()

        if (!TextUtils.isEmpty(nombre) && !TextUtils.isEmpty(apellido) && !TextUtils.isEmpty(email) && !TextUtils.isEmpty(password)) {
            progressBar.setMessage("Registrando usuario")
            progressBar.show()
            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) {
                    val user: FirebaseUser = auth.currentUser!!
                    verificarEmail(user)
                    val currentUserDb = databaseReference.child(user.uid)
                    currentUserDb.child("Nombre").setValue(nombre)
                    currentUserDb.child("Apellido").setValue(apellido)
                    currentUserDb.child("Email").setValue(email)
                    currentUserDb.child("Contrasena").setValue(password)
                    val intent = Intent(this, Ingresa::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                    startActivity(intent)
                    Toast.makeText(this, "Usuario registrado con éxito",
                        Toast.LENGTH_SHORT).show()
                    progressBar.hide()
                }.addOnFailureListener{
                    // si el registro falla se mostrará este mensaje
                    Toast.makeText(this, "Error al querer registrar su usuario",
                        Toast.LENGTH_SHORT).show()
                }

        } else {
            Toast.makeText(this, "Llene todos los campos", Toast.LENGTH_SHORT).show()
        }
    }

    private fun verificarEmail(user: FirebaseUser) {
        user.sendEmailVerification()
            .addOnCompleteListener(this) {
//Verificamos que la tarea se realizó correctamente
                    task ->
                if (task.isSuccessful) {
                    Toast.makeText(this,
                        "Email " + user.getEmail(),
                        Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this,
                        "Error al verificar el correo ",
                        Toast.LENGTH_SHORT).show()
                }
            }
    }
}