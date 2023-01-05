package com.example.plugins

import com.example.routes.getAllBooks
import com.example.routes.root
import com.example.routes.searchBooks
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        root()
        getAllBooks()
        searchBooks()

        static("/images") {
            resources("images")
        }
    }
}
