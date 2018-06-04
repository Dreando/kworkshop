package wshop.functions

fun aFunction(param1: (Int) -> String, param2: Int) {
    println(param1(param2))
    println(param1.invoke(param2))
}

fun main(args: Array<String>) {

    fun param1ExplicitlyDeclared(x: Int) = (x * 2).toString()

    aFunction(::param1ExplicitlyDeclared, 3)

    aFunction({ arg -> arg.toString() }, 3)
}