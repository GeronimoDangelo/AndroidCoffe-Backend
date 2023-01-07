package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Book
import com.example.models.Jetpack

class JetpackRepositoryImpl : JetpackRepository {

    override val jetpacks: Map<Int, List<Jetpack>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3
        )
    }

    override val page1 = listOf(
        Jetpack(
            id = 1,
            name = "Jetpack",
            image = "/images/variables.png",
            about = "Composable functions are the building blocks used to create user interfaces for Android apps when developing with Jetpack Compose. In the ComposeDemo project created earlier in the book, we made use of both the built-in compose functions provided with Compose and also created our own functions.",
            rating = 0.5,
            level = "Beginner",
            timeToLearn = "Fast",
            tags = listOf(
                "Composable functions are the building blocks used to create user interfaces for Android apps when developing with Jetpack Compose. In the ComposeDemo project created earlier in the book, we made use of both the built-in compose functions provided with Compose and also created our own functions."

            ),
        ),
        Jetpack(
            id = 1,
            name = "JEt",
            image = "/images/variables.png",
            about = "Kotlin uses two different keywords to declare variables ( val and var). Use val for a variable whose value never changes. You can't reassign a value to a variable that was declared using val. And you can use var for a variable whose value can change.",
            rating = 0.5,
            level = "Beginner",
            timeToLearn = "Fast",
            tags = listOf(
                "Composable functions are the building blocks used to create user interfaces for Android apps when developing with Jetpack Compose. In the ComposeDemo project created earlier in the book, we made use of both the built-in compose functions provided with Compose and also created our own functions.",


            ),
        ),
        Jetpack(
            id = 1,
            name = "13123",
            image = "/images/variables.png",
            about = "Kotlin uses two different keywords to declare variables ( val and var). Use val for a variable whose value never changes. You can't reassign a value to a variable that was declared using val. And you can use var for a variable whose value can change.",
            rating = 0.5,
            level = "Beginner",
            timeToLearn = "Fast",
            tags = listOf(
                "Int is a type that represents an integer, one of the many numerical types that can be represented in Kotlin. Similar to other languages, you can also use Byte, Short, Long, Float, and Double depending on your numerical data",
                "Some values are not meant to be changed, though. Consider a String called languageName. If you want to ensure that languageName always holds a value of Kotlin, then you can declare languageName using the val keyword"
            ),
        )


    )

    override val page2 = listOf(
        Jetpack(
            id = 1,
            name = "diego",
            image = "/images/variables.png",
            about = "Kotlin uses two different keywords to declare variables ( val and var). Use val for a variable whose value never changes. You can't reassign a value to a variable that was declared using val. And you can use var for a variable whose value can change.",
            rating = 0.5,
            level = "Beginner",
            timeToLearn = "Fast",
            tags = listOf(
                "Int is a type that represents an integer, one of the many numerical types that can be represented in Kotlin. Similar to other languages, you can also use Byte, Short, Long, Float, and Double depending on your numerical data",
                "Some values are not meant to be changed, though. Consider a String called languageName. If you want to ensure that languageName always holds a value of Kotlin, then you can declare languageName using the val keyword"
            ),
        ),
        Jetpack(
            id = 1,
            name = "japon",
            image = "/images/variables.png",
            about = "Kotlin uses two different keywords to declare variables ( val and var). Use val for a variable whose value never changes. You can't reassign a value to a variable that was declared using val. And you can use var for a variable whose value can change.",
            rating = 0.5,
            level = "Beginner",
            timeToLearn = "Fast",
            tags = listOf(
                "Int is a type that represents an integer, one of the many numerical types that can be represented in Kotlin. Similar to other languages, you can also use Byte, Short, Long, Float, and Double depending on your numerical data",
                "Some values are not meant to be changed, though. Consider a String called languageName. If you want to ensure that languageName always holds a value of Kotlin, then you can declare languageName using the val keyword"
            ),
        ),
        Jetpack(
            id = 1,
            name = "rusia",
            image = "/images/variables.png",
            about = "Kotlin uses two different keywords to declare variables ( val and var). Use val for a variable whose value never changes. You can't reassign a value to a variable that was declared using val. And you can use var for a variable whose value can change.",
            rating = 0.5,
            level = "Beginner",
            timeToLearn = "Fast",
            tags = listOf(
                "Int is a type that represents an integer, one of the many numerical types that can be represented in Kotlin. Similar to other languages, you can also use Byte, Short, Long, Float, and Double depending on your numerical data",
                "Some values are not meant to be changed, though. Consider a String called languageName. If you want to ensure that languageName always holds a value of Kotlin, then you can declare languageName using the val keyword"
            ),
        )


    )

    override val page3 = listOf(
        Jetpack(
            id = 1,
            name = "europa",
            image = "/images/variables.png",
            about = "Kotlin uses two different keywords to declare variables ( val and var). Use val for a variable whose value never changes. You can't reassign a value to a variable that was declared using val. And you can use var for a variable whose value can change.",
            rating = 0.5,
            level = "Beginner",
            timeToLearn = "Fast",
            tags = listOf(
                "Int is a type that represents an integer, one of the many numerical types that can be represented in Kotlin. Similar to other languages, you can also use Byte, Short, Long, Float, and Double depending on your numerical data",
                "Some values are not meant to be changed, though. Consider a String called languageName. If you want to ensure that languageName always holds a value of Kotlin, then you can declare languageName using the val keyword"
            ),
        ),
        Jetpack(
            id = 1,
            name = "2023",
            image = "/images/variables.png",
            about = "Kotlin uses two different keywords to declare variables ( val and var). Use val for a variable whose value never changes. You can't reassign a value to a variable that was declared using val. And you can use var for a variable whose value can change.",
            rating = 0.5,
            level = "Beginner",
            timeToLearn = "Fast",
            tags = listOf(
                "Int is a type that represents an integer, one of the many numerical types that can be represented in Kotlin. Similar to other languages, you can also use Byte, Short, Long, Float, and Double depending on your numerical data",
                "Some values are not meant to be changed, though. Consider a String called languageName. If you want to ensure that languageName always holds a value of Kotlin, then you can declare languageName using the val keyword"
            ),
        ),
        Jetpack(
            id = 1,
            name = "estonia",
            image = "/images/variables.png",
            about = "Kotlin uses two different keywords to declare variables ( val and var). Use val for a variable whose value never changes. You can't reassign a value to a variable that was declared using val. And you can use var for a variable whose value can change.",
            rating = 0.5,
            level = "Beginner",
            timeToLearn = "Fast",
            tags = listOf(
                "Int is a type that represents an integer, one of the many numerical types that can be represented in Kotlin. Similar to other languages, you can also use Byte, Short, Long, Float, and Double depending on your numerical data",
                "Some values are not meant to be changed, though. Consider a String called languageName. If you want to ensure that languageName always holds a value of Kotlin, then you can declare languageName using the val keyword"
            ),
        )


    )


    override suspend fun getAllJetpacks(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page = page)[PREVIOUS_PAGE_KEY],
            nextPage = calculatePage(page = page)[NEXT_PAGE_KEY],
            jetpacks = jetpacks[page]!!,
            lastUpdated = System.currentTimeMillis()
        )
    }

    override suspend fun searchJetpack(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            jetpacks = findJetpack(query = name)
        )
    }


    private fun calculatePage(page: Int) =
        mapOf(
            PREVIOUS_PAGE_KEY to if (page in 2..3) page.minus(1) else null,
            NEXT_PAGE_KEY to if (page in 1..2) page.plus(1) else null
        )

    private fun findJetpack(query: String?): List<Jetpack> {
        val founded = mutableListOf<Jetpack>()
        return if (!query.isNullOrEmpty()) {
            jetpacks.forEach { (_, heroes) ->
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