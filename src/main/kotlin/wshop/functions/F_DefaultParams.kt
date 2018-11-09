package wshop.functions

fun buildBuilding(
        floorsNumber: Int = 2, // By default buildings have two floors, not lying
        roofType: Any,
        elevationColor: Any = "Grey",
        roomsNumber: Int
) {
    // Do some very advanced engineering stuff here
}

fun main(args: Array<String>) {

    buildBuilding(3, "Sloping", "Red", 3)

    buildBuilding(roofType = "Unknown", roomsNumber = 3)

    buildBuilding(
            floorsNumber = 5,
            roofType = "Unknown",
            elevationColor = "Red",
            roomsNumber = 3
    )

    buildBuilding(
            roomsNumber = 3,
            elevationColor = "Blue",
            roofType = "Flat",
            floorsNumber = 5
    )
}