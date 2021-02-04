package com.proteco.blocknotas


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.proteco.blocknotas.modelos.User
import com.proteco.blocknotas.tareas.ListTaskActivity

class LoginActivity : AppCompatActivity() {

    lateinit  var nameLogin: EditText
    lateinit var  passLogin: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("user: ${User.nameUser}")
        println("user: ${User.pass}")
        this.title = "Check Task"

        nameLogin = findViewById(R.id.edtxt_user)
        passLogin = findViewById(R.id.edtxt_pass)
    }

    fun onClickLogin(view: View) {



        if(!nameLogin.text.toString().equals(User.nameUser)){
            Toast.makeText(this, "Usuario incorrecto", Toast.LENGTH_LONG).show()
        }else if(!passLogin.text.toString().equals(User.pass)){
            Toast.makeText(this, "Contraseña incorrecta", Toast.LENGTH_LONG).show()
        }else{
            startActivity(Intent(this,ListTaskActivity::class.java))
            finish()
        }


    }
}