package com.vu.nit3213sandboxapp.ui.sessionsix

import androidx.lifecycle.ViewModel
import com.vu.nit3213sandboxapp.network.data.Phone
import com.vu.nit3213sandboxapp.network.data.PhoneDetailsRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class RecyclerviewScreenViewModel : ViewModel() {
    private val phoneDetailsRepository = PhoneDetailsRepository()

    private val phoneListFlow: MutableStateFlow<List<Phone>> = MutableStateFlow(listOf())
    val phoneList: StateFlow<List<Phone>> = phoneListFlow

    suspend fun getPhoneListData() {
        val response = phoneDetailsRepository.getPhonesList()

        when {
            response.isSuccessful -> {
                response.body()?.let { phoneData ->
                    phoneListFlow.value = phoneData
                }
            }
            else -> {

            }
        }
    }
}