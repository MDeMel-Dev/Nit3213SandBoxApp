package com.vu.nit3213sandboxapp.ui.sessionfour

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.vu.nit3213sandboxapp.R
import com.vu.nit3213sandboxapp.data.ClassDetails

class ScreenBFragment : Fragment() {

    private val args : ScreenBFragmentArgs by navArgs()
    private lateinit var screenCNavigationButton: Button
    private lateinit var screenText: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        screenCNavigationButton = view.findViewById<Button>(R.id.screenCNavigationButton)
        screenText = view.findViewById(R.id.screenBText)
        setClassDetails()

        setOnclickListeners()
    }

    private fun setOnclickListeners() {
        screenCNavigationButton.setOnClickListener {
            findNavController().navigate(R.id.action_screenBFragment_to_screenCFragment)
        }
    }

    private fun setClassDetails() {
        screenText.text = args.classDetails.toString()
    }
}