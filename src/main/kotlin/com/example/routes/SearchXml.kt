package com.example.routes

import com.example.repository.XmlRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchXml(){

    val xmlRepository : XmlRepository by inject()

    get("/book/xml/search") {
        val name = call.request.queryParameters["name"]

        val apiResponse = xmlRepository.searchXml(name = name)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}