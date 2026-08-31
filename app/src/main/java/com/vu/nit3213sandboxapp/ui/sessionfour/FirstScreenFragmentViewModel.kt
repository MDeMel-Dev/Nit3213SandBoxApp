package com.vu.nit3213sandboxapp.ui.sessionfour

import androidx.lifecycle.ViewModel
import com.vu.nit3213sandboxapp.data.ClassDetails

class FirstScreenFragmentViewModel: ViewModel() {
    val screenTitle = "First Fragment Screen"

    var className = ""
    var classNumber = ""

    fun getClassDetails(): ClassDetails {
        if (className.isNotEmpty() && classNumber.isNotEmpty()) {
            return ClassDetails(name = className, number = classNumber)
        } else throw Exception()
    }
}