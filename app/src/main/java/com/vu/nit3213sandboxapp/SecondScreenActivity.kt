package com.vu.nit3213sandboxapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondScreenActivity : AppCompatActivity() {

    private lateinit var greetingText: TextView
    private val launchIntent = intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        greetingText = findViewById(R.id.greeting_text)
    }

    override fun onResume() {
        super.onResume()

        val sharedName = launchIntent.getStringExtra("name")
        greetingText.text = getString(R.string.welcome_this_is_the_second_screen, sharedName)
    }
}