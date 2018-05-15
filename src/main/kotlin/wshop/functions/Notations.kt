package wshop.functions

typealias ExplicitType = Any

fun longFunction(argument: ExplicitType) : ExplicitType {
    return 3
}

fun shortFunction(argument: ExplicitType) : ExplicitType = 3

fun `short function with inferred type`(argument: ExplicitType) = 3
