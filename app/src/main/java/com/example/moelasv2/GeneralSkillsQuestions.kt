package com.example.moelasv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moelasv2.databinding.ActivityGeneralSkillsQuestionsBinding
import com.example.moelasv2.databinding.ActivityTaxSkillsQuestionsBinding
import models.constantsGeneralSkills
import models.constantsTaxSkills

class GeneralSkillsQuestions : AppCompatActivity() {

    private lateinit var binding: ActivityGeneralSkillsQuestionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGeneralSkillsQuestionsBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        constantsGeneralSkills.getAllQuestions()
        val listOfQuestions = constantsGeneralSkills.allQuestionsGeneral

        //Start of the actual backend of the transitions between questions and their validations
        binding.generalQuestionTitle.text = "General Skills - Question ${listOfQuestions[0].id}"
        binding.generalQuestionText.text = "" + listOfQuestions[0].questionTextGeneral
        binding.rgGeneralOptionOne.text = "" + listOfQuestions[0].optionOneGeneral
        binding.rgGeneralOptionTwo.text = listOfQuestions[0].optionTwoGeneral
        binding.rgGeneralOptionThree.text = listOfQuestions[0].optionThreeGeneral
        binding.pbProgressGeneral.progress = listOfQuestions[0].id
        binding.pbProgressTextGeneral.text = "${listOfQuestions[0].id}/${listOfQuestions.count()}"
    }
}