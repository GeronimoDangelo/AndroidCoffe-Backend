package com.example.routes

import com.example.repository.BookRepository
import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchBooks() {
    val bookRepository: BookRepository by inject()

    get("/book/learn/search") {
        val name = call.request.queryParameters["name"]

        val apiResponse = bookRepository.searchBooks(name = name)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}