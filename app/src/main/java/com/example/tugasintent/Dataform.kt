package com.example.tugasintent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Dataform : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dataform)
        // inisialisasi komponen
        val tvNama = findViewById<TextView>(R.id.Nama)
        val tvNIM= findViewById<TextView>(R.id.Nim)
        val tvProgramstudi = findViewById<TextView>(R.id.Programstudi)
        val tvAsal = findViewById<TextView>(R.id.Asal)
        // mengubah text pada komponen
        tvNama.text = intent.getStringExtra("Nama")
        tvNIM.text = intent.getStringExtra("NIM")
        tvProgramstudi.text = intent.getStringExtra("Programstudi")
        tvAsal.text = intent.getStringExtra("Asal")
    }
}
