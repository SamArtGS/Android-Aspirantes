package com.proteco.fotos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
            finish()
        }
    }
}