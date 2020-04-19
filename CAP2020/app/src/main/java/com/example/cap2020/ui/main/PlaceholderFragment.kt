package com.example.cap2020.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cap2020.R

class PlaceholderFragment : Fragment() {
    // Función del ciclo de vida del fragment OnCrete
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    // Función del ciclo de vida del fragment.  OnCreateView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_main, container, false)
        return root
    }


    companion object {
        fun newInstance(): PlaceholderFragment {
            return PlaceholderFragment().apply {

            }
        }
    }
}