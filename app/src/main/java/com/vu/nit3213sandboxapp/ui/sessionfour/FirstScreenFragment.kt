package com.vu.nit3213sandboxapp.ui.sessionfour

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.vu.nit3213sandboxapp.R

class FirstScreenFragment: Fragment() {

    private lateinit var firstScreenFragmentViewModel : FirstScreenFragmentViewModel
    private lateinit var screenBNavigationButton: Button
    private lateinit var classNameTextField : EditText
    private lateinit var classNumberTextField: EditText

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

        findViewElements(view)

        view.findViewById<TextView>(R.id.firstScreenFragmentTitle).text = firstScreenFragmentViewModel.screenTitle
        setOnClickListeners()
    }

    private fun findViewElements(view: View) {
        screenBNavigationButton = view.findViewById(R.id.screenBNavigationButton)
        classNameTextField = view.findViewById(R.id.classNameField)
        classNumberTextField = view.findViewById(R.id.classNumberField)
    }

    private fun setOnClickListeners() {
        screenBNavigationButton.setOnClickListener {
            try {
                val classDetails = firstScreenFragmentViewModel.getClassDetails()
                val navigationAction = FirstScreenFragmentDirections.actionFirstScreenFragmentToScreenBFragment(classDetails)
                findNavController().navigate(navigationAction)
            } catch(e: Exception)  {

            }
        }

        classNameTextField.doAfterTextChanged { text ->
            firstScreenFragmentViewModel.className = text.toString()
        }

        classNumberTextField.doAfterTextChanged { text ->
            firstScreenFragmentViewModel.classNumber = text.toString()
        }
    }
}