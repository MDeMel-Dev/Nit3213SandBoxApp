package com.vu.nit3213sandboxapp.ui.sessionfour

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.vu.nit3213sandboxapp.R

class FirstScreenFragment: Fragment() {

    private lateinit var firstScreenFragmentViewModel : FirstScreenFragmentViewModel
    private lateinit var screenBNavigationButton: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState:
    Bundle?): View? {
        firstScreenFragmentViewModel = FirstScreenFragmentViewModel()

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Initialize views and set up fragment logic here
        // val button = view.findViewById<Button>(R.id.button)

        screenBNavigationButton = view.findViewById<Button>(R.id.screenBNavigationButton)

        view.findViewById<TextView>(R.id.firstScreenFragmentTitle).text = firstScreenFragmentViewModel.screenTitle
        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        screenBNavigationButton.setOnClickListener {
            findNavController().navigate(R.id.action_firstScreenFragment_to_screenBFragment)
        }
    }
}