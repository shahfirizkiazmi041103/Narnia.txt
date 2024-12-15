package com.example.medicalhealth

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        Log.d("ActivityLifecycle", "MainActivity: onCreate")

        // Referensi ke Email dan Password EditText
        val emailEditText = findViewById<EditText>(R.id.email_or_phone)
        val passwordEditText = findViewById<EditText>(R.id.password)

        // Referensi ke Tombol Login
        val loginButton = findViewById<Button>(R.id.sign_in)

        // Aksi ketika tombol login diklik
        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Cek apakah email dan password benar
            if (email == "a@gmail.com" && password == "111") {
                // Jika benar, pindah ke DashboardActivity
                val intent = Intent(this, DashboardActivity::class.java)
                startActivity(intent)
            } else {
                // Jika salah, tampilkan pesan error
                Toast.makeText(this, "Email atau password salah!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("ActivityLifecycle", "MainActivity: onStart")
    }








    override fun onResume() {
        super.onResume()
        Log.d("ActivityLifecycle", "MainActivity: onResume")
    }









    override fun onPause() {
        super.onPause()
        Log.d("ActivityLifecycle", "MainActivity: onPause")
    }







    override fun onStop() {
        super.onStop()
        Log.d("ActivityLifecycle", "MainActivity: onStop")
    }











    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityLifecycle", "MainActivity: onDestroy")
    }
}
