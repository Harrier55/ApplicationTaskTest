package com.example.applicationtasktest.di

import com.example.applicationtasktest.data.AdvertRepository
import com.example.applicationtasktest.data.AnimeRepository
import com.example.applicationtasktest.network.Api
import com.example.applicationtasktest.ui.home.HomeViewModel
import com.example.applicationtasktest.util.AppConstants
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

object AppModule {

    val mainModule = module {
        /** Репозиторий Акции для Главного экрана**/
        single { AdvertRepository() }

        /** Репозиторий Аниме **/
        single { AnimeRepository(apiService = get()) }

        viewModel { HomeViewModel(advertRepository = get(), animeRepository = get()) }
    }

    val apiModule = module {
        /** Клиент Retrofit сразу с интерфейсом */
        single {
            Retrofit.Builder()
                .baseUrl(AppConstants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(Api::class.java)
        }

    }
}