package com.example.juegosbpvaj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_juego2.*
import kotlinx.android.synthetic.main.activity_main.*

class Juego2 : AppCompatActivity(), View.OnClickListener {
    var contador = 0
    var turno =0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juego2)

        nuevaPartida.setOnClickListener {
            val nuevo: Intent= Intent(this,MainActivity::class.java)
            startActivity(nuevo)
        }


        boton1.setOnClickListener(this)
        boton2.setOnClickListener(this)
        boton3.setOnClickListener(this)
        boton4.setOnClickListener(this)
        boton5.setOnClickListener(this)
        boton6.setOnClickListener(this)
        boton7.setOnClickListener(this)
        boton8.setOnClickListener(this)
        boton9.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        contador++
        turno = contador % 2

        if (turno==1){
            equisOcero('X',v)
        }
        else{
            equisOcero('O',v)
        }
        
    }

    private fun equisOcero(c: Char, v: View?) {
        if (v != null) {
            if(v.getId() == R.id.boton1){
                boton1.setText(c+"")
                boton1.isEnabled=false
            }
            else if(v.getId() ==R.id.boton2){
                boton2.setText(c+"")
                boton2.isEnabled=false

            }
            else if(v.getId() ==R.id.boton3){
                boton3.setText(c+"")
                boton3.isEnabled=false

            }
            else if(v.getId() ==R.id.boton4){
                boton4.setText(c+"")
                boton4.isEnabled=false

            }
            else if(v.getId() ==R.id.boton5){
                boton5.setText(c+"")
                boton5.isEnabled=false

            }
            else if(v.getId() ==R.id.boton6){
                boton6.setText(c+"")
                boton6.isEnabled=false

            }
            else if(v.getId() ==R.id.boton7){
                boton7.setText(c+"")
                boton7.isEnabled=false

            }
            else if(v.getId() ==R.id.boton8){
                boton8.setText(c+"")
                boton8.isEnabled=false

            }
            else if(v.getId() ==R.id.boton9){
                boton9.setText(c+"")
                boton9.isEnabled=false

            }


        }
    }


    


}