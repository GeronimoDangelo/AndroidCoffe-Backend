package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Book

const val NEXT_PAGE_KEY = "nextPage"
const val PREVIOUS_PAGE_KEY = "prevPage"

class BookRepositoryImpl : BookRepository {

    override val books: Map<Int, List<Book>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3
        )
    }

    override val page1 = listOf(
        Book(
            id = 1,
            name = "Variables",
            image = "/images/variables.jpg",
            about = "They are the names you give to computer memory locations which are used to store values in a computer program and later you use those names to retrieve the stored values and use them in your program.",
            rating = 5.0,
            month = "July",
            day = "23rd",
            tags = listOf(
                "Fugaku",
                "Mikoto",
                "Itachi",
                "Sarada",
                "Sakura"
            ),
        ),
        Book(
            id = 2,
            name = "Coroutines",
            image = "/images/coroutines.jpg",
            about = "A coroutine is a concurrency design pattern that you can use on Android to simplify code that executes asynchronously",
            rating = 5.0,
            month = "Oct",
            day = "10th",
            tags = listOf(
                "Minato",
                "Kushina",
                "Boruto",
                "Himawari",
                "Hinata"
            ),
        ),
        Book(
            id = 3,
            name = "Flows",
            image = "/images/flows.jpg",
            about = "In coroutines, a flow is a type that can emit multiple values sequentially, as opposed to suspend functions that return only a single value. For example, you can use a flow to receive live updates from a database.",
            rating = 4.5,
            month = "Mar",
            day = "28th",
            tags = listOf(
                "Kizashi",
                "Mebuki",
                "Sarada",
                "Sasuke"
            ),
        )
    )
    override val page2 = listOf(
        Book(
            id = 4,
            name = "Sealed classes",
            image = "/images/sealed_clases.jpg",
            about = "Sealed classes and interfaces represent restricted class hierarchies that provide more control over inheritance. All direct subclasses of a sealed class are known at compile time. No other subclasses may appear outside a module within which the sealed class is defined",
            rating = 4.9,
            month = "Mar",
            day = "27th",
            tags = listOf(
                "Naruto",
                "Hinata",
                "Hanabi",
                "Himawari",
                "Kawaki"
            ),
        ),
        Book(
            id = 5,
            name = "Interfaces",
            image = "/images/interface.jpg",
            about = "in Kotlin can contain declarations of abstract methods, as well as method implementations. What makes them different from abstract classes is that interfaces cannot store state. They can have properties, but these need to be abstract or provide accessor implementations.",
            rating = 4.9,
            month = "Mar",
            day = "31st",
            tags = listOf(
                "Sasuke Uchiha",
                "Sakura Uchiha"
            ),
        ),
        Book(
            id = 6,
            name = "Data Class",
            image = "/images/dataclass.jpg",
            about = "It is not unusual to create classes whose main purpose is to hold data. In such classes, some standard functionality and some utility functions are often mechanically derivable from the data. In Kotlin, these are called data classes and are marked with data",
            rating = 4.9,
            month = "Jul",
            day = "25th",
            tags = listOf(
                "Orochimaru",
                "Log"
            ),
        )
    )
    override val page3 = listOf(
        Book(
            id = 7,
            name = "Extensions",
            image = "/images/extensions.jpg",
            about = "Kotlin provides the ability to extend a class or an interface with new functionality without having to inherit from the class or use design patterns such as Decorator. This is done via special declarations called extensions. ",
            rating = 4.2,
            month = "Jan",
            day = "1st",
            tags = listOf(
                "Kokatsu"
            ),
        ),
        Book(
            id = 8,
            name = "Constructors",
            image = "/images/constructors.jpg",
            about = "A Kotlin constructor is a special member function in a class that is invoked when an object is instantiated. Whenever an object is created, the defined constructor is called automatically which is used to initialize the properties of the class.",
            rating = 4.5,
            month = "Oct",
            day = "27th",
            tags = listOf(
                "Mitsuki",
                "Log"
            ),

        ),
        Book(
            id = 9,
            name = "Objects",
            image = "/images/objects.jpg",
            about = "Kakashi Hatake (はたけカカシ, Hatake Kakashi) is a shinobi of Konohagakure's Hatake clan. Famed as Kakashi of the Sharingan (写輪眼のカカシ, Sharingan no Kakashi), he is one of Konoha's most talented ninja, regularly looked to for advice and leadership despite his personal dislike of responsibility. To his students on Team 7, Kakashi emphasises the importance of teamwork; he himself received this lesson, along with the Sharingan, from his childhood friend, Obito Uchiha.",
            rating = 4.5,
            month = "Sep",
            day = "15th",
            tags = listOf(
                "Sakumo"
            ),
        )
    )


    override suspend fun getAllBooks(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page = page)[PREVIOUS_PAGE_KEY],
            nextPage = calculatePage(page = page)[NEXT_PAGE_KEY],
            books = books[page]!!,
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(page: Int) =
        mapOf(
            PREVIOUS_PAGE_KEY to if (page in 2..3) page.minus(1) else null,
            NEXT_PAGE_KEY to if (page in 1..2) page.plus(1) else null
        )

    override suspend fun searchBooks(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            books = findHeroes(query = name)
        )
    }

    private fun findHeroes(query: String?): List<Book> {
        val founded = mutableListOf<Book>()
        return if (!query.isNullOrEmpty()) {
            books.forEach { (_, heroes) ->
                heroes.forEach { hero ->
                    if (hero.name.lowercase().contains(query.lowercase())) {
                        founded.add(hero)
                    }
                }
            }
            founded
        } else {
            emptyList()
        }
    }
}