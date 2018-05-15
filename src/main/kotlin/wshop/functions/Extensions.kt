package wshop.functions

fun String.pokemonize(): String {
    return (0 until this.length).map {
        if(it % 2 == 0) this[it] else this[it].toUpperCase()
    }.joinToString(prefix = "<3", postfix = "<3", separator = "")
}

fun main(args: Array<String>) {
    println("Szczupak to król wód, jak lew jest król dżungli".pokemonize())
}