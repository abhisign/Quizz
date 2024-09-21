package com.example.quizz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btn_Start)
        val etName : EditText = findViewById(R.id.et_Name)

        btnStart.setOnClickListener{

            if (etName.text.isEmpty()){
                Toast.makeText(this,
                    "Please enter name", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, QuizzQuestionsActivity :: class.java)
                intent.putExtra(Constants.userName, etName.text.toString())
                startActivity(intent)
                finish()

            }

        }

    }
}