package br.com.evaldo

fun case1(){
    println()
    var index = 0;
    for(item in 10.rangeTo(20).step(2)){
        println("${++index}) $item")
    }
    println()
}

fun case2(){
    println()
   for((index, item) in 10.rangeTo(20).step(2).withIndex()){
       println("${index + 1 }) $item")
   }
    println()
}

fun case3(){
    val myArray = arrayOf(10, 20, 30, 40, 50)

    for(items in myArray){
        println("Array = $items")
    }

    println()

    for(index in myArray.indices){
        println("At index $index is ${myArray[index]} ")
    }

}
fun main(){
//    case1()
    case2()
    case3()
}