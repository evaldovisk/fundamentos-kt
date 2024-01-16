package Core

interface Vehicle {

    val autoMarker: String

    fun start(){
        println("Vrummm")
    }

    fun stop(){
        println("Brake noise")
    }

    fun getKmPerLiter(): Int {
        return 17
    }

    fun getDoors(): Int
}