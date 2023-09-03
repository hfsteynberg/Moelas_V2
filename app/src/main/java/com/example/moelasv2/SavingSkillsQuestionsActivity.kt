package com.example.moelasv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        binding.savingQuestionTitle.text = "Saving Skills - Question ${listOfQuestions[0].id}"
        binding.savingQuestionText.text = "" + listOfQuestions[0].questionTextSaving
        binding.rgSavingOptionOne.text = "" + listOfQuestions[0].optionOneSaving
        binding.rgSavingOptionTwo.text = listOfQuestions[0].optionTwoSaving
        binding.rgSavingOptionThree.text = listOfQuestions[0].optionThreeSaving
        binding.pbProgressSaving.progress = listOfQuestions[0].id
        binding.pbProgressTextSaving.text = "${listOfQuestions[0].id}/${listOfQuestions.count()}"
    }
}