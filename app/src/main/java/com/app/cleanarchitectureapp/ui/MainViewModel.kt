package com.app.cleanarchitectureapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.cleanarchitectureapp.domain.GetCountriesUseCase
import com.app.cleanarchitectureapp.domain.model.CountryDomainModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(countriesUseCase: GetCountriesUseCase) : ViewModel() {

    private val _countries = MutableLiveData<CountryDomainModel>()
    val countries: LiveData<CountryDomainModel> = _countries

    init {
        viewModelScope.launch {
            _countries.value = countriesUseCase()
        }

    }
}