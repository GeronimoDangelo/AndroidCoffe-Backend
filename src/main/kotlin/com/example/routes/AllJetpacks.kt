package com.example.routes

import com.example.models.ApiResponse
import com.example.repository.JetpackRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllJetpacks() {

    val jetpackRepository: JetpackRepository by inject()

    get("/book/jetpacks") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            println("NEW PAGE: $page")
            require(page in 1..3)

            val apiResponse = jetpackRepository.getAllJetpacks(page = page)
            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )
        } catch (e: NumberFormatException) {
            call.respond(
                message = ApiResponse(success = false, message = "Only Numbers Allowed."),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {
            call.respond(
                message = ApiResponse(success = false, message = "Heroes not Found."),
                status = HttpStatusCode.NotFound
            )
        }
    }
}