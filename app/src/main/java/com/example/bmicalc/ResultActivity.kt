package com.example.bmicalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.math.pow

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val height = intent.getDoubleExtra("height",0.0)
        val weight = intent.getDoubleExtra("weight",0.0)


        val bmi = weight / (height / 100.0).pow(2.0)
        val resultText =
            when{

                bmi >= 35.0 -> "고도 비만"
                bmi >= 30.0 -> "중정도 비만"
                bmi >= 25.0 -> "경도 비만"
                bmi >= 23.0 -> "과체중"
                bmi >= 18.5 -> "정상체중"
                else -> "저체중"
        }

        val bmitxt = findViewById<TextView>(R.id.bmiText)
        val resulttxt = findViewById<TextView>(R.id.resultText)

        bmitxt.text = bmi.toString()
        resulttxt.text = resultText





    }
}