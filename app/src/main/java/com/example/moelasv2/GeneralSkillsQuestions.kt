package com.example.moelasv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import androidx.cardview.widget.CardView
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

        var userScoreGeneral = intent.extras?.getInt("generalUserScore")
        if(userScoreGeneral == null){
            userScoreGeneral = 1
        }
        // Get the user score the same way as the question number

        //val taxQuestionNumber = 1
        //previouse error section - keeping it seprate to diagnose - START
        var generalQuestionNumber = intent.extras?.getInt("questionNumberGeneral")
        if(generalQuestionNumber == null){
            generalQuestionNumber = 1
        }
        Log.d("AAA Question Number",generalQuestionNumber.toString())
        //previouse error section - keeping it seprate to diagnose - END



        //added after error not loading - START
        if(generalQuestionNumber == 1) {
            constantsGeneralSkills.getAllQuestions()
        }
        //added after error not loading - END


        val listOfQuestions = constantsGeneralSkills.allQuestionsGeneral


        //redefining list of questions
        //previouse error section - keeping it seprate to diagnose - START (Below is commented out because of the above error section
        //val taxQuestionNumber: Int = 1
        //previouse error section - keeping it seprate to diagnose - END



        val generalCurrentQuestion = listOfQuestions[generalQuestionNumber!!-1]

        //Start of the actual backend of the transitions between questions and their validations
        binding.generalQuestionTitle.text = "Tax Skills - Question ${generalCurrentQuestion.id}"
        binding.generalQuestionText.text = "" + generalCurrentQuestion.questionTextGeneral
        binding.rgGeneralOptionOne.text = "" + generalCurrentQuestion.optionOneGeneral
        binding.rgGeneralOptionTwo.text = generalCurrentQuestion.optionTwoGeneral
        binding.rgGeneralOptionThree.text = generalCurrentQuestion.optionThreeGeneral
        binding.pbProgressGeneral.progress = generalCurrentQuestion.id
        binding.pbProgressTextGeneral.text = "${generalQuestionNumber}/${listOfQuestions.count()}"

        binding.nextQuestionGeneralButton.setOnClickListener{
            var selectedAnswerGeneral: Int = binding.rgGeneralOptions.checkedRadioButtonId  //answer selected
            Log.d("AAA Selected ID:", selectedAnswerGeneral.toString())

            if(selectedAnswerGeneral != -1){
                var selectedAnswerValueGeneral = findViewById<RadioButton>(selectedAnswerGeneral)
                Log.d("AAA selected answer", selectedAnswerValueGeneral.text.toString())

                if(selectedAnswerValueGeneral.text == generalCurrentQuestion.correctAnswerGeneral){
                    userScoreGeneral = userScoreGeneral!! + 1
                    Log.d("AAA user score is what:", userScoreGeneral.toString())
                }

                Log.d("AAA What number we are at", generalQuestionNumber.toString())

                if(generalQuestionNumber == 5){
                    val intent = Intent(this,QuestionResultsActivityGeneral::class.java)
                    intent.putExtra("generalUserScore", userScoreGeneral)
                    startActivity(intent)

                } else{
                    //previouse error section - keeping it seprate to diagnose - START
                    val intent = Intent(this,GeneralSkillsQuestions::class.java)
                    if (generalQuestionNumber != null) {
                        intent.putExtra("questionNumberGeneral", generalQuestionNumber + 1)
                    }
                    if(userScoreGeneral != null) {
                        intent.putExtra("generalUserScore",userScoreGeneral)
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