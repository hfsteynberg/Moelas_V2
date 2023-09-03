package models

import com.example.moelasv2.R

object constantsSavingSkills {
    var allQuestions = ArrayList<questionsSavingSkills>()

    fun getAllQuestions(){

        val que1 =  questionsSavingSkills(
            1,
            "Questions one content?",
            R.drawable.logo,
            optionOne = "Answer One",
            optionTwo = "Answer Two",
            optionThree = "Answer Three",
            correctAnswer = "Answer One"

        )

        val que2 = questionsSavingSkills(
            2,
            questionText = "Questions two content",
            R.drawable.logo,
            optionOne = "Answer One",
            optionTwo = "Answer Two",
            optionThree = "Answer Three",
            correctAnswer = "Answer Two"
        )

        val que3 = questionsSavingSkills(
            3,
            questionText = "Questions three content",
            R.drawable.logo,
            optionOne = "Answer One",
            optionTwo = "Answer Two",
            optionThree = "Answer Three",
            correctAnswer = "Answer Three"

        )

        val que4 = questionsSavingSkills(
            4,
            questionText = "Questions four content",
            R.drawable.logo,
            optionOne = "Answer One",
            optionTwo = "Answer Two",
            optionThree = "Answer Three",
            correctAnswer = "Answer One"

        )

        val que5 = questionsSavingSkills(
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