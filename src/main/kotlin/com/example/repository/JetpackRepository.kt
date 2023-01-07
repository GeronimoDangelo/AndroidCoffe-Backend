package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Jetpack

interface JetpackRepository {

    val jetpacks: Map<Int, List<Jetpack>>

    val page1: List<Jetpack>
    val page2: List<Jetpack>
    val page3: List<Jetpack>


    suspend fun getAllJetpacks(page: Int = 1): ApiResponse
    suspend fun searchJetpack(name: String?): ApiResponse


}