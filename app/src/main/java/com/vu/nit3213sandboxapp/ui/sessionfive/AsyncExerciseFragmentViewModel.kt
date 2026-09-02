package com.vu.nit3213sandboxapp.ui.sessionfive

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class AsyncExerciseFragmentViewModel : ViewModel() {
    private val mutableLabelText: MutableStateFlow<String> = MutableStateFlow("Text Label")
    val labelText: StateFlow<String> = mutableLabelText

    fun updateTextWithDelay() {
        viewModelScope.launch {
            delay(5000) // mocking the delay of an api call
            mutableLabelText.value = "Hello Class!"
        }
    }
}