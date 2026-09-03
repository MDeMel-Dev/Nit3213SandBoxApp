package com.vu.nit3213sandboxapp.ui.sessionsix

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.vu.nit3213sandboxapp.R
import com.vu.nit3213sandboxapp.data.PhoneDetails

class PhoneDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_phone_details)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onResume() {
        super.onResume()

        findViewById<TextView>(R.id.phoneDetailScreenTitle).text = intent.getParcelableExtra<PhoneDetails>("phoneDetails")?.name
        findViewById<TextView>(R.id.phoneDetailText).text = intent.getParcelableExtra<PhoneDetails>("phoneDetails")?.data
    }
}