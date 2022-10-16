package com.example.applicationtasktest.domain

import com.example.example.Anime
import retrofit2.Response

interface AnimeItemImpl {
    fun createAnimeItem(item: AnimeEntity)
    suspend fun getListAnimeItem(): List<AnimeEntity>
    suspend fun loadData()
    fun mappingData(responseAnime: Anime)
}