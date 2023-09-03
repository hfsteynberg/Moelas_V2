package com.example.moelasv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.Toast
import com.example.moelasv2.databinding.ActivityCategoriesBinding
import com.example.moelasv2.databinding.ActivityTaxSkillsQuestionsBinding
import models.constantsSavingSkills
import models.constantsTaxSkills
import models.constantsTaxSkills.allQuestionsTax
import models.constantsTaxSkills.getAllQuestions

class TaxSkillsQuestionsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTaxSkillsQuestionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTaxSkillsQuestionsBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        var userScore = 0

        //val taxQuestionNumber = 1
        //previouse error section - keeping it seprate to diagnose - START
        val taxQuestionNumber = intent.extras?.getInt("questionNumberTax")
        //previouse error section - keeping it seprate to diagnose - END



        //added after error not loading - START
        if(taxQuestionNumber == 1) {
            constantsTaxSkills.getAllQuestions()
        }
        //added after error not loading - END


        val listOfQuestions = constantsTaxSkills.allQuestionsTax


        //redefining list of questions
        //previouse error section - keeping it seprate to diagnose - START (Below is commented out because of the above error section
        //val taxQuestionNumber: Int = 1
        //previouse error section - keeping it seprate to diagnose - END



        val taxCurrentQuestion = listOfQuestions[taxQuestionNumber!!-1]

        //Start of the actual backend of the transitions between questions and their validations
        binding.taxQuestionTitle.text = "Tax Skills - Question ${taxCurrentQuestion.id}"
        binding.taxQuestionText.text = "" + taxCurrentQuestion.questionTextTax
        binding.rgTaxOptionOne.text = "" + taxCurrentQuestion.optionOneTax
        binding.rgTaxOptionTwo.text = taxCurrentQuestion.optionTwoTax
        binding.rgTaxOptionThree.text = taxCurrentQuestion.optionThreeTax
        binding.pbProgressTax.progress = taxCurrentQuestion.id
        binding.pbProgressTextTax.text = "${taxQuestionNumber}/${listOfQuestions.count()}"
        //tax question number is also added after error

        binding.nextQuestionTax.setOnClickListener{
            var selectedAnswerTax: Int = binding.rgTaxOptions.checkedRadioButtonId  //answer selected
            Log.d("AAA Selected ID:", selectedAnswerTax.toString())

            if(selectedAnswerTax != -1){
                var selectedAnswerValueTax = findViewById<RadioButton>(selectedAnswerTax)
                Log.d("AAA selected answer", selectedAnswerValueTax.text.toString())

                if(selectedAnswerValueTax.text == taxCurrentQuestion.correctAnswerTax){
                    userScore++
                    Log.d("AAA user score is what:", userScore.toString())
                }



                //previouse error section - keeping it seprate to diagnose - START
                val intent = Intent(this,TaxSkillsQuestionsActivity::class.java)
                if (taxQuestionNumber != null) {
                    intent.putExtra("questionNumberTax", taxQuestionNumber + 1)
                }
                //still fine up until here - if statement might change that
                startActivity(intent)
                //previouse error section - keeping it seprate to diagnose - END



                //added after error not loading - END
                finish()
                //added after error not loading - END


            } else {
                Toast.makeText(this, "Please add your answer", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
