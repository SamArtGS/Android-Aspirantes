package com.proteco.almacenesssa.ui.main

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import com.google.android.gms.common.wrappers.Wrappers.packageManager
import com.google.android.gms.maps.SupportMapFragment
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.proteco.almacenesssa.Encuesta
import com.proteco.almacenesssa.R
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_main.view.*
import org.json.JSONObject


class PagInicio : Fragment(),AdapterView.OnItemSelectedListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    //val Fragment.packageManager get() = activity?.packageManager

    var cluesDic = mutableMapOf<Int,String>()
    var cluesList = mutableListOf<String>()
    var idies = mutableListOf<String>()

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_main, container, false)
        pasarEncuesta = Intent(this.context!!,Encuesta::class.java)

        val jsonTodos: String = this.context!!.assets.open("Todos_Almacenes.json")
            .bufferedReader().use {
            it.readText()
        }

        var item = JSONObject(jsonTodos).getJSONObject("CLUES")
        var item1 = JSONObject(jsonTodos).getJSONObject("CLAVE-ENTIDAD")
        var llaves = item.keys()

        while(llaves.hasNext()) {
            var keia = llaves.next()
            var clues = item.getString("$keia")
            var estado = item1.getInt("$keia")
            cluesDic[estado] = clues
            cluesList.add(clues)
            idies.add(keia.toString())
        }
        return root
    }

    lateinit var pasarEncuesta:Intent

    override fun onResume() {
        super.onResume()
        regiones.onItemSelectedListener = this
        estados.onItemSelectedListener = this
        var adaptador = ArrayAdapter<String>(this.context!!,
            android.R.layout.simple_expandable_list_item_1,
            cluesList)
        lista_almacenes.adapter = adaptador
        lista_almacenes.onItemClickListener = listClik

        edtSearch.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                adaptador.filter.filter(s)
            }
        })
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
         var adaptador = ArrayAdapter<String>(this.context!!,
             android.R.layout.simple_expandable_list_item_1,cluesList)
         lista_almacenes.adapter = adaptador
    }

    val dicEstadosRegion = mapOf(
        1 to listOf("BAJA CALIFORNIA","BAJA CALIFORNIA SUR","SONORA"),
        2 to listOf("CHIHUAHUA","SINALOA","DURANGO"),
        3 to listOf("COAHUILA","NUEVO LEON","TAMAULIPAS"),
        4 to listOf("JALISCO","NAYARIT","AGUASCALIENTES","ZACATECAS","COLIMA"),
        5 to listOf("QUERETARO","SAN LUIS POTOSI","GUANAJUATO"),
        6 to listOf("EDOMEX","HIDALGO","MICHOACAN"),
        7 to listOf("MORELOS","CDMX"),
        8 to listOf("PUEBLA","TLAXCALA","GUERRERO","VERACRUZ"),
        9 to listOf("OAXACA","CHIAPAS"),
        10 to listOf("TABASCO","CAMPECHE","YUCATAN","QUINTANA ROO")
    )
    override fun onItemSelected(parent: AdapterView<*>?,
                                view: View?, position: Int,
                                id: Long) {
        when (parent){
            regiones ->{
                println("Búsqueda por regiones")
            }
            estados ->{
                println("Búsqueda por estados")
            }
        }
    }
    val listClik = AdapterView.OnItemClickListener { parent, view,
                                                     position, id ->
        var itemValue:String? = lista_almacenes.getItemAtPosition(position) as? String
        pasarEncuesta.putExtra("ID-seleccionado",itemValue)
        startActivity(pasarEncuesta)
    }
}