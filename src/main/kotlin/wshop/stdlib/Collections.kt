package wshop.stdlib

fun main(args: Array<String>) {

    /* Lists */

    val immutableList = listOf(1, 2, 3, "ok")

    val otherImmutableList = immutableList + listOf("Marian", 4)

    println(otherImmutableList)

    val mutableList = mutableListOf("a", "b")

    mutableList.add("c")

    println(mutableList)

    /* Sets */

    setOf<String>()
    hashSetOf<String>()
    mutableSetOf<String>()

    /* Maps */

    val mapka = mapOf(1 to "Marian", 2 to "Stefan", 3 to "Waldek")

    mutableMapOf<Int, Int>()
    hashMapOf<Int, Int>()
    // etc...

    /* Sequences - perform lazily where possible */

    val seq = sequenceOf(1,2,3)

    val genSeq = generateSequence {  }
}