package com.app.cleanarchitectureapp.data

import com.app.cleanarchitectureapp.network.ApiService
import javax.inject.Inject

class CountriesRepository @Inject constructor(val apiService: ApiService) {

    suspend fun getCountries() = apiService.getCountries()

}