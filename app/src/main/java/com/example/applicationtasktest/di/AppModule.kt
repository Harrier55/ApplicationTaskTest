package com.example.applicationtasktest.di

import com.example.applicationtasktest.data.AdvertRepository
import com.example.applicationtasktest.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object AppModule {

    val mainModule = module {
        /** Репозиторий Акции для Главного экрана**/
        single { AdvertRepository() }

        viewModel { HomeViewModel(repository = get()) }
    }
}