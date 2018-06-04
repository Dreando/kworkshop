package wshop.functions

// Global

fun tak() = 3
fun List<Any>.tak() = 4

// Class member

class Example {

    fun tak() = 4
    fun List<Any>.tak() = 4


    // Function member... yes functions can be nested

    fun level1() {

        fun tak() = 4
        fun List<Any>.tak() = 4

        // Oh well... they can be even more nested

        fun level2() {

            fun tak() = 4
            fun List<Any>.tak() = 4

        }
    }
}


// Internal scope, lack of package scope