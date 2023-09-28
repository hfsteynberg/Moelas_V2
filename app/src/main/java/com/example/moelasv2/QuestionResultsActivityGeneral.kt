package com.example.moelasv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moelasv2.databinding.ActivityQuestionResultsBinding
import com.example.moelasv2.databinding.ActivityQuestionResultsGeneralBinding

class QuestionResultsActivityGeneral : AppCompatActivity() {

    private lateinit var binding: ActivityQuestionResultsGeneralBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionResultsGeneralBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        var userScoreGeneral = intent.extras?.getInt("generalUserScore")
        binding.UserScoreTextGeneral.text = userScoreGeneral.toString() + " out of 5"

        binding.backButton.setOnClickListener {
            intent = Intent(this, CategoriesActivity::class.java)
            startActivity(intent)
        }
    }
}