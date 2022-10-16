package com.example.applicationtasktest.data

import com.example.applicationtasktest.R
import com.example.applicationtasktest.domain.AdvertEntity
import com.example.applicationtasktest.domain.AdvertImpl

class AdvertRepository: AdvertImpl {
    private val listAdvertEntity = mutableListOf<AdvertEntity>()

    override fun createListAdvertEntity(advertEntity: AdvertEntity) {
        for (i in 1..5){
            listAdvertEntity.add(AdvertEntity(i, R.drawable.foto_free))
        }
    }

    override fun getListAdvertEntity(): List<AdvertEntity> {
        // todo Делаем моковый список
        return listAdvertEntity
    }

}