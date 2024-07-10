package com.app.cleanarchitectureapp.domain

import com.app.cleanarchitectureapp.data.CountriesRepository
import com.app.cleanarchitectureapp.data.model.CountryResponse
import javax.inject.Inject

class GetCountriesUseCase @Inject constructor(private val repository: CountriesRepository) {

    suspend operator fun invoke(): CountryResponse {
        return repository.getCountries()
    }

}