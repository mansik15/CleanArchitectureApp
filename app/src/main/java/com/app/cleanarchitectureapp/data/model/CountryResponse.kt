package com.app.cleanarchitectureapp.data.model

data class CountryResponse(
    val `data`: List<CountryData>,
    val error: Boolean,
    val msg: String
)

data class CountryData(
    val cities: List<String>,
    val country: String
)