package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse(
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val books: List<Book> = emptyList(),
    val jetpacks: List<Jetpack> = emptyList(),
    val xml: List<Xml> = emptyList(),
    val lastUpdated: Long? = null
)