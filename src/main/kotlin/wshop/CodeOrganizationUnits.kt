package wshop

// Can't be extended from outside of this file scope
sealed class Some

// Has pre-generated accessors, constructors, toString, equals, hashCode, etc.
data class Success(val value: Any) : Some()

// Is effective singleton
object Failure : Some()

fun getResult(param: Int): Some = if (param == 1) Success(param) else Failure

fun main(args: Array<String>) {

    val res = getResult(1)

    when (res) {
        is Success -> println("Great success my friend! BTW I'm smart casted now, look: $res")
        is Failure -> println("Nope, try again man")
    }
}