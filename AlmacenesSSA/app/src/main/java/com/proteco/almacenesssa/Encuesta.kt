package com.proteco.almacenesssa

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.app.ProgressDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.location.Location
import android.location.LocationManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.text.TextUtils
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.firebase.database.*
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import kotlinx.android.synthetic.main.activity_encuesta.*
import java.util.*
import kotlin.collections.HashMap

class Encuesta : AppCompatActivity() {
    private val firebaseInstance = FirebaseDatabase.getInstance()
    lateinit var recuperado:Intent
    lateinit var lake: String
    var realizado : String? = null

    fun inicializar(databs: DatabaseReference){
        datosCorrectos.isChecked = true
        cluesTE.isEnabled = false
        NombreUnidadTE.isEnabled = false
        rfcTE.isEnabled = false
        direccionTE.isEnabled = false
        localidadTE.isEnabled = false
        municipioTE.isEnabled = false
        entidadTE.isEnabled = false
        cpostalTE.isEnabled = false
        //tipoTE.isEnabled = false
        fechainicioTE.isEnabled = true
        fechaultimoTE.isEnabled = false
        latitudTE.isEnabled = false
        longitudTE.isEnabled = false
        encargadoTE.isEnabled = false
        telefonoTE.isEnabled = false
        emailTE.isEnabled = false
        metrosCuadradosTE.isEnabled = false
        numEmpleadosAdmin.isEnabled = false

        databs.orderByChild("CLUES").equalTo(recuperado.getStringExtra("ID-seleccionado"))
            .addValueEventListener(object: ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    if (dataSnapshot.exists()) {
                        for (ds in dataSnapshot.children){
                            lake = ds.key!!
                            realizado = ds.child("REALIZADO").getValue(String::class.java)
                            cluesTE.setText(ds.child("CLUES").getValue(String::class.java))
                            NombreUnidadTE.setText(ds.child("NOMBREUNIDAD").getValue(String::class.java))
                            rfcTE.setText(ds.child("RFC").getValue(String::class.java))
                            direccionTE.setText(ds.child("DIRECCION").getValue(String::class.java))
                            localidadTE.setText(ds.child("NOMBRE-LOCALIDAD").getValue(String::class.java))
                            municipioTE.setText(ds.child("NOMBREMUNICIPIO").getValue(String::class.java))
                            entidadTE.setText(ds.child("NOMBREENTIDAD").getValue(String::class.java))
                            cpostalTE.setText(ds.child("CODIGOPOSTAL").getValue(String::class.java))
                            //tipoTE.setText(ds.child("ESTRATOUNIDAD").getValue(String::class.java))
                            fechainicioTE.setText(ds.child("FECHAINICIOPERACION").getValue(String::class.java))
                            fechaultimoTE.setText(ds.child("FEULMOVIMIENTO").getValue(String::class.java))
                            latitudTE.setText(ds.child("LATITUD").getValue(String::class.java)?.take(8))
                            longitudTE.setText(ds.child("LONGITUD").getValue(String::class.java)?.take(10))
                            encargadoTE.setText(ds.child("ENCARGADO").getValue(String::class.java))
                            telefonoTE.setText(ds.child("TELEFONO").getValue(String::class.java))
                            emailTE.setText(ds.child("EMAIL").getValue(String::class.java))
                            numEmpleadosAdmin.setText(ds.child("NUMEMPLEADOSADMIN").getValue(String::class.java))
                            numEmpleadosSurti.setText(ds.child("NUMEMPLEADOSSURTI").getValue(String::class.java))
                            numEmpleadosRecAcom.setText(ds.child("NUMEMPLEADOSREAC").getValue(String::class.java))
                            metrosCuadradosTE.setText(ds.child("METROSCUADRADOS").getValue(String::class.java))
                            metrosPatio.setText(ds.child("METROSPATIO").getValue(String::class.java))
                            metrosSupSeco.setText(ds.child("METROSSUPSECO").getValue(String::class.java))
                            metrosAltSeco.setText(ds.child("METROSALTSECO").getValue(String::class.java))
                            metrosSupFria.setText(ds.child("METROSSUPFRIO").getValue(String::class.java))
                            metrosAltFria.setText(ds.child("METROSALTFRIO").getValue(String::class.java))
                            metrosSupPiso.setText(ds.child("METROSSUPPISO").getValue(String::class.java))
                            metrosAltPiso.setText(ds.child("METROSALTPISO").getValue(String::class.java))
                            rackSelectivo.setText(ds.child("RACKS_SELECTIVOS").getValue(String::class.java))
                            rackCantilever.setText(ds.child("RACKS_CANTILEVER").getValue(String::class.java))
                            rackDProf.setText(ds.child("RACKS_DOB_PROF").getValue(String::class.java))
                            plataformas.setText(ds.child("PLATAFORMAS").getValue(String::class.java))
                            cortinaCarga.setText(ds.child("CORT_CARGA").getValue(String::class.java))
                            cortinaDescarga.setText(ds.child("CORT_DESCARGA").getValue(String::class.java))
                            camionesPropios.setText(ds.child("CAMIONES_PROP").getValue(String::class.java))
                            camionesTerceros.setText(ds.child("CAMIONES_TERC").getValue(String::class.java))
                            patines.setText(ds.child("PATINES").getValue(String::class.java))
                            montacargas.setText(ds.child("MONTACARGAS").getValue(String::class.java))
                        }
                        if (realizado == "1"){
                            datosCorrectos.isChecked = true
                            cluesTE.isEnabled = false
                            NombreUnidadTE.isEnabled = false
                            rfcTE.isEnabled = false
                            direccionTE.isEnabled = false
                            localidadTE.isEnabled = false
                            municipioTE.isEnabled = false
                            entidadTE.isEnabled = false
                            cpostalTE.isEnabled = false
                            //tipoTE.isEnabled = false
                            fechainicioTE.isEnabled = true
                            fechaultimoTE.isEnabled = false
                            latitudTE.isEnabled = false
                            longitudTE.isEnabled = false
                            encargadoTE.isEnabled = false
                            telefonoTE.isEnabled = false
                            emailTE.isEnabled = false
                            metrosCuadradosTE.isEnabled = false
                            numEmpleadosAdmin.isEnabled = false
                            datosCorrectos.isClickable = false
                            foto1.isClickable = false
                            foto2.isClickable = false
                            foto3.isClickable = false
                            enviar.isClickable = false

                        }else {
                            datosCorrectos.isChecked = true
                            cluesTE.isEnabled = false
                            NombreUnidadTE.isEnabled = false
                            rfcTE.isEnabled = false
                            direccionTE.isEnabled = false
                            localidadTE.isEnabled = false
                            municipioTE.isEnabled = false
                            entidadTE.isEnabled = false
                            cpostalTE.isEnabled = false
                            //tipoTE.isEnabled = false
                            fechainicioTE.isEnabled = true
                            fechaultimoTE.isEnabled = false
                            latitudTE.isEnabled = false
                            longitudTE.isEnabled = false
                            encargadoTE.isEnabled = true
                            telefonoTE.isEnabled = true
                            emailTE.isEnabled = true
                            metrosCuadradosTE.isEnabled = true
                            numEmpleadosAdmin.isEnabled = true
                        }


                    }
                }
                override fun onCancelled(p0: DatabaseError) {
                    Toast.makeText(this@Encuesta,
                        "No se pudo realizar el fetchData",Toast.LENGTH_SHORT).show()
                }
            })
    }

    fun dialogo(context: Context, title: String, msg: String,
                   positiveBtnText: String, negativeBtnText: String?,
                   positiveBtnClickListener: DialogInterface.OnClickListener,
                   negativeBtnClickListener: DialogInterface.OnClickListener?): AlertDialog {
        val builder = AlertDialog.Builder(context)
            .setTitle(title)
            .setMessage(msg)
            .setCancelable(true)
            .setPositiveButton(positiveBtnText, positiveBtnClickListener)
        if (negativeBtnText != null)
            builder.setNegativeButton(negativeBtnText, negativeBtnClickListener)
        val alert = builder.create()
        alert.show()
        return alert
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var databs = firebaseInstance.getReference("Almacenes")
        databs.keepSynced(true)
        setContentView(R.layout.activity_encuesta)

        recuperado = intent

        inicializar(databs)

        datosCorrectos.setOnClickListener {
            if (datosCorrectos.isChecked){
                NombreUnidadTE.isEnabled = false
                rfcTE.isEnabled = false
                direccionTE.isEnabled = false
                cpostalTE.isEnabled = false
                latitudTE.isEnabled = false
                longitudTE.isEnabled = false
                //tipoTE.isEnabled = false
            }else{
                NombreUnidadTE.isEnabled = true
                rfcTE.isEnabled = true
                direccionTE.isEnabled = true
                cpostalTE.isEnabled = true
                latitudTE.isEnabled = true
                longitudTE.isEnabled = true
                //tipoTE.isEnabled = true
            }
        }

        localizacionGPS.setOnClickListener {
            val lm : LocationManager = getSystemService(Context.LOCATION_SERVICE) as LocationManager
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) ==
                PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) ==
                PackageManager.PERMISSION_GRANTED) {
                var location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER)
                val longitude : Double = location.longitude
                val latitude : Double = location.latitude
                latitudTE.setText(latitude.toString())
                longitudTE.setText(longitude.toString())
            }
        }

        foto1.setOnClickListener {
            val callCameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if(callCameraIntent.resolveActivity(packageManager)!=null){
                startActivityForResult(callCameraIntent,CAMERA_REQUEST_CODE_1)
            }
        }
        foto2.setOnClickListener {
            val callCameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if(callCameraIntent.resolveActivity(packageManager)!=null){
                startActivityForResult(callCameraIntent,CAMERA_REQUEST_CODE_2)
            }
        }
        foto3.setOnClickListener {
            val callCameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if(callCameraIntent.resolveActivity(packageManager)!=null){
                startActivityForResult(callCameraIntent,CAMERA_REQUEST_CODE_3)
            }
        }
        var progressBar = ProgressDialog(this)
        progressBar.setMessage("Actualizando registro")
        enviar.setOnClickListener {
            progressBar.show()
            if (!TextUtils.isEmpty(cluesTE.text.toString())
                && !TextUtils.isEmpty(direccionTE.text.toString())
                && !TextUtils.isEmpty(localidadTE.text.toString())
                && !TextUtils.isEmpty(municipioTE.text.toString())
                && !TextUtils.isEmpty(entidadTE.text.toString())
                && !TextUtils.isEmpty(encargadoTE.text.toString())
                && !TextUtils.isEmpty(telefonoTE.text.toString())
                && !TextUtils.isEmpty(emailTE.text.toString())
                && !TextUtils.isEmpty(numEmpleadosAdmin.text.toString())
                && !TextUtils.isEmpty(numEmpleadosSurti.text.toString())
                && !TextUtils.isEmpty(numEmpleadosRecAcom.text.toString())
                && !TextUtils.isEmpty(metrosCuadradosTE.text.toString())
                && !TextUtils.isEmpty(metrosPatio.text.toString())
                && !TextUtils.isEmpty(metrosSupSeco.text.toString())
                && !TextUtils.isEmpty(metrosAltSeco.text.toString())
                && !TextUtils.isEmpty(metrosSupFria.text.toString())
                && !TextUtils.isEmpty(metrosAltFria.text.toString())
                && !TextUtils.isEmpty(metrosSupPiso.text.toString())
                && !TextUtils.isEmpty(metrosAltPiso.text.toString())
                && !TextUtils.isEmpty(rackSelectivo.text.toString())
                && !TextUtils.isEmpty(rackCantilever.text.toString())
                && !TextUtils.isEmpty(rackDProf.text.toString())
                && !TextUtils.isEmpty(plataformas.text.toString())
                && !TextUtils.isEmpty(cortinaCarga.text.toString())
                && !TextUtils.isEmpty(cortinaDescarga.text.toString())
                && !TextUtils.isEmpty(camionesPropios.text.toString())
                && !TextUtils.isEmpty(camionesTerceros.text.toString())
                && !TextUtils.isEmpty(patines.text.toString())
                && !TextUtils.isEmpty(montacargas.text.toString())

            ) {
                databs.child(lake).child("NOMBREUNIDAD").setValue(NombreUnidadTE.text.toString())
                databs.child(lake).child("RFC").setValue(rfcTE.text.toString())
                databs.child(lake).child("DIRECCION").setValue(direccionTE.text.toString())
                databs.child(lake).child("CODIGOPOSTAL").setValue(cpostalTE.text.toString())
                //databs.child(lake).child("ESTRATOUNIDAD").setValue(tipoTE.text.toString())
                databs.child(lake).child("LATITUD").setValue(latitudTE.text.toString())
                databs.child(lake).child("LONGITUD").setValue(longitudTE.text.toString())
                databs.child(lake).child("ENCARGADO").setValue(encargadoTE.text.toString())
                databs.child(lake).child("TELEFONO").setValue(telefonoTE.text.toString())
                databs.child(lake).child("EMAIL").setValue(emailTE.text.toString())

                databs.child(lake).child("NUMEMPLEADOSADMIN").setValue(numEmpleadosAdmin.text.toString())

                databs.child(lake).child("NUMEMPLEADOSSURTI").setValue(telefonoTE.text.toString())
                databs.child(lake).child("NUMEMPLEADOSREAC").setValue(emailTE.text.toString())
                databs.child(lake).child("NUMEMPLEADOSREAC").setValue(metrosCuadradosTE.text.toString())
                databs.child(lake).child("NUMEMPLEADOS").setValue(numEmpleadosAdmin.text.toString())
                databs.child(lake).child("METROSCUADRADOS").setValue(metrosCuadradosTE.text.toString())
                databs.child(lake).child("NUMEMPLEADOSSURTI").setValue(telefonoTE.text.toString())
                databs.child(lake).child("NUMEMPLEADOSREAC").setValue(emailTE.text.toString())
                databs.child(lake).child("NUMEMPLEADOSREAC").setValue(metrosCuadradosTE.text.toString())
                databs.child(lake).child("METROSCUADRADOS").setValue(metrosCuadradosTE.text.toString())
                databs.child(lake).child("METROSPATIO").setValue(metrosPatio.text.toString())
                databs.child(lake).child("METROSPATIO").setValue(metrosPatio.text.toString())
                databs.child(lake).child("METROSSUPSECO").setValue(metrosSupSeco.text.toString())
                databs.child(lake).child("METROSALTSECO").setValue(metrosAltSeco.text.toString())
                databs.child(lake).child("METROSSUPFRIO").setValue(metrosSupFria.text.toString())
                databs.child(lake).child("METROSALTFRIO").setValue(metrosAltFria.text.toString())
                databs.child(lake).child("METROSSUPPISO").setValue(metrosSupPiso.text.toString())
                databs.child(lake).child("METROSALTPISO").setValue(metrosAltPiso.text.toString())
                databs.child(lake).child("RACKS_SELECTIVOS").setValue(rackSelectivo.text.toString())
                databs.child(lake).child("RACKS_CANTILEVER").setValue(rackCantilever.text.toString())
                databs.child(lake).child("RACKS_DOB_PROF").setValue(rackDProf.text.toString())
                databs.child(lake).child("PLATAFORMAS").setValue(plataformas.text.toString())
                databs.child(lake).child("CORT_CARGA").setValue(cortinaCarga.text.toString())
                databs.child(lake).child("CORT_DESCARGA").setValue(cortinaDescarga.text.toString())
                databs.child(lake).child("CAMIONES_PROP").setValue(camionesPropios.text.toString())
                databs.child(lake).child("CAMIONES_TERC").setValue(camionesTerceros.text.toString())
                databs.child(lake).child("PATINES").setValue(patines.text.toString())
                databs.child(lake).child("MONTACARGAS").setValue(montacargas.text.toString())

                storageReference = FirebaseStorage.getInstance().reference
                

                if (checkBoxFin.isChecked){
                    databs.child(lake).child("REALIZADO").setValue("1")
                    databs.child(lake).child("ENCUESTANTE").setValue("")
                }

                Toast.makeText(this,
                    "Registro actualizado con éxito", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this,MainActivity::class.java))

                progressBar.hide()
            }else{
                progressBar.hide()
                Toast.makeText(this,
                    "Debes rellenar todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
    private var filePath: Uri? = null
//    private var firebaseStorage: FirebaseStorage? = null
    private var storageReference: StorageReference? = null


    private fun subirImagen(){
        if(filePath != null){
            val ref = storageReference?.child("Almacenes" + UUID.randomUUID().toString())
            ref?.putFile(filePath!!)?.addOnSuccessListener {
                Toast.makeText(this, "Imagen Cargada", Toast.LENGTH_SHORT).show()
            }?.addOnFailureListener { e ->
                Toast.makeText(this,
                    "Error al cargar la imagen" + e.message,
                    Toast.LENGTH_SHORT).show()
            }
        }else{
            Toast.makeText(this,
                "Por favor, selecciona una imagen", Toast.LENGTH_SHORT).show()
        }
    }


    private fun mandarInfoAFirebase(almacenItem: AlamacenItem){
        val almach = HashMap<String, Any>()
        almach["clues"] = almacenItem.clues
        almach["direccion"] = almacenItem.direccion
        almach["colonia"] = almacenItem.colonia
        almach["ciudad"] = almacenItem.ciudad
        almach["estado"] = almacenItem.estado
        almach["encargado"] = almacenItem.encargado
        almach["telefono"] = almacenItem.telefono
        almach["email"] = almacenItem.email
        almach["metrosCuadrados"] = almacenItem.metrosCuadrados
        almach["cargaDiaria"] = almacenItem.cargaDiaria

    }

    data class AlamacenItem(
        var clues: String = "",
        var direccion: String = "",
        var colonia: String = "",
        var ciudad: String = "",
        var estado: String = "",
        var encargado: String = "",
        var telefono: String = "",
        var email: String = "",
        var metrosCuadrados:String = "",
        var cargaDiaria: String)

    val CAMERA_REQUEST_CODE_1:Int=0
    val CAMERA_REQUEST_CODE_2:Int=1
    val CAMERA_REQUEST_CODE_3:Int=2

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when(requestCode){
            CAMERA_REQUEST_CODE_1 ->{
                if(resultCode== Activity.RESULT_OK && data !=null){
                    imageView1.setImageBitmap(data.extras?.get("data") as Bitmap)
                }
            }
            CAMERA_REQUEST_CODE_2 ->{
                if(resultCode== Activity.RESULT_OK && data !=null){
                    imageView2.setImageBitmap(data.extras?.get("data") as Bitmap)
                }
            }
            CAMERA_REQUEST_CODE_3 ->{
                if(resultCode== Activity.RESULT_OK && data !=null){
                    imageView3.setImageBitmap(data.extras?.get("data") as Bitmap)
                }
            }
            else -> {
                Toast.makeText(this,
                    "Cámara tuvo problemas para tomar la foto", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
