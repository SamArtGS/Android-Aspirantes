package com.example.alvarezsalmeronmario_arriolahernandezdaniel_arvizuflorestomas.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.alvarezsalmeronmario_arriolahernandezdaniel_arvizuflorestomas.AzulActivity
import com.example.alvarezsalmeronmario_arriolahernandezdaniel_arvizuflorestomas.IndigoActivity
import com.example.alvarezsalmeronmario_arriolahernandezdaniel_arvizuflorestomas.RojoActivity
import com.example.alvarezsalmeronmario_arriolahernandezdaniel_arvizuflorestomas.VerdeActivity
import com.example.alvarezsalmeronmarioarriolahernandezdanielarvizuflorestomas.R

private val TAB_TITLES = arrayOf(
        R.string.tab_text_1,
        R.string.tab_text_2
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager)
    : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        when(position){
            0 -> {
                return AzulActivity()
            }
            1 -> {
                return IndigoActivity()
            }
            2 -> {
                return RojoActivity()
            }
            3 -> {
                return VerdeActivity()
            }
            else -> return RojoActivity()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "AZUL"
            1 -> "ÍNDIGO"
            2 -> "ROJO"
            3 -> "VERDE"
            else -> null
        }
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 2
    }
}