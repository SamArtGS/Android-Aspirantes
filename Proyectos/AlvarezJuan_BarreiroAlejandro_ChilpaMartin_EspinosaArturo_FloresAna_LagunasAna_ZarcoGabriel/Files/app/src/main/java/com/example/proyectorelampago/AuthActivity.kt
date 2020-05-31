package com.example.proyectorelampago

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_auth.*

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        // SplashScreen
        setTheme(R.style.AppTheme)

        // Instanciacion
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        // Analytics events
        val analytics = FirebaseAnalytics.getInstance(this)
        val bundle = Bundle()
        bundle.putString("message", "Integracion de Firebase completa")
        analytics.logEvent("InitScreen", bundle)

        // Setup
        setup()
    }

    private fun setup() {
        title = "Autenticación"

        signInButton.setOnClickListener {
            if (emailEditText.text.isNotEmpty() && passwordEditText.text.isNotEmpty()){

                FirebaseAuth.getInstance().createUserWithEmailAndPassword(
                    emailEditText.text.toString(),
                    passwordEditText.text.toString()).addOnCompleteListener {
                        if(it.isSuccessful){
                            showHome(it.result?.user?.email ?:"", ProviderType.BASIC)
                        } else {
                            showAlert()
                        }
                    }
            } else {
                showAlertNull()
            }

        }

        logInButton.setOnClickListener {
            if (emailEditText.text.isNotEmpty() && passwordEditText.text.isNotEmpty()){

                FirebaseAuth.getInstance().signInWithEmailAndPassword(
                    emailEditText.text.toString(),
                    passwordEditText.text.toString()).addOnCompleteListener {
                        if(it.isSuccessful){
                            showHome(it.result?.user?.email ?:"--", ProviderType.BASIC)
                        } else {
                            showAlert()
                        }
                    }
            } else {
                showAlertNull()
            }
        }
    }

    private fun showAlert() {

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Se ha producido un error de autentificación del usuario")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()

    }

    private fun showAlertNull() {

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Ingrese todos los datos")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()

    }

    private fun showAlertRegister() {

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Confirmación")
        builder.setMessage("Registro completado con éxito.")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()

    }

    private fun showHome(email: String, provider: ProviderType) {
        val homeIntent = Intent(this, HomeActivity::class.java).apply {
            putExtra("email", email)
            putExtra("provider", provider.name)
        }

        startActivity(homeIntent)
    }
}
