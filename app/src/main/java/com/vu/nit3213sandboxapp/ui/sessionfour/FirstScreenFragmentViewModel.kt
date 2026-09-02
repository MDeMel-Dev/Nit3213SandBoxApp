package com.vu.nit3213sandboxapp.ui.sessionfour

import android.R.attr.name
import androidx.lifecycle.ViewModel
import com.vu.nit3213sandboxapp.data.ClassDetails

class FirstScreenFragmentViewModel: ViewModel() {
    val screenTitle = "First Fragment Screen"

    var className = ""
    var classNumber = ""

    fun getClassDetails(): Result<ClassDetails> {
        return if (className.isNotEmpty() && classNumber.isNotEmpty()) {
             Result.success(ClassDetails(name = className, number = classNumber))
        } else Result.failure(exception = Exception())
    }
}