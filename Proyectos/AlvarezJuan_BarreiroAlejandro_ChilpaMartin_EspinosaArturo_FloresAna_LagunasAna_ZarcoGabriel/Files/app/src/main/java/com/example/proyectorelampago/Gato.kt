package com.example.proyectorelampago

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Gato: AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        btnSelected(v as Button)
    }

    private var cells = mutableMapOf<Int, String>()
    private var isX = true
    private var winner: String = ""
    private val totalCell = 9
    private lateinit var txtResult: TextView
    private val x = "X"
    private val o = "O"
    private var btns = arrayOfNulls<Button>(totalCell)
    private val combinations: Array<IntArray> = arrayOf(
        intArrayOf(0, 1, 2),
        intArrayOf(3, 4, 5),
        intArrayOf(6, 7, 8),
        intArrayOf(0, 3, 6),
        intArrayOf(1, 4, 7),
        intArrayOf(2, 5, 8),
        intArrayOf(0, 4, 8),
        intArrayOf(2, 4, 6)


    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gato)
        txtResult = findViewById(R.id.txtResult)

        for (i in 1..totalCell) {
            var button = findViewById<Button>(resources.getIdentifier("btn$i", "id", packageName))
            button.setOnClickListener(this)
            btns[i - 1] = button

        }

    }
    private fun btnSelected(button: Button){

        var index=0
        when(button.id){
            R.id.btn1->index=0
            R.id.btn2->index=1
            R.id.btn3->index=2
            R.id.btn4->index=3
            R.id.btn5->index=4
            R.id.btn6->index=5
            R.id.btn7->index=6
            R.id.btn8->index=7
            R.id.btn9->index=8

        }
        playGame(index, button)
        chechWinner()
        update()
    }
    private fun chechWinner(){
        if(cells.isNotEmpty()){
            for(combination in combinations){
                var(a,b,c)=combination

                if(cells[a]!=null && cells[a]==cells[b] && cells[a]==cells[c]){
                    this.winner=cells[a].toString()

                }
            }
        }
    }
    private fun update(){
        when{
            winner.isNotEmpty()->{
                txtResult.text=resources.getString(R.string.winner,winner)
                txtResult.setTextColor(Color.GREEN)
            }
            cells.size==totalCell->{
                txtResult.text="Empate"
            }
            else->{
                txtResult.text=resources.getString(R.string.next_player,if(isX)x else o)

            }
        }
    }
    private fun playGame(index:Int,button: Button){
        if(!winner.isNullOrEmpty()){
            Toast.makeText(this,"Juego finalizado",Toast.LENGTH_LONG).show()
            return
        }
        when{
            isX->cells[index]=x
            else->cells[index]=o
        }
        button.text=cells[index]
        button.isEnabled=false
        isX=!isX

    }
    fun resetButton(){
        for (i in 1..totalCell) {
            var button = btns[i-1]
            button?.text=""
            button?.isEnabled=true

        }

    }
    fun newGame(){
        cells= mutableMapOf()
        isX=true
        winner=""
        txtResult.text=resources.getString(R.string.next_player,x)
        resetButton()

    }
    fun reset(view: View){
        newGame()

    }
}