package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Book(
    val id: Int,
    val name: String,
    val image: String,
    val about: String,
    val rating: Double,
    val level: String,
    val timeToLearn: String,
    val tags: List<String>,
    )
