package com.vu.nit3213sandboxapp.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.vu.nit3213sandboxapp.R
import com.vu.nit3213sandboxapp.data.Student

class SecondScreenActivity : AppCompatActivity() {

    private lateinit var greetingText: TextView
    private val launchIntent by lazy {
        intent
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        greetingText = findViewById(R.id.greeting_text)
    }

    override fun onResume() {
        super.onResume()

//        val sharedName = launchIntent.getStringExtra("name") // get a basic data type
        val sharedName = launchIntent.getParcelableExtra<Student>("studentKey") // get a complex data type
        greetingText.text = getString(R.string.welcome_this_is_the_second_screen, sharedName)
    }
}