package com.example.moelasv2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class SettingsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val closeNav = findViewById<ImageView>(R.id.closeButton)
        closeNav.setOnClickListener{
            val Intent = Intent(this,CategoriesActivity::class.java)
            startActivity(Intent)
        }

    }
}