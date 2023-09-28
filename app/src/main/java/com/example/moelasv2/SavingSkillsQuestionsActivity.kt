package com.example.moelasv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.example.moelasv2.databinding.ActivitySavingSkillsQuestionsBinding
import com.example.moelasv2.databinding.ActivityTaxSkillsQuestionsBinding
import models.constantsGeneralSkills
import models.constantsSavingSkills
import models.constantsTaxSkills

class SavingSkillsQuestionsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySavingSkillsQuestionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySavingSkillsQuestionsBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        var userScoreSaving = intent.extras?.getInt("savingUserScore")
        if(userScoreSaving == null){
            userScoreSaving = 1
        }
        // Get the user score the same way as the question number

        //val savingQuestionNumber = 1
        //previouse error section - keeping it seprate to diagnose - START
        var savingQuestionNumber = intent.extras?.getInt("questionNumberSaving")
        if(savingQuestionNumber == null){
            savingQuestionNumber = 1
        }
        Log.d("AAA Question Number",savingQuestionNumber.toString())
        //previouse error section - keeping it seprate to diagnose - END



        //added after error not loading - START
        if(savingQuestionNumber == 1) {
            constantsSavingSkills.getAllQuestions()
        }
        //added after error not loading - END


        val listOfQuestionsSavings = constantsSavingSkills.allQuestionsSaving


        //redefining list of questions
        //previouse error section - keeping it seprate to diagnose - START (Below is commented out because of the above error section
        //val taxQuestionNumber: Int = 1
        //previouse error section - keeping it seprate to diagnose - END



        val savingCurrentQuestion = listOfQuestionsSavings[savingQuestionNumber!!-1]


        //Start of the actual backend of the transitions between questions and their validations
        binding.savingQuestionTitle.text = "Tax Skills - Question ${savingCurrentQuestion.id}"
        binding.savingQuestionText.text = "" + savingCurrentQuestion.questionTextSaving
        binding.rgSavingOptionOne.text = "" + savingCurrentQuestion.optionOneSaving
        binding.rgSavingOptionTwo.text = savingCurrentQuestion.optionTwoSaving
        binding.rgSavingOptionThree.text = savingCurrentQuestion.optionThreeSaving
        binding.pbProgressSaving.progress = savingCurrentQuestion.id
        binding.pbProgressTextSaving.text = "${savingQuestionNumber}/${listOfQuestionsSavings.count()}"

        binding.nextQuestionSavingButton.setOnClickListener{
            var selectedAnswerSaving: Int = binding.rgSavingOptions.checkedRadioButtonId  //answer selected
            Log.d("AAA Selected ID:", selectedAnswerSaving.toString())

            if(selectedAnswerSaving != -1){
                var selectedAnswerValueSaving = findViewById<RadioButton>(selectedAnswerSaving)
                Log.d("AAA selected answer", selectedAnswerValueSaving.text.toString())

                if(selectedAnswerValueSaving.text == savingCurrentQuestion.correctAnswerSaving){
                    Log.d("AAA user score is what:", userScoreSaving.toString())
                }

                if(savingQuestionNumber == 5){
                    val intent = Intent(this,QuestionResultsActivitySavings::class.java)
                    intent.putExtra("savingUserScore", userScoreSaving)
                    startActivity(intent)

                } else{
                    //previouse error section - keeping it seprate to diagnose - START
                    val intent = Intent(this,SavingSkillsQuestionsActivity::class.java)
                    if (savingQuestionNumber != null) {
                        intent.putExtra("questionNumberSaving", savingQuestionNumber + 1)
                    }
                    if(userScoreSaving != null) {
                        intent.putExtra("savingUserScore",userScoreSaving +1)
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