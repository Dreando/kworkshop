package wshop.keywords

inline fun <reified T> genericFun(param: T) {
    println("The generic type is: ${T::class.java}")
}

fun main(args: Array<String>) {

    genericFun("Arka")
    genericFun("Gdynia")
    genericFun(3)
    genericFun("Świnia")

}