package com.example.cap2020.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.cap2020.R

private val TAB_TITLES = arrayOf(
        R.string.tab_text_1,
        R.string.tab_text_2,
        R.string.tab_text_3,
        R.string.tab_text_4
)
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    //SABER EN QUÉ FRAGMENT ME ENCUENTRO
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return PlaceholderFragment.newInstance()
            1 -> return Agenda.newInstance()
            2 -> return Mapa.newInstance()
            3 -> return Puntaje.newInstance()
            else -> {
                return PlaceholderFragment.newInstance()
            }
        }
        return PlaceholderFragment.newInstance()
    }

    // TÍTULOS DE LOS TABS
    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    // CUÁNTOS TABS
    override fun getCount(): Int {
        return 4
    }
}