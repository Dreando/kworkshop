package wshop.functions

fun clojureFunction(param1: Int, param2: () -> Unit) {
    println(param1)
    param2()
}

fun main(args: Array<String>) {
    clojureFunction(3) {
        println("Marian Paździoch to łysa menda")
    }
}