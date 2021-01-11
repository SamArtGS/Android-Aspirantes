package com.example.juegosbpvaj

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import com.example.juegosbpvaj.R.drawable.*
import kotlinx.android.synthetic.main.activity_dificultad3.*
import kotlinx.android.synthetic.main.activity_main.*

class Dificultad3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dificultad3)

        val images: MutableList<Int> = mutableListOf(camel, coala, fox, lion, monkey, wolf, camel, coala, fox, lion, monkey, wolf, , , ,)

        val buttons = arrayOf(button1, button2, button3, button4, button5, button6, button7, button8,
            button9, button10, button11, button12,button13,button14,button15,button16)

        val cardBack=code
        var clicked = 0
        var turnOver = false
        var lastClicked = -1

        images.shuffle()
        for(i in 0..15){
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
