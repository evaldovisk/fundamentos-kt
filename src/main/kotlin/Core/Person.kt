package Core

// class Person constructor(firstName: String, lastName: String)
// class Person internal constructor(firstName: String, lastName: String)
class Person (firstName: String, lastName: String){

    init {
        println("Create a Person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String):
            this(firstName, lastName)


}

