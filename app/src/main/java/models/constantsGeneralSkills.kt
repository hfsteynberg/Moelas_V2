package models

import com.example.moelasv2.R

object constantsGeneralSkills {
    var allQuestions = ArrayList<questionsGeneralSkills>()

    fun getAllQuestions(){

        val que1 =  questionsGeneralSkills(
            1,
            "Questions one content?",
            R.drawable.logo,
            optionOne = "Answer One",
            optionTwo = "Answer Two",
            optionThree = "Answer Three",
            correctAnswer = "Answer One"

        )

        val que2 = questionsGeneralSkills(
            2,
            questionText = "Questions two content",
            R.drawable.logo,
            optionOne = "Answer One",
            optionTwo = "Answer Two",
            optionThree = "Answer Three",
            correctAnswer = "Answer Two"
        )

        val que3 = questionsGeneralSkills(
            3,
            questionText = "Questions three content",
            R.drawable.logo,
            optionOne = "Answer One",
            optionTwo = "Answer Two",
            optionThree = "Answer Three",
            correctAnswer = "Answer Three"

        )

        val que4 = questionsGeneralSkills(
            4,
            questionText = "Questions four content",
            R.drawable.logo,
            optionOne = "Answer One",
            optionTwo = "Answer Two",
            optionThree = "Answer Three",
            correctAnswer = "Answer One"

        )

        val que5 = questionsGeneralSkills(
            5,
            questionText = "Questions five content",
            R.drawable.logo,
            optionOne = "Answer One",
            optionTwo = "Answer Two",
            optionThree = "Answer Three",
            correctAnswer = "Answer Two"

        )

        allQuestions.add(que1)
        allQuestions.add(que2)
        allQuestions.add(que3)
        allQuestions.add(que4)
        allQuestions.add(que5)

    }
}