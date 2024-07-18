package com.app.cleanarchitectureapp.domain.usecases

import com.app.cleanarchitectureapp.data.CountriesRepository
import com.app.cleanarchitectureapp.data.model.CountryResponse
import com.app.cleanarchitectureapp.domain.entity.CountryDomainModel
import javax.inject.Inject

class GetCountriesUseCase @Inject constructor(private val repository: CountriesRepository) {

    suspend operator fun invoke(): CountryDomainModel {
        return repository.getCountries().toDomain()
    }

    // converting CountryResponse to CountryDomainModel
    // It will map CountryData class in CountryResponse to countryList in domain model & fetch string of country name
    fun CountryResponse.toDomain(): CountryDomainModel {
        return CountryDomainModel(countryList = data.map {
            it.country
        })
    }
}