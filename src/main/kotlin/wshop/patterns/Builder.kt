package wshop.patterns

data class TooManyParams(
        val param1: Any,
        val param2: Any,
        val param3: Any,
        val param4: Any,
        val param5: Any
)

fun main(args: Array<String>) {

    val javaStyleInit = TooManyParams(1, 2, 3, "something", "something more")

    val kotlinStyleInit = TooManyParams(
            param1 = 1,
            param2 = 2,
            param3 = 3,
            param4 = "something",
            param5 = "something more"
    )
}