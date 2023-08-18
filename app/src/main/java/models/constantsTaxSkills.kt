package models

import com.example.moelasv2.R

object constantsTaxSkills {
    var allQuestions = ArrayList<questionsTaxSkills>()

    fun getAllQuestions(){

        val que1 =  questionsTaxSkills(
            1,
            "Questions one content?",
            R.drawable.logo,
            optionOne = "Answer One",
            optionTwo = "Answer Two",
            optionThree = "Answer Three",
            correctAnswer = "Answer One"

        )

        val que2 = questionsTaxSkills(
            2,
            questionText = "Questions two content",
            R.drawable.logo,
            optionOne = "Answer One",
            optionTwo = "Answer Two",
            optionThree = "Answer Three",
            correctAnswer = "Answer Two"
        )

        val que3 = questionsTaxSkills(
            3,
            questionText = "Questions three content",
            R.drawable.logo,
            optionOne = "Answer One",
            optionTwo = "Answer Two",
            optionThree = "Answer Three",
            correctAnswer = "Answer Three"

        )

        allQuestions.add(que1)
        allQuestions.add(que2)
        allQuestions.add(que3)

    }
}