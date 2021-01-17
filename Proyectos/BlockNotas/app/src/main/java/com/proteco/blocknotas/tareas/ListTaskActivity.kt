package com.proteco.blocknotas.tareas

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.proteco.blocknotas.R
import com.proteco.blocknotas.modelos.Task

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
            
            startActivityForResult(Intent(this, AddTaskActivity::class.java), 25)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && requestCode == 25){
            taskAdapter?.notifyDataSetChanged()
        }
    }
}