package com.app.cleanarchitectureapp.data.remote

import com.app.cleanarchitectureapp.data.model.CountryResponse
import com.app.cleanarchitectureapp.data.Constants.COUNTY_ENDPOINT
import retrofit2.http.GET

interface ApiService {
    @GET(COUNTY_ENDPOINT)
    suspend fun getCountries(): CountryResponse
}