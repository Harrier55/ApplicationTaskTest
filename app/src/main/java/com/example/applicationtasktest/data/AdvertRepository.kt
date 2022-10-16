package com.example.applicationtasktest.data

import com.example.applicationtasktest.R
import com.example.applicationtasktest.domain.AdvertEntity
import com.example.applicationtasktest.domain.AdvertImpl

class AdvertRepository: AdvertImpl {
    private val listAdvertEntity = mutableListOf<AdvertEntity>()

    override fun createListAdvertEntity() {
        for (i in 1..7){
            listAdvertEntity.add(AdvertEntity(i, R.drawable.foto_free))
        }
    }

    override fun getListAdvertEntity(): List<AdvertEntity> {
        // todo Делаем моковый список
        createListAdvertEntity()
        return listAdvertEntity
    }

}