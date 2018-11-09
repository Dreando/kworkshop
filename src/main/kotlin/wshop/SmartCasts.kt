package wshop

fun main(args: Array<String>) {

    // Smart casts from nullable types
    val maybeSomething: String? = "Marcuss Licyniusz Krassus"

    //anything.toUpperCase()

    if(maybeSomething != null) {
        maybeSomething.toUpperCase()
    }

    // Smart casts from other types
    val maybeString: Any = "Aloha"

    if(maybeString is String) {
        maybeString.toUpperCase()
    }
}