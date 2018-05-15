package wshop.functions

typealias Ingredient = String

data class Meal(val ingredients: List<Ingredient> = listOf()) {

    operator fun plus(otherIngredient: Ingredient): Meal {
        return Meal(this.ingredients + otherIngredient)
    }
}

fun main(args: Array<String>) {

    val mojeSniadanie = Meal()

    val jestemJednakGlodny = mojeSniadanie + "Chleb" + "Masełko, ale dobre takie" + "Szyneczka"

    println(jestemJednakGlodny)
}