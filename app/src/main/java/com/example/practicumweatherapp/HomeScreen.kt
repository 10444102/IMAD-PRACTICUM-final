package com.example.practicumweatherapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView

class HomeScreen : AppCompatActivity() {
    private val daysOfWeek = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    private val maxTemperatures = arrayOf(28, 26, 21, 31, 27, 28, 41)
    private val minTemperatures = arrayOf(19, 18, 15, 25, 21, 20, 29)
    private var currentDayIndex = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)
   //set button clickers
        findViewById<Button>(R.id.button_next2).setOnClickListener {
            currentDayIndex = (currentDayIndex + 1) % daysOfWeek.size
            updateTemperatureDisplay()
        }

        findViewById<Button>(R.id.button_exit2).setOnClickListener {
            finish()
        }

        findViewById<Button>(R.id.button_more_details).setOnClickListener {
            val intent = Intent(this@HomeScreen, MoreDetails::class.java)
            startActivity(intent)
        }

        updateTemperatureDisplay()
    }

    private fun updateTemperatureDisplay() {
        val textView = findViewById<TextView>(R.id.textView3)
        textView.text = "${daysOfWeek[currentDayIndex]} max ${maxTemperatures[currentDayIndex]}°C min ${minTemperatures[currentDayIndex]}°C"
    }
}