package com.proteco.blocknotas.modelos

class Task constructor(var nameTask: String, var decTask: String) {
    var taskComplete: Boolean=false
    var fecha: String = ""

    fun setCompletedTask(){
        taskComplete=true
    }
}