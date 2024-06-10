package com.example.practicumweatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonContinue = findViewById<Button>(R.id.button_continue)
        val buttonExit = findViewById<Button>(R.id.button_exit)

        // Set click listeners
        buttonContinue.setOnClickListener {
            val intent = Intent(this@MainActivity, HomeScreen::class.java)
            startActivity(intent)
        }

        buttonExit.setOnClickListener {
            finish() // Close the current activity
            exitProcess(0) // Terminate the app completely
        }
    }
}
