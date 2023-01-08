package com.example.plugins

import com.example.routes.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        root()
        getAllBooks()
        searchBooks()
        getAllJetpacks()
        searchJetpack()
        getAllXmls()
        searchXml()

        static("/images") {
            resources("images")
        }
    }
}
