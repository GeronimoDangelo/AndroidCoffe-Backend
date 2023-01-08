package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Xml

interface XmlRepository {
    val xmls: Map<Int, List<Xml>>

    val page1: List<Xml>
    val page2: List<Xml>
    val page3: List<Xml>

    suspend fun getAllXmls(page: Int = 1): ApiResponse
    suspend fun searchXml(name: String?): ApiResponse

}