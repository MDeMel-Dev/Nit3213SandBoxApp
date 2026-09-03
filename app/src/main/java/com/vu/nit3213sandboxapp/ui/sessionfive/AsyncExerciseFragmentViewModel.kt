package com.vu.nit3213sandboxapp.ui.sessionfive

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vu.nit3213sandboxapp.network.data.PhoneDetailsRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class AsyncExerciseFragmentViewModel : ViewModel() {
    private val mutableLabelText: MutableStateFlow<String> = MutableStateFlow("Text Label")
    val labelText: StateFlow<String> = mutableLabelText

    private val phoneDetailsRepository = PhoneDetailsRepository()

    fun updateTextWithDelay() {
        getPhone("7")
    }

    private fun getPhone(id: String) {
        viewModelScope.launch {
            val result = phoneDetailsRepository.getPhoneByID(id)
            if (result.isSuccessful) {
                mutableLabelText.value = result.body().toString()
            }
        }
    }

    private fun getListOfPhones() {
        viewModelScope.launch {
            val result = phoneDetailsRepository.getPhonesList()
            if (result.isSuccessful) {
                mutableLabelText.value = result.body().toString()
            }
        }
    }
}