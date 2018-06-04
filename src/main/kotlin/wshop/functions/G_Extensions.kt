package wshop.functions

fun String.pokemonize(): String {
    return (0 until this.length).map { charIndex ->
        if (charIndex % 2 == 0) this[charIndex] else this[charIndex].toUpperCase()
    }.joinToString(prefix = "<3", postfix = "<3", separator = "")
}

fun main(args: Array<String>) {
    println("Szczupak jest król wód, jak lew jest król dżungli".pokemonize())
}