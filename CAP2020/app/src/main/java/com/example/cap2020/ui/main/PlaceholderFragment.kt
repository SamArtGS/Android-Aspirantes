package com.example.cap2020.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cap2020.AdaptadorAgenda
import com.example.cap2020.R
import kotlinx.android.synthetic.main.fragment_main.*

class PlaceholderFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    // Función del ciclo de vida del fragment OnCrete
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    // Función del ciclo de vida del fragment.  OnCreateView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_main, container, false)
        viewAdapter = AdaptadorAgenda()

        //recyclerView = recicler.apply{
          //  layoutManager = viewManager
            //adapter = viewAdapter

        //}



        return root
    }


    companion object {
        fun newInstance(): PlaceholderFragment {
            return PlaceholderFragment().apply {

            }
        }
    }
}