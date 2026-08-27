package com.vu.nit3213sandboxapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Student(val name: String, val id: Int): Parcelable
