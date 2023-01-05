package com.example

import com.example.models.ApiResponse
import com.example.repository.BookRepositoryImpl
import com.example.repository.NEXT_PAGE_KEY
import com.example.repository.PREVIOUS_PAGE_KEY
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest2 {

    @Test
    fun `access root endpoint, assert correct information`() =
        testApplication {
            val response = client.get("/")
            assertEquals(
                expected = HttpStatusCode.OK,
                actual = response.status
            )
            assertEquals(
                expected = "Welcome to My Android Book API!",
                actual = response.bodyAsText()
            )
        }

    @ExperimentalSerializationApi
    @Test
    fun `access all heroes endpoint, query all pages, assert correct information`() =
        testApplication {
            val heroRepository = BookRepositoryImpl()
            val pages = 1..3
            val heroes = listOf(
                heroRepository.page1,
                heroRepository.page2,
                heroRepository.page3,
            )
            pages.forEach { page ->
                val response = client.get("/book/learn?page=$page")
                assertEquals(
                    expected = HttpStatusCode.OK,
                    actual = response.status
                )
                val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText())
                val expected = ApiResponse(
                    success = true,
                    message = "ok",
                    prevPage = calculatePage(page = page)["prevPage"],
                    nextPage = calculatePage(page = page)["nextPage"],
                    books = heroes[page - 1],
                    lastUpdated = actual.lastUpdated
                )
                assertEquals(
                    expected = expected,
                    actual = actual
                )
            }
        }

    @ExperimentalSerializationApi
    @Test
    fun `access all heroes endpoint, query non existing page number, assert error`() =
        testApplication {
            val response = client.get("/book/learn?page=6")
            assertEquals(
                expected = HttpStatusCode.NotFound,
                actual = response.status
            )
            assertEquals(
                expected = "Page not Found.",
                actual = response.bodyAsText()
            )
        }

    @ExperimentalSerializationApi
    @Test
    fun `access all heroes endpoint, query invalid page number, assert error`() =
        testApplication {
            val response = client.get("/book/learn?page=invalid")
            assertEquals(
                expected = HttpStatusCode.BadRequest,
                actual = response.status
            )
            val expected = ApiResponse(
                success = false,
                message = "Only Numbers Allowed."
            )
            val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText())
            assertEquals(
                expected = expected,
                actual = actual
            )
        }

    @ExperimentalSerializationApi
    @Test
    fun `access search books endpoint, query book name, assert single book result`() =
        testApplication {
            val response = client.get("/book/learn/search?name=flow")
            assertEquals(expected = HttpStatusCode.OK, actual = response.status)
            val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText())
                .books.size
            assertEquals(expected = 1, actual = actual)
        }

    @ExperimentalSerializationApi
    @Test
    fun `access search books endpoint, query book name, assert multiple books result`() =
        testApplication {
            val response = client.get("/book/learn/search?name=s")
            assertEquals(expected = HttpStatusCode.OK, actual = response.status)
            val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText())
                .books.size
            assertEquals(expected = 9, actual = actual)
        }

    @ExperimentalSerializationApi
    @Test
    fun `access search books endpoint, query an empty text, assert empty list as a result`() =
        testApplication {
            val response = client.get("/book/learn/search?name=")
            assertEquals(expected = HttpStatusCode.OK, actual = response.status)
            val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText())
                .books
            assertEquals(expected = emptyList(), actual = actual)
        }

    @ExperimentalSerializationApi
    @Test
    fun `access search books endpoint, query non existing book, assert empty list as a result`() =
        testApplication {
            val response = client.get("/book/learn/search?name=unknown")
            assertEquals(expected = HttpStatusCode.OK, actual = response.status)
            val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText())
                .books
            assertEquals(expected = emptyList(), actual = actual)
        }

    @ExperimentalSerializationApi
    @Test
    fun `access non existing endpoint,assert not found`() =
        testApplication {
            val response = client.get("/unknown")
            assertEquals(expected = HttpStatusCode.NotFound, actual = response.status)
            assertEquals(expected = "Page not Found.", actual = response.bodyAsText())
        }

    private fun calculatePage(page: Int) =
        mapOf(
            PREVIOUS_PAGE_KEY to if (page in 2..3) page.minus(1) else null,
            NEXT_PAGE_KEY to if (page in 1..2) page.plus(1) else null
        )

}