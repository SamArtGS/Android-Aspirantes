package com.example.alvarezsalmeronmario_arriolahernandezdaniel_arvizuflorestomas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.alvarezsalmeronmarioarriolahernandezdanielarvizuflorestomas.R

class AzulActivity : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_azul, container, false)
    }
}