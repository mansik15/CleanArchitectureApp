package com.app.cleanarchitectureapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.cleanarchitectureapp.data.model.CountryResponse
import com.app.cleanarchitectureapp.domain.GetCountriesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(countriesUseCase: GetCountriesUseCase) : ViewModel() {

    private val _countries = MutableLiveData<CountryResponse>()
    val countries: LiveData<CountryResponse> = _countries

    init {
        viewModelScope.launch {
            _countries.value = countriesUseCase()
        }

    }
}