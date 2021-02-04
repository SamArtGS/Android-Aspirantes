package com.example.juegosbpvaj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_juego1.*
import kotlinx.android.synthetic.main.activity_main.*

class juego1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juego1)

        var tem:Int=0
        var dif:Int=0


        facil.setOnClickListener {
            dif=0
            dificultad.text="Facil"
            var diffacil=Intent(this,dificultad_Facil::class.java)
            startActivity(diffacil)
        }
        medio.setOnClickListener {
            dif=1
            dificultad.text="Medio"
            var dificultadMedia = Intent(this, difMedia::class.java)
            startActivity(dificultadMedia)
        }
        dificil.setOnClickListener {
            dif=2
            dificultad.text="Dificil"
            var dificultadDificil = Intent(this, Dificultad3::class.java)
            startActivity(dificultadDificil)
        }

        modalidad.text="Espacio"
        imageView2.setImageResource(R.drawable.nave)


        jugar.setOnClickListener {
            when(dif){
                0->{
                    val intento1: Intent = Intent(this,dificultad_Facil::class.java)
                    startActivity(intento1)
                }
                1->{
                    val intento1: Intent = Intent(this,difMedia::class.java)
                    startActivity(intento1)
                }
                2->{
                    val intento1: Intent = Intent(this,Dificultad3::class.java)
                    startActivity(intento1)
                }
            }
        }
    }
}