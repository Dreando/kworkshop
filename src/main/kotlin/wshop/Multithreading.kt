package wshop

import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking


suspend fun complexComputation() {
    Thread.sleep(2000)
}

suspend fun veryComplexComputation() {
    complexComputation()
    Thread.sleep(1000)
    println("End of complex computation")
}

fun main2(args: Array<String>) {

    println("Before launch ")

    launch {
        veryComplexComputation()
    }

    //Thread.sleep(4000)

    println("After launch ")
}

fun main(args: Array<String>) = runBlocking {

    println("Before async ")

    val deferredResult = async {
        veryComplexComputation()
    }

    deferredResult.await()

    //Thread.sleep(4000)

    println("After async ")
}