package Core

fun main() {

    val myCar = Car()

    myCar.start()

    println("My car's make = ${myCar.autoMarker} ")
    println("My car's have ${myCar.getDoors()} doors")

}