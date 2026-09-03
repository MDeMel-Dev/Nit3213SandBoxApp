package com.vu.nit3213sandboxapp.network.data

import com.vu.nit3213sandboxapp.network.services.PhoneExamplesApi
import com.vu.nit3213sandboxapp.network.utilities.RetrofitUtility

class PhoneDetailsRepository {

    private val retrofit = RetrofitUtility.createRetrofit("https://api.restful-api.dev/")
    private val phoneDetailsService = retrofit.create(PhoneExamplesApi::class.java)

    suspend fun getPhoneByID(id: String) = phoneDetailsService.getPhoneFromId(id = id)

    suspend fun getPhonesList() = phoneDetailsService.getListOfPhones()
}