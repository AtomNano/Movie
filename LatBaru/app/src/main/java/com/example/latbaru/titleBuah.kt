package com.example.latbaru

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class titleBuah : AppCompatActivity() {

    private lateinit var txtNamaBuah: TextView
    private lateinit var imgDetailBuah: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_title_buah)


        txtNamaBuah = findViewById(R.id.txtNamaBuah)
        imgDetailBuah = findViewById(R.id.imgDetailBuah)


        val detailText = intent.getStringExtra("judul")
        val detailImage = intent.getIntExtra("image", 0)

        // Set data ke widget
        txtNamaBuah.setText(detailText)
        imgDetailBuah.setImageResource(detailImage)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}