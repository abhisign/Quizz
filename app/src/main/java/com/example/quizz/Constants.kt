package com.example.quizz

import android.text.LoginFilter.UsernameFilterGMail

object Constants {

    const val userName: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions(): ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val ques1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.argentina,"Italy", "Argentina",
            "Mexico", "Norway",
            2
        )
        questionsList.add(ques1)

        val ques2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.australia,"Iran", "Argentina",
            "Australia", "North America",
            3
        )
        questionsList.add(ques2)

        val ques3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.begium,"Belgium", "Afganistan",
            "Africa", "Budapest",
            1
        )
        questionsList.add(ques3)

        val ques4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.india,"India", "Afganistan",
            "Iran", "Russia",
            1
        )
        questionsList.add(ques4)

        val ques5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.france,"Japan", "Argentina",
            "Mexico", "France",
            2
        )
        questionsList.add(ques5)

        val ques6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.italy,"Italy", "Bangladesh",
            "Sweden", "China",
            1
        )
        questionsList.add(ques6)

        val ques7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.mexico,"Italy", "Mexico",
            "India", "Shankulia",
            2
        )
        questionsList.add(ques7)

        val ques8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.uk,"Italy", "Antarctica",
            "Mexico", "UK",
            4
        )
        questionsList.add(ques8)

        val ques9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.norway,"Belgium", "Argentina",
            "Mexico", "Norway",
            4
        )
        questionsList.add(ques9)

        return questionsList
    }

}