package com.example.ssalmacenes.ui.main

import android.content.Context
<<<<<<< HEAD:Proyectos/AlvarezSalmeronMarioArriolaHernandezDanielArvizuFloresTomas/app/src/main/java/com/example/alvarezsalmeronmario_arriolahernandezdaniel_arvizuflorestomas/ui/main/SectionsPagerAdapter.kt
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.alvarezsalmeronmario_arriolahernandezdaniel_arvizuflorestomas.AzulActivity
import com.example.alvarezsalmeronmario_arriolahernandezdaniel_arvizuflorestomas.IndigoActivity
import com.example.alvarezsalmeronmario_arriolahernandezdaniel_arvizuflorestomas.RojoActivity
import com.example.alvarezsalmeronmario_arriolahernandezdaniel_arvizuflorestomas.VerdeActivity
import com.example.alvarezsalmeronmarioarriolahernandezdanielarvizuflorestomas.R
=======
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.ssalmacenes.R
>>>>>>> upstream/master:Clases/SSAlmacenes/app/src/main/java/com/example/ssalmacenes/ui/main/SectionsPagerAdapter.kt

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
<<<<<<< HEAD:Proyectos/AlvarezSalmeronMarioArriolaHernandezDanielArvizuFloresTomas/app/src/main/java/com/example/alvarezsalmeronmario_arriolahernandezdaniel_arvizuflorestomas/ui/main/SectionsPagerAdapter.kt
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
=======
        return PlaceholderFragment()
>>>>>>> upstream/master:Clases/SSAlmacenes/app/src/main/java/com/example/ssalmacenes/ui/main/SectionsPagerAdapter.kt
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
        return 2
    }
}