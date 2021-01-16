package com.proteco.blocknotas


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.proteco.blocknotas.tareas.ListTaskActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.title = "Check Task"
    }

    fun onClickLogin(view: View) {
        startActivity(Intent(this,ListTaskActivity::class.java))
        finish()
    }
}