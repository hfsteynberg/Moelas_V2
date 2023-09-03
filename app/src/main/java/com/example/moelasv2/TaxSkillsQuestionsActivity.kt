package com.example.moelasv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import models.constantsTaxSkills.allQuestions
import models.constantsTaxSkills.getAllQuestions

class TaxSkillsQuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tax_skills_questions)

        getAllQuestions()
        val listOfQuestions = allQuestions

        Log.d("AAA First questions :", listOfQuestions[0].questionText)
    }
}