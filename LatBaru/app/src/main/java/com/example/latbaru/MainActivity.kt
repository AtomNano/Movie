package com.example.latbaru

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var eUser : EditText
    private lateinit var ePassword : EditText
    private lateinit var btnLogin : Button
    private lateinit var btnList : Button
    private lateinit var btnRecycle : Button
    private lateinit var btnRecycleBuah : Button
    private lateinit var btnMovie : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        eUser = findViewById(R.id.eUser)
        ePassword = findViewById(R.id.ePassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnList = findViewById(R.id.btnList)
        btnRecycle = findViewById(R.id.btnRecycle)
        btnRecycleBuah = findViewById(R.id.btnBuah)
        btnMovie = findViewById(R.id.button)

        btnLogin.setOnClickListener {
            val nUsername = eUser.text.toString()
            val nPassword = ePassword.text.toString()

            val intent = Intent(this, WelcomePageActivity::class.java)
            intent.putExtra("username", nUsername)
            intent.putExtra("password", nPassword)

            Log.d("cek data username", nUsername)
            Log.d("cek data Password", nPassword)

            startActivity(intent)
        }

        btnList.setOnClickListener {
            val intent = Intent(this, ListViewActivity::class.java)
            startActivity(intent)
        }

        btnRecycle.setOnClickListener {
            val intent = Intent(this, RecycleViewActivity::class.java)
            startActivity(intent)
        }
        btnRecycleBuah.setOnClickListener {
            val intent = Intent(this, RecycleBuahImageActivity::class.java)
            startActivity(intent)
        }
        btnMovie.setOnClickListener {
            val intent = Intent(this, MovieActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}