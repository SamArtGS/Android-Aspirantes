package com.ricardo.tarea

import android.Manifest
import android.app.Activity
import android.app.SearchManager
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.Intent.CATEGORY_BROWSABLE
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.hardware.Sensor
import android.hardware.Sensor.TYPE_ACCELEROMETER
import android.hardware.Sensor.TYPE_GYROSCOPE
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.location.LocationManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), SensorEventListener {

    val CAMERA_REQUEST_CODE:Int=0

    private lateinit var mSensorManager: SensorManager
    private lateinit var mAccelerometer : Sensor
    private lateinit var mGyroscope :Sensor

    override fun onDestroy() {
        super.onDestroy()
        println("Me morí")
    }

    override fun onStop() {
        super.onStop()
        PintarPantalla()
    }
    fun PintarPantalla(){
        boton7.setOnClickListener {

        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mSensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        mAccelerometer = mSensorManager.getDefaultSensor(TYPE_ACCELEROMETER)
        mGyroscope = mSensorManager.getDefaultSensor(TYPE_GYROSCOPE)


        boton1.setOnClickListener {
            var intent = Intent(this, Actividad2::class.java)
            val b = Bundle()
            b.putSerializable("serializable","Hola")
            intent.putExtra("infoUsuario",b)
            startActivity(intent)
        }

        boton2.setOnClickListener {
            var intent = Intent()
            intent.action = Intent.ACTION_WEB_SEARCH
            intent.putExtra(SearchManager.QUERY,"Perritos")
            startActivity(intent)
        }

        boton3.setOnClickListener {
            val callCameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if(callCameraIntent.resolveActivity(packageManager)!=null){
                startActivityForResult(callCameraIntent,CAMERA_REQUEST_CODE)
            }
        }

        boton4.setOnClickListener {
            //INTENT IMPLICITO
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"))
            browserIntent.addCategory(CATEGORY_BROWSABLE)
            startActivity(browserIntent)
        }

        boton5.setOnClickListener {
            Toast.makeText(this,"Botón de Toast", Toast.LENGTH_SHORT).show()
            Toast.makeText(this,"Hola a todos",Toast.LENGTH_SHORT).show()
        }


        boton6.setOnClickListener {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) ==
                PackageManager.PERMISSION_GRANTED){
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9141203710"))
            startActivity(intent)
        }else{
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.CALL_PHONE),123)
            }
        }


        boton7.setOnClickListener {
            val i = Intent(Intent.ACTION_SEND)
            i.type = "message/rfc822"
            i.putExtra(Intent.EXTRA_EMAIL, arrayOf("samuelarturo@icloud.com","samuelgarrido.proteco@gmail.com"))
            i.putExtra(Intent.EXTRA_SUBJECT, "Correo para mi xd")
            try {
                startActivity(Intent.createChooser(i, "Elija su app preferida, señora xd"))
            } catch (ex: ActivityNotFoundException) {
                Toast.makeText(
                    this,
                    "No hay aplicaciones de correo instaladas en el dispositivo",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }



        boton8.setOnClickListener {

            var nombreUsuario:String = nombreUsuario.text.toString()
            println(nombreUsuario)

            val lm : LocationManager = getSystemService(Context.LOCATION_SERVICE) as LocationManager
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) ==
                PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) ==
                PackageManager.PERMISSION_GRANTED) {
                var location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER)
                val longitude : Double = location.longitude
                val latitude : Double = location.latitude
                latitud.text = latitude.toString()
                longitud.text = longitude.toString()
            }else{
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.ACCESS_COARSE_LOCATION),123)
                print("No hay permiso :(")
            }
        }

    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

    }

    override fun onSensorChanged(event: SensorEvent?) {

        if (event!!.sensor.type == TYPE_ACCELEROMETER) {

            mAccx.text = "%.2f".format(event.values[0])
            mAccy.text = "%.2f".format(event.values[1])
            mAccz.text = "%.2f".format(event.values[2])

        } else if (event!!.sensor.type == TYPE_GYROSCOPE) {

            mGyrox.text = "%.2f".format(event.values[0])
            mGyroy.text = "%.2f".format(event.values[1])
            mGyroz.text = "%.2f".format(event.values[2])
        }
    }

    override fun onResume() {
        super.onResume()
        mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_NORMAL)
        mSensorManager.registerListener(this, mGyroscope, SensorManager.SENSOR_DELAY_NORMAL)
    }

    override fun onPause() {
        super.onPause()
        mSensorManager.unregisterListener(this)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when(requestCode){
            CAMERA_REQUEST_CODE ->{
                if(resultCode== Activity.RESULT_OK && data !=null){
                    imageView.setImageBitmap(data.extras?.get("data") as Bitmap)
                }
            }
            else -> {
                Toast.makeText(this,"Cámara Tuvo problemas para tomar la foto", Toast.LENGTH_SHORT)
            }
        }
    }

}
