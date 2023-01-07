package com.example.routes

import com.example.repository.JetpackRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchJetpack(){
    val jetpackRepository: JetpackRepository by inject()
    get("/book/jetpacks/search") {
        val name = call.request.queryParameters["name"]

        val apiResponse = jetpackRepository.searchJetpack(name = name)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}