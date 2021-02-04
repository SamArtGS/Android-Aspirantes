package com.proteco.fotos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_perfil_conic.*

class PerfilConic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_conic)

        /*
           Una instrucción que apunta a el fotón que se encuentra dentro del perfil del usuario.
           Al precionar dicho botón lo que sucederá es terminar la actividad actual y hacer que
           el usuario vuelva al menú principal.
        */
        volverConic.setOnClickListener {
            finish()
        }
    }
}