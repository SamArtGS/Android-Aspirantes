package com.example.myapplication2

import android.app.Activity
import android.app.SearchManager
import android.content.Intent
import android.content.Intent.CATEGORY_BROWSABLE
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.MediaStore
import android.view.ActionMode
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val CAMERA_REQUEST_CODE:Int=0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        boton2.setOnClickListener {
            var intent = Intent(this, Actividad2::class.java)
            startActivity(intent)
        }
        boton3.setOnClickListener {
            var intent = Intent()
            intent.setAction(Intent.ACTION_WEB_SEARCH)
            intent.putExtra(SearchManager.QUERY,"Perritos");
            startActivity(intent);
        }

        iniciarSesion.setOnClickListener {
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
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when(requestCode){
            CAMERA_REQUEST_CODE ->{
                if(resultCode==Activity.RESULT_OK && data !=null){
                    imageView.setImageBitmap(data.extras?.get("data") as Bitmap)
                }
            }
            else -> {
                Toast.makeText(this,"Cámarauvo problemas para tomar la foto",Toast.LENGTH_SHORT)
            }
        }
    }


    override fun onDestroy() {
        super.onDestroy()

    }

    override fun onStart() {
        super.onStart()

    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onPause() {
        super.onPause()

    }

    override fun onStop() {
        super.onStop()
    }

    override fun onResume() {
        super.onResume()

    }


}
