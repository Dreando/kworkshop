package wshop

class Result(val value: Any)

class NullableResult(val value: Any?)

fun main(args: Array<String>) {

    val res1 = Result(3)
    //val res2 = Result(null)

    val nullableRes1 = NullableResult(3)
    val nullableRes2 = NullableResult(null)

    // Checking if full
    if(nullableRes1.value != null) {
        // Do action
    }

    // If null then default
    nullableRes1.value ?: 5

    // Nest nullable objects and chain elvis checkers

    class NullableResult2(val value: NullableResult?)

    val nestedNullable = NullableResult2(NullableResult(null))

    nestedNullable.value?.value ?: 5
}