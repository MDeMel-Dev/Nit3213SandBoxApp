package com.vu.nit3213sandboxapp.ui.sessionfour

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.vu.nit3213sandboxapp.R

class FirstScreenFragment: Fragment() {

    private lateinit var firstScreenFragmentViewModel : FirstScreenFragmentViewModel

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

        view.findViewById<TextView>(R.id.firstScreenFragmentTitle).text = firstScreenFragmentViewModel.screenTitle
    }
}