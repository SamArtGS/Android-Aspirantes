package com.example.cap2020

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorAgenda() : RecyclerView.Adapter<AdaptadorAgenda.ViewHolderCelda>() {
    lateinit var listaCosas: MutableList<String>


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdaptadorAgenda.ViewHolderCelda {
        val celda = LayoutInflater.from(parent.context)
            .inflate(R.layout.adaptadorfilagenda, null, false)
        return ViewHolderCelda(celda)
    }

    override fun onBindViewHolder(holder: ViewHolderCelda, position: Int) {
        holder.Titulo.text = "Hola"
        holder.Descripcion.text = "JAJAJAJA"
        holder.foto.setImageResource(R.drawable.ic_launcher_foreground)

    }

    override fun getItemCount(): Int {
        return listaCosas.size
    }

    class ViewHolderCelda(val view: View):RecyclerView.ViewHolder(view){
        lateinit var Titulo:TextView
        lateinit var Descripcion:TextView
        lateinit var foto:ImageView

    }

}
