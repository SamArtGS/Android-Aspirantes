package com.example.ssalmacenes

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
<<<<<<< HEAD:Proyectos/AlvarezSalmeronMarioArriolaHernandezDanielArvizuFloresTomas/app/src/main/java/com/example/alvarezsalmeronmario_arriolahernandezdaniel_arvizuflorestomas/MainActivity.kt
import com.example.alvarezsalmeronmario_arriolahernandezdaniel_arvizuflorestomas.ui.main.SectionsPagerAdapter
import com.example.alvarezsalmeronmarioarriolahernandezdanielarvizuflorestomas.R
=======
import com.example.ssalmacenes.ui.main.SectionsPagerAdapter
>>>>>>> upstream/master:Clases/SSAlmacenes/app/src/main/java/com/example/ssalmacenes/MainActivity.kt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)
        val fab: FloatingActionButton = findViewById(R.id.fab)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}