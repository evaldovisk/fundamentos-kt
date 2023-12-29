
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun fizzBuzz(n: Int): List<String> {
    val listItens = ArrayList<String>()
    (1..n).forEach {
        val item = when {
            it % 5 == 0 && it % 3 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"

            else -> it.toString()
        }
        listItens.add(item)
    }

    return listItens

}

private fun fizzBuzz1(n: Int): List<String> {
    val listItens = ArrayList<String>()
    for(number in 1..n){
        val item = when{
            number % 5 == 0 && number % 3 == 0 -> "FizzBuzz"
            number % 3 == 0 -> "Fizz"
            number % 5 == 0 -> "Buzz"

            else -> number.toString()
        }
        listItens.add(item)
    }
    return listItens
}


class TestFizzBuzz {

    @Test
    fun `Calling fizzbuzz with "5" returns list with 5 items`() {
        fizzBuzz(5) shouldBeEqualTo listOf("1", "2", "Fizz", "4", "Buzz")
    }

    @Test
    fun `Calling fizzbuzz with 16 returns out the correct values`() {

        val list = listOf(
            "1", "2", "Fizz", "4", "Buzz", "Fizz",
            "7", "8", "Fizz", "Buzz", "11", "Fizz",
            "13", "14", "FizzBuzz", "16"
        )

        fizzBuzz(16) shouldBeEqualTo list
    }
}