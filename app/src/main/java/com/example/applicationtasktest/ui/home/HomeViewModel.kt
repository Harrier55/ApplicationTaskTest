package com.example.applicationtasktest.ui.home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.applicationtasktest.data.AdvertRepository
import com.example.applicationtasktest.data.AnimeRepository
import com.example.applicationtasktest.domain.AdvertEntity
import com.example.applicationtasktest.domain.AnimeEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class HomeViewModel(
    private val advertRepository: AdvertRepository,
    private val animeRepository: AnimeRepository
) : ViewModel() {

    private var job: Job? = null

//    init {
//        animeRepository.getListAnimeItem()
//    }

    val listAnimeEntity = MutableLiveData<List<AnimeEntity>>().apply {
            job = viewModelScope.launch(Dispatchers.IO) {
                try {
                    val list = animeRepository.getListAnimeItem()
                    postValue(list)
                    Log.d("@@@", ": ${list.toString()}")
                }catch (e:Exception){
                    Log.d("@@@", "MainFragmentHomeViewModel_getData: $e")
                }
            }


    }

    val listAdvertEntity = MutableLiveData<List<AdvertEntity>>().apply {
        value = advertRepository.getListAdvertEntity()
    }

}