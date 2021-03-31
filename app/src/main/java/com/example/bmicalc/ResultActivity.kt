package com.example.bmicalc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_result.*
import kotlin.math.pow

class ResultActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
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

        textBmi.text = "BMI : $bmi"
        textResult.text = "결과는 $resultText 입니다"
    }
}