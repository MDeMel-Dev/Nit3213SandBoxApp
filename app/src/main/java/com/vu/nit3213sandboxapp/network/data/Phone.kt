package com.vu.nit3213sandboxapp.network.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Phone(
    @Json(name = "id") val id: String,
    @Json(name = "name") val name: String,
    @Json(name = "data") val data: Specs?
    )

@JsonClass(generateAdapter = true)
data class Specs(
    @Json(name = "color") val color: String?,
    @Json(name = "capacity") val capacity: String?,
    @Json(name = "price") val price: String?,
    @Json(name = "generation") val generation: String?
)
