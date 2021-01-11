package com.example.juegosbpvaj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_juego1.*

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
        }
        medio.setOnClickListener {
            dif=1
            dificultad.text="Medio"
        }
        dificil.setOnClickListener {
            dif=2
            dificultad.text="Dificil"
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
    }
}