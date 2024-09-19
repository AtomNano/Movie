package com.example.latbaru

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WelcomePageActivity : AppCompatActivity() {

    private lateinit var txtWelcome: TextView
    private lateinit var btnHomePage: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome_page)

        txtWelcome = findViewById(R.id.txtWelcome)
        btnHomePage = findViewById(R.id.btnHomePage) // Inisialisasi btnHomePage

        val getDataUser = intent.getStringExtra("username")
        val getDataPass = intent.getStringExtra("password")

        txtWelcome.text = "Selamat Datang ${getDataUser}!\n Password Anda ${getDataPass}"

        btnHomePage.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}