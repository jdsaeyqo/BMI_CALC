package com.example.bmicalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val heightEditText : EditText = findViewById(R.id.heightEditText)
        val weightEditText  = findViewById<EditText>(R.id.weightEditText)
        val resultButton = findViewById<Button>(R.id.resultButton)

        resultButton.setOnClickListener {



            if(heightEditText.text.isEmpty() || weightEditText.text.isEmpty()){
                Toast.makeText(this, "값을 채워주세요!",Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            }
                val height = heightEditText.text.toString().toDouble()
                val weight = weightEditText.text.toString().toDouble()


                val intent = Intent(this,ResultActivity::class.java)

                intent.putExtra("height", height)
                intent.putExtra("weight", weight)
                startActivity(intent)



        }


    }
}