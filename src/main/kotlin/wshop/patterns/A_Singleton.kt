package wshop.patterns

object IAmSingletonToTheBones {
    fun hello() = "Hello"
}

fun main(args: Array<String>) {


    val obj1 = IAmSingletonToTheBones
    val obj2 = IAmSingletonToTheBones

    println(obj1 === obj2)
}