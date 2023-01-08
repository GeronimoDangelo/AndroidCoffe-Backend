package com.example.repository

import com.example.models.ApiResponse
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
            image = "/images/composable.png",
            about = "Composable functions are the building blocks used to create user interfaces for Android apps when developing with Jetpack Compose. In the ComposeDemo project created earlier in the book, we made use of both the built-in compose functions provided with Compose and also created our own functions.",
            rating = 0.5,
            level = "Beginner",
            timeToLearn = "Fast",
            tags = listOf(
                "A composable function it's same as any function in programming. But we need to annotate with @Composable annotation.",
                "-The function takes in data. Composable functions can accept parameters which allow the app logic to describe the UI. In this case, our widget accepts a String so it can greet the user by name.",
                "-This function is fast, idempotent, and free of side-effects.",
                "-The function displays text in the UI. It does so by calling the Text() composable function, which actually creates the text UI element. Composable functions emit UI hierarchy by calling other composable functions."

            ),
        ),
        Jetpack(
            id = 2,
            name = "Lazy Column",
            image = "/images/lazycolumn.png",
            about = "A LazyColumn is a vertically scrolling list that only composes and lays out the currently visible items. It’s similar to a Recyclerview in the classic Android View system.",
            rating = 0.5,
            level = "Beginner",
            timeToLearn = "Fast",
            tags = listOf(
                "For single composable use item() ",
                "For list of composable use items(count: Int) or items(items: List<T>)",
                "For Android developers: LazyColumn  (Vertical RecyclerView) and LazyRow (Horizontal RecyclerView)"


            ),
        ),
        Jetpack(
            id = 3,
            name = "Lazy Row",
            image = "/images/lazyrow.png",
            about = "A LazyRow is a horizontal scrolling list that only composes and lays out the currently visible items. It’s similar to a Recyclerview in the classic Android View system.",
            rating = 0.5,
            level = "Beginner",
            timeToLearn = "Fast",
            tags = listOf(
                "For Android developers: LazyRow (Horizontal RecyclerView)",
                "For list of composable use items(count: Int) or items(items: List<T>",
                "For single composable use item() "

            ),
        )


    )

    override val page2 = listOf(
        Jetpack(
            id = 4,
            name = "Lifecycle",
            image = "/images/lifecycle.png",
            about = "Composition describes the UI of your app and is produced by running composables. A Composition is a tree-structure of the composables that describe your UI.",
            rating = 0.5,
            level = "Beginner",
            timeToLearn = "Medium",
            tags = listOf(
                "When Jetpack Compose runs your composables for the first time, during initial composition, it will keep track of the composables that you call to describe your UI in a Composition.",
                "Then, when the state of your app changes, Jetpack Compose schedules a recomposition. Recomposition is when Jetpack Compose re-executes the composables that may have changed in response to state changes, and then updates the Composition to reflect any changes.",
                "A Composition can only be produced by an initial composition and updated by recomposition. The only way to modify a Composition is through recomposition.",

                ),
        ),
        Jetpack(
            id = 5,
            name = "Preview",
            image = "/images/preview.png",
            about = "In Jetpack Compose we can see the preview of our code in Android studio. It allows us to see the output without running our app.",
            rating = 0.5,
            level = "Beginner",
            timeToLearn = "Fast",
            tags = listOf(
                "How to add a preview?",
                " You need to add @Preview() annotation before the composable function. After adding this annotation we are able to see the preview of our UI.",
                "You can add multiple previews. Just add moreanother @Preview annotation in others compasables your composable."
            ),
        ),
        Jetpack(
            id = 6,
            name = "LaunchedEffect",
            image = "/images/launcheffect.png",
            about = "Kotlin uses two different keywords to declare variables ( val and var). Use val for a variable whose value never changes. You can't reassign a value to a variable that was declared using val. And you can use var for a variable whose value can change.",
            rating = 0.5,
            level = "Intermediate",
            timeToLearn = "Medium",
            tags = listOf(
                "LaunchedEffect will cancel and re-launch if scaffoldState.snackbarHostState changes.",
                "To call suspend functions safely from inside a composable, use the LaunchedEffect composable. When LaunchedEffect enters the Composition, it launches a coroutine with the block of code passed as a parameter.",
                "The coroutine will be cancelled if LaunchedEffect leaves the composition.",
                "If LaunchedEffect is recomposed with different keys, the existing coroutine will be cancelled and the new suspend function will be launched in a new coroutine.",
            ),
        )


    )

    override val page3 = listOf(
        Jetpack(
            id = 7,
            name = "State",
            image = "/images/state.png",
            about = "Kotlin uses two different keywords to declare variables ( val and var). Use val for a variable whose value never changes. You can't reassign a value to a variable that was declared using val. And you can use var for a variable whose value can change.",
            rating = 0.5,
            level = "Intermediate",
            timeToLearn = "Medium",
            tags = listOf(
                "An app's state is any value that can change over time.",
                "-All Android apps display state to the user. A few examples of state in Android apps are:",
                "  The most recent messages received in a chat app.",
                "  The user's profile photo.",
                "  The scroll position in a list of items.",
                "-Key idea: State determines what is shown in the UI at any particular time."
            ),
        ),
        Jetpack(
            id = 8,
            name = "Architect. Layering",
            image = "/images/architectural.png",
            about = "Jetpack Compose is not a single monolithic project; it is created from a number of modules which are assembled together to form a complete stack.",
            rating = 0.5,
            level = "Advanced",
            timeToLearn = "Long",
            tags = listOf(
                "Understanding the different modules that make up Jetpack Compose enables you to:",
                " - Use the appropriate level of abstraction to build your app or library",
                " - Understand when you can ‘drop down’ to a lower level for more control or customization",
                " - Minimize your dependencies",
                "-----------",
                "Runtime",
                "This module provides the fundamentals of the Compose runtime such as remember, mutableStateOf, the @Composable annotation and SideEffect.",
                "-----------",
                "UI",
                "The UI layer is made up of multiple modules ( ui-text, ui-graphics, ui-tooling, etc.)",
                "----------",
                "Foundation",
                "This module provides design system agnostic building blocks for Compose UI, like Row and Column, LazyColumn, recognition of particular gestures, etc.",
                "----------",
                "Material",
                "This module provides an implementation of the Material Design system for Compose UI, providing a theming system, styled components, ripple indications, icons."

            ),
        ),
        Jetpack(
            id = 9,
            name = "ViewModel",
            image = "/images/viewmodel.png",
            about = "The ViewModel class is a business logic or screen level state holder. It exposes state to the UI and encapsulates related business logic.",
            rating = 0.5,
            level = "Intermediate",
            timeToLearn = "Medium",
            tags = listOf(
                "Its principal advantage is that it caches state and persists it through configuration changes.",
                "This means that your UI doesn’t have to fetch data again when navigating between activities, or following configuration changes, such as when rotating the screen."
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