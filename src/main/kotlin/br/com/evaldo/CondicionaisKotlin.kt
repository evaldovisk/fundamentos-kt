package br.com.evaldo

fun ifKotlin(){
    val myInt = 199
    val aInt: Int = 7

    // em java -> int lowest = (myInt < aInt) ? myInt : aInt

    // em kotlin ( else é obrigatorio igualmente no terminario do java)
    val lowest = if (myInt < aInt) myInt else aInt

    val temp = 26

    val isAirConditionerOn = if (temp >= 26) {
        println("It is warm")
        true
    } else {
        println("It is not warm")
        false
    }

    // passar variavel na string usando $
    println("is the air conditioner on: $temp")
}

fun whenKotlin(){

    val pizzasOrdered = 5

    // substitui o switch do java
    when(pizzasOrdered) {

        0 -> println("not hundry")
        // podemos juntar valores na opcao
        1, 2 -> println("hundry")
        3 -> println("very hundry")
        else -> {
            println("Are you sure?")
        }
    }

    when(pizzasOrdered) {

        //podemos usar condicionais
        Math.abs(pizzasOrdered) -> println("ordered 0 or more pizzas")
        else -> print("Orderned les than 0")
    }

    when(pizzasOrdered) {

        0 -> println("we need orders")
        //podemos até mesmo usar em intervalo sobre um range
        in 1..4 -> println("got some orders")
        in 5..9 -> println("business is up")
        else -> {
            println("Are you sure?")
        }
    }

    // podemos executar um when sem nenhum argumento tbm
    when {
        pizzasOrdered <= 0 -> println("None ordered")
        pizzasOrdered % 2 == 1 -> println("Odd number ordered")
        pizzasOrdered % 2 == 0 -> println("Even number ordered")
    }

}


fun whileAndFor(){
    // While e Do While é exatamente igual a do java
    var x = 0
    while( x < 10){
        println("x = $x")
        x += 3
    }

    do {
        println("x = $x")
        x -= 3
    } while (x > 0)

    for(item in 1..10){
        print("$item")
    }

    print("\n")
    for( ch in "Evaldovisk"){
        println(ch)
    }

}

fun main(){
//    ifKotlin()
//    whenKotlin()
    whileAndFor()
}