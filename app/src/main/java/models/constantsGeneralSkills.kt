package models

import com.example.moelasv2.R

object constantsGeneralSkills {
    var allQuestionsGeneral = ArrayList<questionsGeneralSkills>()

    fun getAllQuestions(){
        allQuestionsGeneral.clear()

        val generalQue1 =  questionsGeneralSkills(
            1,
            "What is the purpose of a credit score in South Africa?",
            R.drawable.logo,
            optionOneGeneral = "To determine your eligibility for social benefits",
            optionTwoGeneral = "To assess your ability to repay loans and credit",
            optionThreeGeneral = "To calculate your retirement savings",
            correctAnswerGeneral = "To assess your ability to repay loans and credit"

        )

        val generalQue2 = questionsGeneralSkills(
            2,
            questionTextGeneral = "Which of the following best describes the concept of - compound interest - in South Africa?",
            R.drawable.logo,
            optionOneGeneral = "The interest charged by a bank for an overdraft",
            optionTwoGeneral = "Interest earned on both the initial amount and any accumulated interest",
            optionThreeGeneral = "A government tax on investments",
            correctAnswerGeneral = "Interest earned on both the initial amount and any accumulated interest"
        )

        val generalQue3 = questionsGeneralSkills(
            3,
            questionTextGeneral = "In South Africa, what is the recommended practice for creating a budget?",
            R.drawable.logo,
            optionOneGeneral = "Spend as much as you earn",
            optionTwoGeneral = "Spend more than you earn to enjoy life",
            optionThreeGeneral = "Spend less than you earn and allocate funds to different expenses",
            correctAnswerGeneral = "Spend less than you earn and allocate funds to different expenses"

        )

        val generalQue4 = questionsGeneralSkills(
            4,
            questionTextGeneral = "When should you start saving for retirement in South Africa?",
            R.drawable.logo,
            optionOneGeneral = "In your 60s",
            optionTwoGeneral = "As soon as you start working",
            optionThreeGeneral = "After paying off all your debts",
            correctAnswerGeneral = "As soon as you start working"

        )

        val generalQue5 = questionsGeneralSkills(
            5,
            questionTextGeneral = "What is the purpose of diversifying an investment portfolio in South Africa?",
            R.drawable.logo,
            optionOneGeneral = "To concentrate all investments in one asset class",
            optionTwoGeneral = "To reduce risk by spreading investments across different asset classes",
            optionThreeGeneral = "To maximize short-term gains",
            correctAnswerGeneral = "To reduce risk by spreading investments across different asset classes"

        )

        allQuestionsGeneral.add(generalQue1)
        allQuestionsGeneral.add(generalQue2)
        allQuestionsGeneral.add(generalQue3)
        allQuestionsGeneral.add(generalQue4)
        allQuestionsGeneral.add(generalQue5)

    }
}