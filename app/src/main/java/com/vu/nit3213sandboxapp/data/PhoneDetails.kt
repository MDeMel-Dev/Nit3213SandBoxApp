package com.vu.nit3213sandboxapp.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PhoneDetails(val name: String, val data: String): Parcelable
