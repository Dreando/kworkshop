package wshop.functions

typealias Ingredient = String

data class User(val id: Int, val name: String, val age: Int)

class UserRepository {

    val usersDb = listOf(
            User(1, "Marian", 33),
            User(2, "Żaneta", 55))

    operator fun get(id: Int): User? = usersDb.filter(...)

    operator fun get(name: String): User? = usersDb.filter(...)

    operator fun get(name: String, agePredicate: (Int) -> Boolean): User? = usersDb.filter(...)
}

fun main(args: Array<String>) {

    // TODO finish
}