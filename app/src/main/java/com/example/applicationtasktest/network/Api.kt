package com.example.applicationtasktest.network

import com.example.example.Anime
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

//  https://kitsu.io/api/edge/anime

interface Api {

    @GET("edge/anime")
    suspend fun getAnimeList():Response<Anime>

//    @GET("edge/anime")
//    fun getAnimeList():Call<Anime>
}