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

        dificultad.text="Facil"

        facil.setOnClickListener {
            dif=0
            dificultad.text="Facil"
            var dificultadFacil= Intent(this,dificultad_Facil::class.java)
            startActivity(dificultadFacil)
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

        modalidad.text="Animales"
        imageView2.setImageResource(R.mipmap.cara)
        siguiente.setOnClickListener {

            if(tem==1){
                tem=0
            }
            else{
                tem=1
            }
            when(tem){
                0->{modalidad.text="Animales"
                imageView2.setImageResource(R.mipmap.cara)}
                1->{modalidad.text="Personajes Comics"
                    imageView2.setImageResource(R.mipmap.ic_launcher)
                }
            }
        }
        anterior.setOnClickListener {

            if(tem==1){
                tem=0
            }
            else{
                tem=1
            }
            when(tem){
                0->{modalidad.text="Animales"
                    imageView2.setImageResource(R.mipmap.cara)}
                1->{modalidad.text="Personajes Comics"
                    imageView2.setImageResource(R.mipmap.ic_launcher)
                }
            }
        }

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