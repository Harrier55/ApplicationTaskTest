package com.example.applicationtasktest.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.applicationtasktest.data.AdvertRepository
import com.example.applicationtasktest.domain.AdvertEntity

class HomeViewModel(private val repository: AdvertRepository) : ViewModel() {

     val listAdvertEntity = MutableLiveData<List<AdvertEntity>>().apply {
        value = repository.getListAdvertEntity()
    }

}