package com.vu.nit3213sandboxapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.vu.nit3213sandboxapp.R
import com.vu.nit3213sandboxapp.ui.sessionfive.AsyncExerciseActivity
import com.vu.nit3213sandboxapp.ui.sessionfour.FragmentHostActivity
import com.vu.nit3213sandboxapp.ui.sessionone.FirstScreenActivity
import com.vu.nit3213sandboxapp.ui.sessionsix.RecyclerviewScreenActivity
import com.vu.nit3213sandboxapp.ui.sessiontwo.ConstraintLayoutExerciseActivity

class HomeScreenActivity : AppCompatActivity() {

    private lateinit var sessionOneNavigationButton: Button
    private lateinit var sessionTwoNavigationButton: Button
    private lateinit var sessionThreeNavigationButton: Button
    private lateinit var sessionFiveNavigationButton: Button
    private lateinit var sessionSixNavigationButton: Button

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
        sessionThreeNavigationButton = findViewById(R.id.s3FragmentsNavigationButton)
        sessionFiveNavigationButton = findViewById(R.id.s5FragmentsNavigationButton)
        sessionSixNavigationButton = findViewById(R.id.s6FragmentsNavigationButton)
    }

    fun setListeners() {
        sessionOneNavigationButton.setOnClickListener {
            startActivity((Intent(this, FirstScreenActivity::class.java)))
        }

        sessionTwoNavigationButton.setOnClickListener {
            startActivity((Intent(this, ConstraintLayoutExerciseActivity::class.java)))
        }

        sessionThreeNavigationButton.setOnClickListener {
            startActivity((Intent(this, FragmentHostActivity::class.java)))
        }

        sessionFiveNavigationButton.setOnClickListener {
            startActivity((Intent(this, AsyncExerciseActivity::class.java)))
        }

        sessionSixNavigationButton.setOnClickListener {
            startActivity((Intent(this, RecyclerviewScreenActivity::class.java)))
        }
    }
}