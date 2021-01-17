package com.proteco.blocknotas.tareas

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.EditText
import android.widget.Toast
import androidx.core.view.isEmpty
import com.proteco.blocknotas.Fecha.DatePickerFragment
import com.proteco.blocknotas.R
import com.proteco.blocknotas.modelos.Task
import com.proteco.blocknotas.modelos.User

class AddTaskActivity : AppCompatActivity() {

    lateinit var nameTask: EditText
    lateinit var descTask: EditText
    lateinit var datePicker: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_task)
        initComponents()


    }

    fun initComponents(){
        nameTask=findViewById(R.id.edtxt_add_name)
        descTask=findViewById(R.id.edtxt_add_desc)
        datePicker=findViewById(R.id.edtxt_add_fecha)

    }

    fun onClickAddTask(view: View) {
        if (nameTask.text.toString().isEmpty()){
            Toast.makeText(this,"Ingresa un nombre para la tarea",Toast.LENGTH_SHORT).show()
        }else if (descTask.text.toString().isEmpty()){
            Toast.makeText(this,"Ingresa una descripcion para la tarea",Toast.LENGTH_SHORT).show()
        }
        else if (datePicker.text.toString().isEmpty()){
            Toast.makeText(this,"Ingresa una fecha limite para la tarea",Toast.LENGTH_SHORT).show()
        }
        else{
            var newTask: Task= Task(nameTask.text.toString(), descTask.text.toString())
            newTask.fecha = datePicker?.text.toString()
            User.addTask(newTask)
            setResult(RESULT_OK)
            finish()
        }
    }

    fun onClickFecha(view: View) {
        var dateFragment = DatePickerFragment.newInstance(this,
            DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                val dateSelected = "${dayOfMonth.toString()}/${month+1}/${year}"
                datePicker.setText(dateSelected)
            })
        dateFragment.show(supportFragmentManager, "datePicker")
    }
}