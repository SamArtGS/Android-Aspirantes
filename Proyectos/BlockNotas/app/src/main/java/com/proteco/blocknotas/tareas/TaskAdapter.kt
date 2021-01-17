package com.proteco.blocknotas.tareas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.proteco.blocknotas.R
import java.util.ArrayList



class TaskAdapter(var list_task: ArrayList<Task>) :
    RecyclerView.Adapter<TaskAdapter.ItemTaskViewHolder>() {
    var items: ArrayList<Task>?=null
    init {
        items = list_task
    }

    class ItemTaskViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var nameTask: TextView?= null
        var descTask: TextView? = null
        var check: CheckBox? = null

        init {
            nameTask = view.findViewById(R.id.txt_name_task)
            descTask = view.findViewById(R.id.txt_desc_task)
            check = view.findViewById(R.id.checkbox_task)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemTaskViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.task_item,parent,false)
        return ItemTaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemTaskViewHolder, position: Int) {
        var currentItem = items?.get(position)
        holder.nameTask?.text=currentItem?.nameTask
        holder.descTask?.text =currentItem?.decTask
        holder.check?.isChecked=currentItem?.taskComplete!!
        holder.check?.setOnCheckedChangeListener { buttonView, isChecked ->
            currentItem.taskComplete=isChecked
        }
    }

    override fun getItemCount(): Int {
        return items?.size!!
    }


}