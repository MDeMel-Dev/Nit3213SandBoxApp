package com.vu.nit3213sandboxapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ClassDetails(val name: String, val number: String): Parcelable
