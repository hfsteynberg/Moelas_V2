package models

data class questionsTaxSkills(
    val id: Int,
    val questionText: String,
    val icon: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val correctAnswer: String
)
