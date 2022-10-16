package com.example.applicationtasktest.data

import android.util.Log
import com.example.applicationtasktest.domain.AnimeEntity
import com.example.applicationtasktest.domain.AnimeItemImpl
import com.example.applicationtasktest.network.Api
import com.example.example.Anime
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AnimeRepository(private val apiService: Api) : AnimeItemImpl {

    private val listAnimeEntity = mutableListOf<AnimeEntity>()

    override fun createAnimeItem(item: AnimeEntity) {
        listAnimeEntity.add(item)
    }

    override suspend fun getListAnimeItem(): List<AnimeEntity> {
        loadData()
        return listAnimeEntity
    }

    override suspend fun loadData() {

        try {
            withContext(Dispatchers.IO) {
                val response = apiService.getAnimeList()
                if (response.code() == 200 && response.isSuccessful) {
                    response.body()?.let {
                        mappingData(it)
                    }
                }
            }

        } catch (e: Exception) {
            Log.d("@@@", "onFailure: $e")
        }
    }

    override fun mappingData(responseAnime: Anime) {
        responseAnime.data.forEach {
            val description = it.attributes?.description
            val imageAnime = it.attributes?.coverImage?.small
            createAnimeItem(AnimeEntity(description, imageAnime))
        }

    }
}