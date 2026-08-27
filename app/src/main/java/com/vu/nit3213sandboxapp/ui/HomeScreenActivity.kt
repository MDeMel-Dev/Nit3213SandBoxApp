package com.vu.nit3213sandboxapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.vu.nit3213sandboxapp.R
import com.vu.nit3213sandboxapp.ui.sessionone.FirstScreenActivity

class HomeScreenActivity : AppCompatActivity() {

    private lateinit var sessionOneNavigationButton: Button
    private lateinit var sessionTwoNavigationButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        getViewReferences()
        setListeners()
    }

    fun getViewReferences() {
        sessionOneNavigationButton = findViewById(R.id.s1NavigationButton)
        sessionTwoNavigationButton = findViewById(R.id.s2NavigationButton)
    }

    fun setListeners() {
        sessionOneNavigationButton.setOnClickListener {
            startActivity((Intent(this, FirstScreenActivity::class.java)))
        }
    }
}