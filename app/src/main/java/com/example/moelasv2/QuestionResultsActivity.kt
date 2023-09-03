package com.example.moelasv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class QuestionResultsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_results)

        val finishNav = findViewById<Button>(R.id.backButton)
        finishNav.setOnClickListener{
            val Intent = Intent(this,CategoriesActivity::class.java)
            startActivity(Intent)
        }
    }
}