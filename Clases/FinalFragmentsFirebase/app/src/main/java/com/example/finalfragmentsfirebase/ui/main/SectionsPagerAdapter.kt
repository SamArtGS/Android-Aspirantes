package com.example.finalfragmentsfirebase.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.finalfragmentsfirebase.R

private val titulos = arrayOf("Chats","Estados","Llamadas")

class SectionsPagerAdapter(private val context: Context, fm: FragmentManager)
    : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        when(position){
            0-> return PlaceholderFragment()
            1-> return Fragment1()
            2-> return Fragment2()
            else -> return PlaceholderFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titulos.get(position)
    }

    override fun getCount(): Int {
        return titulos.size
    }
}
