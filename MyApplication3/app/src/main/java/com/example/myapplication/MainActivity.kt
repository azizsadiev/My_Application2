package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switcher = findViewById<Switch>(R.id.switch1)
        val imageView = findViewById<ImageView>(R.id.image1)

        switcher.setOnCheckedChangeListener { buttonView, isChecked ->

            if (isChecked) {
                imageView.visibility = View.VISIBLE
                imageView.setImageResource(R.drawable.b53355)
            } else {
                imageView.visibility = View.INVISIBLE
            }
        }
    }
}
//        switcher.setVisibility(imageView.INVISIBLE);
//        switcher.setVisibility(imageView.VISIBLE);