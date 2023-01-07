package com.example.di

import com.example.repository.BookRepository
import com.example.repository.BookRepositoryImpl
import com.example.repository.JetpackRepository
import com.example.repository.JetpackRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<BookRepository> {
        BookRepositoryImpl()
    }
    single<JetpackRepository> {
        JetpackRepositoryImpl()
    }
}