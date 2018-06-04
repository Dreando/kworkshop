package wshop.keywords

fun function1(vararg params: String) {}

fun function2(vararg otherParams: String) {
    function1(*otherParams)
}

fun main(args: Array<String>) {


    function2("Pan", "Boczek")
}