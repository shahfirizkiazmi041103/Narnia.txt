package com.example.medicalhealth

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.medicalhealth.R

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashbord)
        val seeAllServices = findViewById<TextView>(R.id.see_all_services) // Pastikan ID sesuai

        // Menambahkan listener untuk klik
        seeAllServices.setOnClickListener {
            // Intent untuk pindah ke LayananKesehatanActivity
            val intent = Intent(this, LayananKesehatanActivity::class.java)
            startActivity(intent)
        }
    }
}
