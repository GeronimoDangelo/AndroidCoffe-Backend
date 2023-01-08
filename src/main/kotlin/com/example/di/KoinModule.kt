package com.example.di

import com.example.repository.*
import org.koin.dsl.module

val koinModule = module {
    single<BookRepository> {
        BookRepositoryImpl()
    }
    single<JetpackRepository> {
        JetpackRepositoryImpl()
    }

    single<XmlRepository> {
        XmlRepositoryImpl()
    }
}