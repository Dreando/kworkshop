package wshop.patterns

val pair = Pair("Marian", "Paździoch")

val triple = Triple("Marian", "Paździoch", "Menda")

data class Human(val name: String, val surname: String, val age: Int)

fun main(args: Array<String>) {

    val (name1, surname1) = pair

    val (name2, surname2, characterClass) = triple

    val (name3, surname3, age) = Human("Arnold", "Boczek", 40)

    val someMap = mapOf(
            1 to "First",
            2 to "Second"
    )

    someMap.map {entry ->
        val (key, value) = entry
    }

    for((key, value) in someMap) {

    }
}