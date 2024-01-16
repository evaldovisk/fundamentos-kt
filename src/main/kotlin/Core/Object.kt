package Core
fun main() {

    val location1 = object  {
        var xCoordinate = 200
        var yCoordinate = 400

    }

    println("Coordinates = (${location1.xCoordinate}, ${location1.yCoordinate})")

    // object type que é uma expressao
    val location = object  {
        var xCoordinate = 300
        var yCoordinate = 600

        fun printIt() {
            println("Coordinates = (${xCoordinate}, ${yCoordinate})")

        }

    }

    location.printIt()


    location.xCoordinate = 5000
    location.yCoordinate = 6000

    location.printIt()

    val temperature = MySingleton.getLastTemperature()

    println("Last Temperature measured = $temperature degress")

}

// object declaration que é uma instrução
object MySingleton {
    var temperatures = arrayOf(18, 22, 26)

    fun getLastTemperature() = temperatures.last()
}