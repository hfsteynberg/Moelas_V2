package com.example.moelasv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moelasv2.databinding.ActivityQuestionResultsGeneralBinding
import com.example.moelasv2.databinding.ActivityQuestionResultsSavingsBinding

class QuestionResultsActivitySavings : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionResultsSavingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuestionResultsSavingsBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        var userScoreSavings = intent.extras?.getInt("savingUserScore")

        binding.UserScoreTextSavings.text = userScoreSavings.toString() + " out of 5"

        binding.backButton.setOnClickListener {
            intent = Intent(this, CategoriesActivity::class.java)
            startActivity(intent)
        }
    }
}