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

    // smart cast applied here too
    when (res) {
        is Success -> println("Great success my friend! BTW I'm smart casted now, look: $res")
        is Failure -> println("Nope, try again man")
    }
}

// Companion object - singleton instance friend of particular class, thus has access to its private members
class ComplexType {

    class ComplexTypeInner {

        class ComplexTypeInnerInner {

        }
    }

    companion object ComplexType {
        fun create(param1: Any, param2: Any): wshop.ComplexType {
            return ComplexType()
        }
    }
}

fun main2() {
    ComplexType.create(1,2)

    val ct = ComplexType()
    val ct2 = ComplexType()
}