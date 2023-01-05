package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Book

interface BookRepository {

    val books: Map<Int, List<Book>>

    val page1: List<Book>
    val page2: List<Book>
    val page3: List<Book>


    suspend fun getAllBooks(page: Int = 1): ApiResponse
    suspend fun searchBooks(name: String?): ApiResponse

}