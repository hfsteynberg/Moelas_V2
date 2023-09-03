package com.example.moelasv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.moelasv2.databinding.ActivityCategoriesBinding
import com.example.moelasv2.databinding.ActivityTaxSkillsQuestionsBinding
import models.constantsTaxSkills.allQuestionsTax
import models.constantsTaxSkills.getAllQuestions

class TaxSkillsQuestionsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTaxSkillsQuestionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTaxSkillsQuestionsBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        getAllQuestions()
        val listOfQuestions = allQuestionsTax

        Log.d("AAA First questions :", listOfQuestions[0].id.toString())

        //Start of the actual backend of the transitions between questions and their validations
        binding.taxQuestionTitle.text = "Tax Skills - Question ${listOfQuestions[0].id}"
        binding.taxQuestionText.text = "" + listOfQuestions[0].questionTextTax
        binding.rgTaxOptionOne.text = "" + listOfQuestions[0].optionOneTax
        binding.rgTaxOptionTwo.text = listOfQuestions[0].optionTwoTax
        binding.rgTaxOptionThree.text = listOfQuestions[0].optionThreeTax
        binding.pbProgressTax.progress = listOfQuestions[0].id
        binding.pbProgressTextTax.text = "${listOfQuestions[0].id}/${listOfQuestions.count()}"

    }
}