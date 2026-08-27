package com.vu.nit3213sandboxapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.vu.nit3213sandboxapp.R
import com.vu.nit3213sandboxapp.data.Student

class FirstScreenActivity : AppCompatActivity() {

    private lateinit var navigationButton: Button
    private val secondScreenIntent by lazy {
        Intent(this, SecondScreenActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)

        navigationButton = findViewById(R.id.navigate_second_screen_button)
    }

    override fun onResume() {
        super.onResume()

        navigationButton.setOnClickListener {
//            insertNameToIntent("Nit3123")
            insertStudentName(Student("Alex", 123) )
            startActivity(secondScreenIntent)
        }
    }

    fun insertNameToIntent(name: String) {
        secondScreenIntent.putExtra("name", name)
    }

    fun insertStudentName(student: Student) {
        secondScreenIntent.putExtra("studentKey", student)
    }
}