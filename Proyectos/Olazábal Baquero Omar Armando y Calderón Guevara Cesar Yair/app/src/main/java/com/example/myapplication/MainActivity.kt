package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.widget.Button
import android.widget.Toast
import androidx.core.content.FileProvider
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

private const val FILE_NAME = "photo.jpg"
private const val REQUEST_CODE = 1
private lateinit var photoFile: File
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTomarFoto.setOnClickListener {
            val tomarFotoIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            photoFile = obtenerArchivoFoto(FILE_NAME)

            val proveedorFoto = FileProvider.getUriForFile(this, "com.example.fileprovider", photoFile)
            tomarFotoIntent.putExtra(MediaStore.EXTRA_OUTPUT, proveedorFoto)
            if(tomarFotoIntent.resolveActivity(this.packageManager) != null) {
                startActivityForResult(tomarFotoIntent, REQUEST_CODE)
            }else{
                Toast.makeText(this, "No es posible abrir la cámara", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun obtenerArchivoFoto(fileName: String):File{ //Funcion para obtener la foto en mejor calidad
        val directorioAlmacenamiento = getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        return File.createTempFile(fileName, ".jpg", directorioAlmacenamiento)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == REQUEST_CODE && resultCode  == Activity.RESULT_OK){ //Si esto es TRUE, el usuario logro tomar la foto
            //val imagenTomada = data?.extras?.get("data") as Bitmap//data y extras son nullables, llevan '?'
            val imagenTomada = BitmapFactory.decodeFile(photoFile.absolutePath)
            imageView.setImageBitmap(imagenTomada) //Colocamos la foto tomada en el imageView
        }else {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }
}
