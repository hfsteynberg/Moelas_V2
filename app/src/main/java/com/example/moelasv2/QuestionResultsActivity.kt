package com.example.moelasv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView
import com.example.moelasv2.databinding.ActivityQuestionResultsBinding
import com.example.moelasv2.databinding.ActivityTaxSkillsQuestionsBinding

class QuestionResultsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuestionResultsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionResultsBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        var userScoreTax = intent.extras?.getInt("taxUserScore")
        binding.UserScoreText.text = userScoreTax.toString() + " out of 5"

        binding.backButton.setOnClickListener {
            intent = Intent(this, CategoriesActivity::class.java)
            intent.putExtra("taxUserScore", userScoreTax)
            startActivity(intent)
        }
    }
}