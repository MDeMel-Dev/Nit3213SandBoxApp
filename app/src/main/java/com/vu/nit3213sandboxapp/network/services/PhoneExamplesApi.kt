package com.vu.nit3213sandboxapp.network.services

import com.vu.nit3213sandboxapp.network.data.Phone
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PhoneExamplesApi {

    @GET("/objects/{id}")
    suspend fun getPhoneFromId(@Path("id") id: String): Response<Phone>

    @GET("/objects")
    suspend fun getListOfPhones(): Response<List<Phone>>
}