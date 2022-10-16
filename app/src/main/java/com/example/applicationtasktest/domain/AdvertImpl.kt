package com.example.applicationtasktest.domain

interface AdvertImpl {
    fun createListAdvertEntity(advertEntity: AdvertEntity)
    fun getListAdvertEntity(): List<AdvertEntity>

}