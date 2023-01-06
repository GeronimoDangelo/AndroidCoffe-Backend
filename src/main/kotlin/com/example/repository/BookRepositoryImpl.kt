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
        Book(
            id = 2,
            name = "Coroutines",
            image = "/images/coroutines.png",
            about = "A coroutine is an instance of suspendable computation. It is conceptually similar to a thread, in the sense that it takes a block of code to run that works concurrently with the rest of the code. However, a coroutine is not bound to any particular thread. It may suspend its execution in one thread and resume in another one.",

            rating = 4.0,
            level = "Intermediate",
            timeToLearn = "Medium",
            tags = listOf(
                "Coroutines are light-weight threads that allow you to write asynchronous non-blocking code. Kotlin provides the kotlinx. coroutines library with a number of high-level coroutine-enabled primitives.",
                "For Kotlin 1.8.0, the recommended coroutines version is 1.6.4.",

            ),
        ),
        Book(
            id = 3,
            name = "Flows",
            image = "/images/flows.png",
            about = "In coroutines, a flow is a type that can emit multiple values sequentially, as opposed to suspend functions that return only a single value. For example, you can use a flow to receive live updates from a database.",
            rating = 5.0,
            level = "Advanced",
            timeToLearn = "Long",
            tags = listOf(
                "You can define a flow in Kotlin as a coroutine that has multiple asynchronously computed values. It is a stream of data that can be computed asynchronously and is used to send multiple values in sequence. The data emitted must be of the same type and is also emitted in a sequential manner.",
                "Flows are built on top of coroutines and can provide multiple values. A flow is conceptually a stream of data that can be computed asynchronously. The emitted values must be of the same type. For example, a Flow<Int> is a flow that emits integer values.",

            ),
        )
    )
    override val page2 = listOf(
        Book(
            id = 4,
            name = "Sealed classes",
            image = "/images/sealed_clases.png",
            about = "Sealed classes and interfaces represent restricted class hierarchies that provide more control over inheritance. All direct subclasses of a sealed class are known at compile time. No other subclasses may appear outside a module within which the sealed class is defined.",
            rating = 2.5,
            level = "Beginner - Intermediate",
            timeToLearn = "Fast",
            tags = listOf(
                "For example, third-party clients can't extend your sealed class in their code. Thus, each instance of a sealed class has a type from a limited set that is known when this class is compiled.",
                "The same works for sealed interfaces and their implementations: once a module with a sealed interface is compiled, no new implementations can appear.",
                "In some sense, sealed classes are similar to enum classes: the set of values for an enum type is also restricted, but each enum constant exists only as a single instance, whereas a subclass of a sealed class can have multiple instances, each with its own state.",

            ),
        ),
        Book(
            id = 5,
            name = "Interfaces",
            image = "/images/interface.png",
            about = "Interfaces in Kotlin can contain declarations of abstract methods, as well as method implementations. What makes them different from abstract classes is that interfaces cannot store state. They can have properties, but these need to be abstract or provide accessor implementations.",
            rating = 2.9,
            level = "Intermediate",
            timeToLearn = "Medium",
            tags = listOf(
                "An interface is defined using the keyword interface.",
                "You can declare properties in interfaces. A property declared in an interface can either be abstract or provide implementations for accessors. Properties declared in interfaces can't have backing fields, and therefore accessors declared in interfaces can't reference them",
                "An interface can derive from other interfaces, meaning it can both provide implementations for their members and declare new functions and properties. Quite naturally, classes implementing such an interface are only required to define the missing implementations"
            ),
        ),
        Book(
            id = 6,
            name = "Data Class",
            image = "/images/dataclass.png",
            about = "It is not unusual to create classes whose main purpose is to hold data. In such classes, some standard functionality and some utility functions are often mechanically derivable from the data. In Kotlin, these are called data classes and are marked with data",
            rating = 1.0,
            level = "Beginner",
            timeToLearn = "Fast",
            tags = listOf(
                "To ensure consistency and meaningful behavior of the generated code, data classes have to fulfill the following requirements: ",
                "- The primary constructor needs to have at least one parameter.",
                "- All primary constructor parameters need to be marked as val or var.",
                "- Data classes cannot be abstract, open, sealed, or inner.",
            ),
        )
    )
    override val page3 = listOf(
        Book(
            id = 7,
            name = "Extensions",
            image = "/images/extensions.png",
            about = "Kotlin provides the ability to extend a class or an interface. This is done via special declarations called extensions.",
            rating = 3.5,
            level = "Intermediate",
            timeToLearn = "Medium",
            tags = listOf(
                "For example, you can write new functions for a class or an interface from a third-party library that you can't modify. Such functions can be called in the usual way, as if they were methods of the original class. This mechanism is called an extension function. There are also extension properties that let you define new properties for existing classes.",
                "Extensions do not actually modify the classes they extend. By defining an extension, you are not inserting new members into a class, only making new functions callable with the dot-notation on variables of this type.",

            ),
        ),
        Book(
            id = 8,
            name = "Constructors",
            image = "/images/constructors.png",
            about = "A class in Kotlin can have a primary constructor and one or more secondary constructors. The primary constructor is a part of the class header, and it goes after the class name and optional type parameters.",
            rating = 3.0,
            level = "Beginner",
            timeToLearn = "Fast",
            tags = listOf(
                "A class can also declare secondary constructors, which are prefixed with constructor.",
                "If the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor, either directly or indirectly through another secondary constructor(s). Delegation to another constructor of the same class is done using the this keyword",

            ),

        ),
        Book(
            id = 9,
            name = "Objects",
            image = "/images/objects.png",
            about = "Sometimes you need to create an object that is a slight modification of some class, without explicitly declaring a new subclass for it. Kotlin can handle this with object expressions and object declarations.",
            rating = 3.5,
            level = "Beginner - Intermediate",
            timeToLearn = "Fast",
            tags = listOf(
                "Object expressions create objects of anonymous classes, that is, classes that aren't explicitly declared with the class declaration. Such classes are useful for one-time use. You can define them from scratch, inherit from existing classes, or implement interfaces. Instances of anonymous classes are also called anonymous objects because they are defined by an expression, not a name.",
                "In kotlin if you declare an object with the 'object' keyword , you are creating anonymous objects"
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