package models

import com.example.moelasv2.R

object constantsSavingSkills {
    var allQuestionsSaving = ArrayList<questionsSavingSkills>()

    fun getAllQuestions(){
        allQuestionsSaving.clear()

        val savingQue1 =  questionsSavingSkills(
            1,
            "What is the recommended minimum percentage of your monthly income to save for emergencies and future financial goals in South Africa?",
            R.drawable.logo,
            optionOneSaving = "5%",
            optionTwoSaving = "10%",
            optionThreeSaving = "20%",
            correctAnswerSaving = "10%"

        )

        val savingQue2 = questionsSavingSkills(
            2,
            questionTextSaving = "Which of the following is a tax-advantaged savings account in South Africa designed for retirement savings?",
            R.drawable.logo,
            optionOneSaving = "Fixed Deposit Account",
            optionTwoSaving = "Tax-Free Savings Account (TFSA)",
            optionThreeSaving = "Current Account",
            correctAnswerSaving = "Tax-Free Savings Account (TFSA)"
        )

        val savingQue3 = questionsSavingSkills(
            3,
            questionTextSaving = "In South Africa, what is the purpose of a 32-day notice savings account?",
            R.drawable.logo,
            optionOneSaving = "To earn higher interest rates",
            optionTwoSaving = "To access funds immediately without any notice",
            optionThreeSaving = "To avoid paying taxes on interest earned",
            correctAnswerSaving = "To earn higher interest rates"

        )

        val savingQue4 = questionsSavingSkills(
            4,
            questionTextSaving = "Which of the following is a recommended strategy to save money on groceries in South Africa?",
            R.drawable.logo,
            optionOneSaving = "Dining out more often",
            optionTwoSaving = "Buying in bulk",
            optionThreeSaving = "Office rent",
            correctAnswerSaving = "Ignoring sales and discounts"

        )

        val savingQue5 = questionsSavingSkills(
            5,
            questionTextSaving = "What is the importance of having an emergency fund in South Africa?",
            R.drawable.logo,
            optionOneSaving = "To finance luxury purchases",
            optionTwoSaving = "To cover unexpected expenses and financial emergencies",
            optionThreeSaving = "To invest in the stock market",
            correctAnswerSaving = "To cover unexpected expenses and financial emergencies"

        )

        allQuestionsSaving.add(savingQue1)
        allQuestionsSaving.add(savingQue2)
        allQuestionsSaving.add(savingQue3)
        allQuestionsSaving.add(savingQue4)
        allQuestionsSaving.add(savingQue5)

    }
}