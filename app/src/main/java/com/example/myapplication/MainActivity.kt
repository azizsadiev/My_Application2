package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val personNameEditText = findViewById<EditText>(R.id.text1)
        val passwordEditText = findViewById<EditText>(R.id.text2)
        val submitButton = findViewById<Button>(R.id.button)
        val resultText = findViewById<TextView>(R.id.textView)

        submitButton.setOnClickListener {
            val result = personNameEditText.text.toString() + passwordEditText.text.toString()
            resultText.text = result
            println("button clicked")
        }
    }
}
