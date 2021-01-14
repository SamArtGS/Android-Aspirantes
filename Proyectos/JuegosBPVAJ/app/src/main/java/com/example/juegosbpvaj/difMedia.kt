package com.example.juegosbpvaj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.*
import kotlinx.android.synthetic.main.activity_dif_media.*
import com.example.juegosbpvaj.R.drawable.*

class difMedia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dif_media)

        val images: MutableList<Int> =
                mutableListOf(alien, astronauta, nave, saturno, sol, tierra, alien, astronauta, nave, saturno, sol, tierra)

        val buttons = arrayOf(btnM1, btnM2, btnM3, btnM4, btnM5, btnM6, btnM7, btnM8, btnM9, btnM10, btnM11, btnM12)

        val cardBack = androide1
        var clicked = 0
        var turnOver = false
        var lastClicked = -1

        images.shuffle()
        for(i in 0..11){
            buttons[i].setBackgroundColor(getColor(this, R.color.white))
            buttons[i].setBackgroundResource(cardBack)
            buttons[i].text = "cardBack"
            buttons[i].textSize = 0.0F
            buttons[i].setOnClickListener {
                if (buttons[i].text == "cardBack" && !turnOver) {
                    buttons[i].setBackgroundResource(images[i])
                    buttons[i].setText(images[i])
                    if (clicked == 0) {
                        lastClicked = i
                    }
                    clicked++
                } else if (buttons[i].text !in "cardBack") {
                    buttons[i].setBackgroundResource(cardBack)
                    buttons[i].text = "cardBack"
                    clicked--
                }

                if (clicked == 2) {
                    turnOver = true
                    if (buttons[i].text == buttons[lastClicked].text) {
                        buttons[i].isClickable = false
                        buttons[lastClicked].isClickable = false
                        turnOver = false
                        clicked = 0
                    }
                } else if (clicked == 0) {
                    turnOver = false
                }
            }
        }

    }
}