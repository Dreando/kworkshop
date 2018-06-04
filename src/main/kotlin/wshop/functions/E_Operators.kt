package wshop.functions

data class User(val id: Int, val name: String, val age: Int)

class UserRepository {

    private val userDatabase = listOf(
            User(1, "Marian", 33),
            User(2, "Marian", 77),
            User(3, "Żaneta", 55)
    )

    operator fun get(id: Int): User? = userDatabase.find { it.id == id }

    operator fun get(name: String): User? = userDatabase.find { it.name == name }

    operator fun get(name: String, agePredicate: (Int) -> Boolean): User? = userDatabase.find { user ->
        user.name == name && agePredicate(user.age)
    }
}

fun main(args: Array<String>) {

    val repo = UserRepository()

    println("Get user by id: ${repo[1]}")

    println("Get user by name: ${repo["Żaneta"]}")

    println("Get user by name and age: ${repo["Marian", { age -> age > 35 }]}")
}