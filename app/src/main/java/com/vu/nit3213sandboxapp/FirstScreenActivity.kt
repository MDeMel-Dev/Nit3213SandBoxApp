package com.vu.nit3213sandboxapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FirstScreenActivity : AppCompatActivity() {

    private lateinit var navigationButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)

        navigationButton = findViewById(R.id.navigate_second_screen_button)
    }

    override fun onResume() {
        super.onResume()

        navigationButton.setOnClickListener {
            Log.d("Testlfc", "Button click")
        }
    }
}