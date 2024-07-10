package com.app.cleanarchitectureapp.network

import com.app.cleanarchitectureapp.data.model.CountryResponse
import com.app.cleanarchitectureapp.network.Constants.COUNTY_ENDPOINT
import retrofit2.http.GET

interface ApiService {
    @GET(COUNTY_ENDPOINT)
    suspend fun getCountries(): CountryResponse
}