package com.proteco.blocknotas.tareas

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.proteco.blocknotas.R

class ListTaskActivity : AppCompatActivity() {

    var listTask: ArrayList<Task> = ArrayList()
    var taskAdapter: TaskAdapter? = null
    var contador: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_task2)
        setSupportActionBar(findViewById(R.id.toolbar))

        var rvTask: RecyclerView = findViewById(R.id.rv_list)
        rvTask.setHasFixedSize(true)

        taskAdapter = TaskAdapter(listTask)
        rvTask.adapter =taskAdapter



        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            
            listTask.add(Task("Tarea ${contador}","Descripción de la tarea"))
            contador++
            taskAdapter?.notifyDataSetChanged()

        }
    }
}