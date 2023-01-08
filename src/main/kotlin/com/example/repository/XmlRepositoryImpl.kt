package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Jetpack
import com.example.models.Xml

class XmlRepositoryImpl : XmlRepository {
    override val xmls: Map<Int, List<Xml>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3
        )
    }

    override val page1 = listOf(
        Xml(
            id = 1,
            name = "LinearLayout",
            image = "/images/linearlayout.png",
            about = "LinearLayout is a view group that aligns all children in a single direction, vertically or horizontally.",
            rating = 0.5,
            level = "Beginner",
            timeToLearn = "Fast",
            tags = listOf(
                "You can specify the layout direction with the android:orientation attribute. Note: For better performance and tooling support, you should instead build your layout with ConstraintLayout.",
                "By default, orientation is horizontal."
            ),
        ),
        Xml(
            id = 2,
            name = "RecyclerView",
            image = "/images/recyclerview.png",
            about = "RecyclerView provides an ability to implement the horizontal, vertical and Expandable List. It is mainly used when we have data collections whose elements can change at run time based on user action or any network events",
            rating = 0.5,
            level = "Beginner",
            timeToLearn = "Fast",
            tags = listOf(
                "RecyclerView that as its name says, recycles the view, this means that once the view is off the screen, RecyclerView will reuse the items. On other hand ListView mush be  used when we have a small list of items because more items we have, the more elements we need to create when the user scrolls up/down the list and it’s more inefficient"
            ),
        ),
        Xml(
            id = 3,
            name = "ActivityLife",
            image = "/images/activitylife.png",
            about = "The Activity lifecycle is especially important because whenever an activity leaves the screen, the activity can be destroyed",
            rating = 0.5,
            level = "Beginner",
            timeToLearn = "Medium",
            tags = listOf(
                "In the onCreate() method, you perform basic application startup logic that should happen only once for the entire life of the activity",
                "The onStart() call makes the activity visible to the user, as the app prepares for the activity to enter the foreground and become interactive",
                "When the activity enters the Resumed state, it comes to the foreground, and then the system invokes the onResume() callback.",
                "On pause() , the system calls this method as the first indication that the user is leaving your activity ,it indicates that the activity is no longer in the foreground",
                "When your activity is no longer visible to the user enter the onStop()",
                "onDestroy() is called before the activity is destroyed."
            ),
        )
    )

    override val page2 = listOf(
        Xml(
            id = 4,
            name = "Fragments",
            image = "/images/fragments.png",
            about = "A Fragment represents a reusable portion of your app's UI. Fragments are used to place two activities on a single activity when creating the layout of the user interface. Fragments can’t exist on their own; they require activity or other fragments.",
            rating = 0.5,
            level = "Beginner",
            timeToLearn = "Medium",
            tags = listOf(
                "The fragment’s layout, lifecycle, and input events are managed and defined by themselves. The interaction between fragment objects is managed by the fragment manager class.",
                "The main difference between fragment and activity lifecycles is that activity creates only one view for the entire lifetime but fragment views can be recreated and even dynamically changed during the lifetime."
            )
        ),
        Xml(
            id = 5,
            name = "FrameLayout",
            image = "/images/framelayout.png",
            about = "FrameLayout is designed to block out an area on the screen to display a single item",
            rating = 0.5,
            level = "Beginner",
            timeToLearn = "Fast",
            tags = listOf(
                "Generally, FrameLayout should be used to hold a single child view, because it can be difficult to organize child views in a way that's scalable to different screen sizes without the children overlapping each other."
            )
        ),
        Xml(
            id = 6,
            name = "Intent",
            image = "/images/intent.png",
            about = "An intent is a messaging object used to request any action from another app component. Intents facilitate communication between different components in several ways.",
            rating = 0.5,
            level = "Intermediate",
            timeToLearn = "Fast",
            tags = listOf(
                "The intent is used to launch an activity, start the services, broadcast receivers, display a web page, dial a phone call, send messages from one activity to another activity, and so on.",
                "There are 2 types of intent:",
                "-Explicit intents are communicated between two activities inside the same application. We can use explicit intents when we need to move from one activity to another activity.",
                "-Implicit intent is communicated between two activities of an application"
            )
        )
    )

    override val page3 = listOf(
        Xml(
            id = 7,
            name = "Viewbinding",
            image = "/images/viewbinding.png",
            about = "View binding is a feature that allows you to more easily write code that interacts with views.",
            rating = 0.5,
            level = "Beginner",
            timeToLearn = "Fast",
            tags = listOf(
                "Once view binding is enabled in a module, it generates a binding class for each XML layout file present in that module",
                "An instance of a binding class contains direct references to all views that have an ID in the corresponding layout",
                "In most cases, view binding replaces findViewById"
            )
        ),
        Xml(
            id = 8,
            name = "ConstrainLayout",
            image = "/images/constrainlayout.png",
            about = "A ConstraintLayout is a android. view. ViewGroup which allows you to position and size widgets in a flexible way",
            rating = 0.5,
            level = "Beginner",
            timeToLearn = "Fast",
            tags = listOf(
                "It's much like RelativeLayout, but more flexible and easy to use from Android Studio's visual editor",
                "It is necessary to define for each view at least one horizontal and one vertical constraint. But we can also define more than one constraint on the same axis or to another item (like the red line)"
            )
        ),
        Xml(
            id = 9,
            name = "DataStore",
            image = "/images/datastore.png",
            about = "Preferences DataStore stores and accesses data using keys. This implementation does not require a predefined schema, and it does not provide type safety.",
            rating = 0.5,
            level = "Advanced",
            timeToLearn = "Long",
            tags = listOf(
                "Create a Preferences DataStore",
                "",
                "Use the property delegate created by preferencesDataStore to create an instance of Datastore<Preferences>. Call it once at the top level of your kotlin file, and access it through this property throughout the rest of your application.",
                "",
                "Read from a Preferences DataStore",
                "",
                "Because Preferences DataStore does not use a predefined schema, you must use the corresponding key type function to define a key for each value that you need to store in the DataStore<Preferences> instance"

            )
        )
    )


    override suspend fun getAllXmls(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page = page)[PREVIOUS_PAGE_KEY],
            nextPage = calculatePage(page = page)[NEXT_PAGE_KEY],
            xml = xmls[page]!!,
            lastUpdated = System.currentTimeMillis()
        )
    }

    override suspend fun searchXml(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            xml = findXml(query = name)
        )
    }

    private fun calculatePage(page: Int) =
        mapOf(
            PREVIOUS_PAGE_KEY to if (page in 2..3) page.minus(1) else null,
            NEXT_PAGE_KEY to if (page in 1..2) page.plus(1) else null
        )

    private fun findXml(query: String?): List<Xml> {
        val founded = mutableListOf<Xml>()
        return if (!query.isNullOrEmpty()) {
            xmls.forEach { (_, heroes) ->
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