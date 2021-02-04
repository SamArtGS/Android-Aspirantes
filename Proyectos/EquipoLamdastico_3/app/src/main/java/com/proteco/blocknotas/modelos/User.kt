package com.proteco.blocknotas.modelos

object User {
    var tasks: ArrayList<Task> = ArrayList()
    var nameUser: String = "Proteco"
    var pass: String = "Proteco123"

    fun addTask(task: Task){
        tasks.add(task)
    }

    fun removeTask(task: Task){
        tasks.remove(task)
    }
}