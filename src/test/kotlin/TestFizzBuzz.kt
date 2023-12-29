
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test


private fun fizzBuzz(n: Int): List<String> {
    val listItens = ArrayList<String>()
    for(number in 1..n){
        if(number % 5 == 0 && number % 3 == 0){
            listItens.add("FizzBuzz")
            continue
        }
        if(number % 5 == 0){
            listItens.add("Buzz")
            continue
        }
        if(number % 3 == 0){
            listItens.add("Fizz")
            continue
        }

        listItens.add(number.toString())
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