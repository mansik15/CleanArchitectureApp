package com.app.cleanarchitectureapp.domain

import com.app.cleanarchitectureapp.data.CountriesRepository
import com.app.cleanarchitectureapp.data.model.CountryResponse
import com.app.cleanarchitectureapp.domain.model.CountryDomainModel
import javax.inject.Inject

class GetCountriesUseCase @Inject constructor(private val repository: CountriesRepository) {

    suspend operator fun invoke(): CountryDomainModel {
        return repository.getCountries().toDomain()
    }

    fun CountryResponse.toDomain(): CountryDomainModel {
        return CountryDomainModel(countryList = data.map {
            it.country
        })
    }
}