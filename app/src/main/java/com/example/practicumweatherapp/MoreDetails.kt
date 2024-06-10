package com.example.practicumweatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoreDetails : AppCompatActivity() {

}
    class DetailActivity : AppCompatActivity() {
        private lateinit var dayTextView: TextView
        private lateinit var weatherTextView: TextView
        private lateinit var chanceOfRainTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more_details)
        dayTextView = findViewById(R.id.MoredetailsDay)
        weatherTextView = findViewById(R.id.MoreDetailsConditions)
        chanceOfRainTextView = findViewById(R.id.MoreDetailsRain)

        // Initialize UI with data for Monday
        updateUI(0) // 0 corresponds to Monday
    }

        private fun updateUI(dayIndex: Int) {
            val (day, weatherInfo) = daysInfo[dayIndex]
            val (weather, chanceOfRain) = weatherInfo

            dayTextView.text = day
            weatherTextView.text = weather
            chanceOfRainTextView.text = chanceOfRain
        }

        // Array containing information for each day
        private val daysInfo = arrayOf(
            Pair("Monday", Pair("Sunny", "Low")),
            Pair("Tuesday", Pair("Sunny", "Low")),
            Pair("Wednesday", Pair("Partly Cloudy", "Low")),
            Pair("Thursday", Pair("Heavily Clouded", "Medium")),
            Pair("Friday", Pair("Sunny", "Low")),
            Pair("Saturday", Pair("Cloudy", "Medium")),
            Pair("Sunday", Pair("Sunny", "Low"))
        )
    }
