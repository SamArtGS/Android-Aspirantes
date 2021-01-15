package com.proteco.blocknotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ListTaskActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_task)

        this.title = "Lista De Tareas"
    }
}