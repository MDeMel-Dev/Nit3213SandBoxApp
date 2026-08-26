package com.vu.nit3213sandboxapp

import android.app.Application
import android.util.Log

class SandBoxApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d("Testlfc", "Application class initialised: ")
    }

}