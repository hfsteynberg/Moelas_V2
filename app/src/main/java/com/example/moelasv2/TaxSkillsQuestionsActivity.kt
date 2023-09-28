package com.example.moelasv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import androidx.cardview.widget.CardView
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

        var userScoreTax = intent.extras?.getInt("taxUserScore")
        if(userScoreTax == null){
            userScoreTax = 1
        }
        // Get the user score the same way as the question number

        //val taxQuestionNumber = 1
        //previouse error section - keeping it seprate to diagnose - START
        var taxQuestionNumber = intent.extras?.getInt("questionNumberTax")
        if(taxQuestionNumber == null){
            taxQuestionNumber = 1
        }
        Log.d("AAA Question Number",taxQuestionNumber.toString())
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

        binding.nextQuestionTaxButton.setOnClickListener{
            var selectedAnswerTax: Int = binding.rgTaxOptions.checkedRadioButtonId  //answer selected
            Log.d("AAA Selected ID:", selectedAnswerTax.toString())

            if(selectedAnswerTax != -1){
                var selectedAnswerValueTax = findViewById<RadioButton>(selectedAnswerTax)
                Log.d("AAA selected answer", selectedAnswerValueTax.text.toString())

                if(selectedAnswerValueTax.text == taxCurrentQuestion.correctAnswerTax){
                    Log.d("AAA user score is what:", userScoreTax.toString())
                }

                if(taxQuestionNumber == 5){
                    val intent = Intent(this,QuestionResultsActivity::class.java)
                    intent.putExtra("taxUserScore", userScoreTax)
                    startActivity(intent)

                } else{
                    //previouse error section - keeping it seprate to diagnose - START
                    val intent = Intent(this,TaxSkillsQuestionsActivity::class.java)
                    if (taxQuestionNumber != null) {
                        intent.putExtra("questionNumberTax", taxQuestionNumber + 1)
                    }
                    if(userScoreTax != null) {
                        intent.putExtra("taxUserScore",userScoreTax +1)
                    }
                    // pass userscore the same way as the question number
                    //still fine up until here - if statement might change that
                    startActivity(intent)
                    //previouse error section - keeping it seprate to diagnose - END
                }

                //added after error not loading - END
                finish()
                //added after error not loading - END


            } else {
                Toast.makeText(this, "Please add your answer", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
