package com.example.moelasv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.cardview.widget.CardView
import com.example.moelasv2.databinding.ActivityCategoriesBinding
import models.questionsTaxSkills

class CategoriesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCategoriesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoriesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val Username = intent?.getStringExtra("username")
        binding.Userame.text = "Welcome, $Username!"


        val taxSkillsNav = findViewById<CardView>(R.id.taxSkillsButton)
        taxSkillsNav.setOnClickListener{
            val Intent = Intent(this,TaxSkillsQuestionsActivity::class.java)
            startActivity(Intent)
        }

        val generalSkillsNav = findViewById<CardView>(R.id.generalSkillsButton)
        generalSkillsNav.setOnClickListener{
            val Intent = Intent(this,GeneralSkillsQuestions::class.java)
            startActivity(Intent)
        }

        val savingSkillsNav = findViewById<CardView>(R.id.savingSkillsButton)
        savingSkillsNav.setOnClickListener{
            val Intent = Intent(this,SavingSkillsQuestionsActivity::class.java)
            startActivity(Intent)
        }

        val settingsNav = findViewById<ImageView>(R.id.settingsButton)
        settingsNav.setOnClickListener{
            val Intent = Intent(this,SettingsActivity::class.java)
            startActivity(Intent)
        }
    }
}