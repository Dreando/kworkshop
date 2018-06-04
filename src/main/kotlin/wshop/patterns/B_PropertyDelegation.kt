package wshop.patterns

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

// Allow to extract common patterns of property initialization

// Example built in delegations:

// Lazy computation - computed at first access
val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}

// Observable delegation
class User {
    var name: String by Delegates.observable("<no name>") {
        prop, old, new ->
        println("$old -> $new")
    }
}

fun main(args: Array<String>) {

    val user = User()

    user.name = "Marian"
    user.name = "A jednak Arnold"
}