package br.com.evaldo

fun main(){
    // Inferencia de tipo de acordo com o dado atribuido
    val myPhrase = "Eu sou uma string"
    val myPi = 3.14
    val myAnswer = 42

    // kotlin não consegue realizar inferencia de tipo em variaveis que nao tem dado
    val aString: String
    val aDouble: Double
    val aInt: Int

    val myDouble = 1.999
    val myFloat = 1.9F
    val myLong = 10938537987583L
    val myInt = 197
    val myShort: Short = 12
    val myByte: Byte = -128

    // Podemos separar numeros com "_" para facilitar a visualização
    val aLongNumber = 123_456_789
    val theSameNumber = 123456789

    // Kotlin não faz conversão implicita para um tipo maior, deverá ser realiza explicitamente
    val anInt: Int = 7
    val anLong: Long = anInt.toLong()



}