package com.proteco.QuienesSomos_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_perfil_roberto.*

class PerfilRoberto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_roberto)

        /*
           Una instrucción que apunta a la foto que se encuentra dentro del perfil del usuario.
           Al precionar dicho botón lo que sucederá es terminar la actividad actual y hacer que
           el usuario vuelva al menú principal.
        */
        volverRoberto.setOnClickListener {
            /*
                Se hace una llamada a un Toast que permite mostrar un mensaje en pantalla.
            */
            Toast.makeText(this,"¡Nos vemos!", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}