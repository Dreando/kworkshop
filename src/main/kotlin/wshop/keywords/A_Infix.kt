package wshop.keywords

class JoiningTable {

    infix fun on(joiningColumns: Pair<String, String>) = Table()
}

class Table {

    infix fun join(table: Table) = JoiningTable()
}

fun main(args: Array<String>) {

    val tableA = Table()
    val tableB = Table()

    tableA join tableB on ("tableA_join_id" to "tableB_join_id")
}