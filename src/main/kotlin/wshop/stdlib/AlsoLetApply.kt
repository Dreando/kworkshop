package wshop.stdlib

import java.time.LocalDate


data class ComplexAbstraction(var id: String, var name: String, var date: LocalDate, var number: Double)

fun main(args: Array<String>) {

    val abstraction = ComplexAbstraction("id", "name", LocalDate.now(), 3.0)

    println(abstraction)

    // Apply - move to the abstraction context during initialization / writing

    abstraction.apply {
        this.id = "Other id"
        this.name = "Other name"
    }

    println(abstraction)

    // With - move to the abstraction context during read

    with(abstraction) {
        this.date
        this.id
    }

    // Let - avoid declaring variables to proceed nullable situation

    val someString: String? = null

    someString?.let {
        println("If you see me, I'm not null: $it")
    }

    // Also - avoid declaring variables if you need to do some additional stuff, e.g. after returning

    fun returnAlsoLog(): Int {
        return 3.also {
            println("Returning 3")
        }
    }

    println(returnAlsoLog())
}