package com.app.cleanarchitectureapp.data.model

data class CountryResponse(
    val `data`: List<Data>,
    val error: Boolean,
    val msg: String
)

data class Data(
    val cities: List<String>,
    val country: String
)