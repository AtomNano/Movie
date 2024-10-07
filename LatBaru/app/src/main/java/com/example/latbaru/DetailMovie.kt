package com.example.latbaru

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailMovie : AppCompatActivity() {
    private lateinit var txtKudulMovie: TextView
    private lateinit var gambarMovie: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_movie)

        txtKudulMovie = findViewById(R.id.txtKudulMovie)
        gambarMovie = findViewById(R.id.gambarMovie)

        val detailText = intent.getStringExtra("judul")
        val detailImage = intent.getIntExtra("image", 0)

        // Set data ke widget
        txtKudulMovie.setText(detailText)
        gambarMovie.setImageResource(detailImage)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}