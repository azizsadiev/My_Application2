package com.example.mysecondapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.ImageView
import android.widget.Switch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switcher = findViewById<Switch>(R.id.switch2)
        val imagetoedit = findViewById<ImageView>(R.id.imageView2)

        switcher.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                switcher.text = resources.getString(R.string.lightison)
                imagetoedit.setImageResource(R.drawable.bulbon)
            } else {
                switcher.text = resources.getString(R.string.lightisoff)
                imagetoedit.setImageResource(R.drawable.bulboff)
            }
        }
    }
}
