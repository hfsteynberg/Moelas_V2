package models

import com.example.moelasv2.R

object constantsTaxSkills {
    var allQuestionsTax = ArrayList<questionsTaxSkills>()

    fun getAllQuestions(){
    allQuestionsTax.clear()

        val taxQue1 =  questionsTaxSkills(
            1,
            "What is the standard rate of Value Added Tax (VAT) in South Africa?",
            R.drawable.logo,
            optionOneTax = "10%",
            optionTwoTax = "15%",
            optionThreeTax = "20%",
            correctAnswerTax = "15%"

        )

        val taxQue2 = questionsTaxSkills(
            2,
            questionTextTax = "Which of the following is a taxable income source for individuals in South Africa?",
            R.drawable.logo,
            optionOneTax = "Gifts from family members",
            optionTwoTax = "Rental income",
            optionThreeTax = "Inheritance from a deceased relative",
            correctAnswerTax = "Rental income"
        )

        val taxQue3 = questionsTaxSkills(
            3,
            questionTextTax = "What is the primary purpose of completing an ITR12 form in South Africa?",
            R.drawable.logo,
            optionOneTax = "To register for VAT",
            optionTwoTax = "To report personal income and calculate tax liability",
            optionThreeTax = "To apply for a tax refund",
            correctAnswerTax = "To report personal income and calculate tax liability"

        )

        val taxQue4 = questionsTaxSkills(
            4,
            questionTextTax = "Which of the following is NOT a tax-deductible expense for a South African business?",
            R.drawable.logo,
            optionOneTax = "Employee salaries",
            optionTwoTax = "Entertainment expenses",
            optionThreeTax = "Office rent",
            correctAnswerTax = "Entertainment expenses"

        )

        val taxQue5 = questionsTaxSkills(
            5,
            questionTextTax = "In South Africa, what is the tax treatment of capital gains?",
            R.drawable.logo,
            optionOneTax = "Capital gains are exempt from taxation",
            optionTwoTax = "Capital gains are taxed at a flat rate of 10%",
            optionThreeTax = "Capital gains are subject to tax, but with certain exemptions and exclusions",
            correctAnswerTax = "Capital gains are subject to tax, but with certain exemptions and exclusions"

        )

        allQuestionsTax.add(taxQue1)
        allQuestionsTax.add(taxQue2)
        allQuestionsTax.add(taxQue3)
        allQuestionsTax.add(taxQue4)
        allQuestionsTax.add(taxQue5)

    }
}