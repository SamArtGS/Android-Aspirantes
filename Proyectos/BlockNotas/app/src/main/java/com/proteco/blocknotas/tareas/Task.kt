package com.proteco.blocknotas.tareas

class Task constructor(var nameTask: String, var decTask: String) {
    var taskComplete: Boolean=false
    fun setCompletedTask(){
        taskComplete=true
    }
}