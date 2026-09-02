package com.vu.nit3213sandboxapp.network.utilities

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class RetrofitUtility {

    companion object {
        private val logging = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }

        private val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()

        private val client = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()

        fun createRetrofit(baseurl: String) =  Retrofit.Builder()
            .baseUrl(baseurl)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .client(client)
            .build()
    }
}