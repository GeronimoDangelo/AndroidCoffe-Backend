package com.example.di

import com.example.repository.BookRepository
import com.example.repository.BookRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<BookRepository> {
        BookRepositoryImpl()
    }
}