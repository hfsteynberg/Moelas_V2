package com.example.moelasv2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView
import com.example.moelasv2.databinding.ActivityQuestionResultsSavingsBinding
import com.example.moelasv2.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySettingsBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        var userScoreTax = intent.extras?.getInt("taxUserScore")
        var userScoreGeneral = intent.extras?.getInt("generalUserScore")
        var userScoreSavings = intent.extras?.getInt("savingUserScore")

        binding.clearAllGameData.setOnClickListener {
            userScoreTax = 1
            userScoreGeneral = 1
            userScoreSavings = 1
            val intent = Intent(this,CategoriesActivity::class.java)
            startActivity(intent)
        }

        val closeNav = findViewById<ImageView>(R.id.closeButton)
        closeNav.setOnClickListener{
            val intent = Intent(this,CategoriesActivity::class.java)
            startActivity(intent)
        }

    }
}