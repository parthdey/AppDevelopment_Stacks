package com.example.day_12fullyfunctionalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class Second_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        val btnIntent1 = findViewById<Button>(R.id.button1)
        val btnIntent2 = findViewById<Button>(R.id.button2)
        val btnIntent3 = findViewById<Button>(R.id.button3)
        val btnIntent4 = findViewById<Button>(R.id.button4)
        val btnIntent5 = findViewById<Button>(R.id.button5)

        btnIntent1.setOnClickListener {
            intent = Intent(applicationContext, Kotlin_Screen::class.java)
            startActivity(intent)
        }
        btnIntent2.setOnClickListener {
            intent = Intent(applicationContext, Flutter_Screen::class.java)
            startActivity(intent)
        }
        btnIntent3.setOnClickListener {
            intent = Intent(applicationContext, Java_Screen::class.java)
            startActivity(intent)
        }
        btnIntent4.setOnClickListener {
            intent = Intent(applicationContext, ReactNative_Screen::class.java)
            startActivity(intent)
        }
        btnIntent5.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            startActivity(intent)
        }
    }
}