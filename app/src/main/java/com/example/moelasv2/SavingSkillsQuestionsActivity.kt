package com.example.moelasv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView
import com.example.moelasv2.databinding.ActivitySavingSkillsQuestionsBinding
import com.example.moelasv2.databinding.ActivityTaxSkillsQuestionsBinding
import models.constantsSavingSkills
import models.constantsTaxSkills

class SavingSkillsQuestionsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySavingSkillsQuestionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySavingSkillsQuestionsBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        constantsSavingSkills.getAllQuestions()
        val listOfQuestions = constantsSavingSkills.allQuestionsSaving

        //Start of the actual backend of the transitions between questions and their validations
        binding.savingQuestionTitle.text = "Saving Skills - Question ${listOfQuestions[3].id}"
        binding.savingQuestionText.text = "" + listOfQuestions[3].questionTextSaving
        binding.rgSavingOptionOne.text = "" + listOfQuestions[3].optionOneSaving
        binding.rgSavingOptionTwo.text = listOfQuestions[3].optionTwoSaving
        binding.rgSavingOptionThree.text = listOfQuestions[3].optionThreeSaving
        binding.pbProgressSaving.progress = listOfQuestions[3].id
        binding.pbProgressTextSaving.text = "${listOfQuestions[3].id}/${listOfQuestions.count()}"

        val finishNav = findViewById<Button>(R.id.nextQuestionSavingButton)
        finishNav.setOnClickListener{
            val Intent = Intent(this,QuestionResultsActivity::class.java)
            startActivity(Intent)
        }
    }
}