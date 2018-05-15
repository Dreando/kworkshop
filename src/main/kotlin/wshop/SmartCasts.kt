package wshop

@Suppress("IfThenToSafeAccess")
fun main(args: Array<String>) {

    // Smart casts from nullable types
    val anything: String? = "Marek Licyniusz Krassus"

    //anything.toUpperCase()

    if(anything != null) {
        anything.toUpperCase()
    }

    // Smart casts from other types

    val maybeString: Any? = "Aloha"

    if(maybeString is String) {
        maybeString.toUpperCase()
    }

}