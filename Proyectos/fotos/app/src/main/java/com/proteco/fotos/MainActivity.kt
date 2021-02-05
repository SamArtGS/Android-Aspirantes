package com.proteco.fotos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
            Instrucción que está a la espera que un botón sea precionado para que se
            redireccione el usuario.
        */
        boton_verRoberto.setOnClickListener {
            /*
                Es creada la "intención" que tendrá como referencia la actividad
                "PerfilRoberto".
             */
            var intent = Intent(this, PerfilRoberto::class.java)

            // Después de haber creado la "intención", se solicita que la actividad comience.
            startActivity(intent)
        }

        boton_verConic.setOnClickListener {
            /*
                Es creada la "intención" que tendrá como referencia la actividad
                "PerfilConic.
             */
            var intent = Intent(this, PerfilConic::class.java)

            // Después de haber creado la "intención", se solicita que la actividad comience.
            startActivity(intent)
        }

        boton_verIsaac.setOnClickListener {
            /*
                Es creada la "intención" que tendrá como referencia la actividad
                "PerfilIsaac.
             */
            var intent = Intent(this, PerfilIsaac::class.java)

            // Después de haber creado la "intención", se solicita que la actividad comience.
            startActivity(intent)
        }
    }
}