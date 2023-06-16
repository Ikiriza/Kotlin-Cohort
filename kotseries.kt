fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (number in numbers) {
        val classification = when {
            number % 2 == 0 -> "even"
            else -> "odd"
        }
        println("$number is $classification")
    }


    val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (number in nums) {
        if (number % 2 == 0) {
            println("$number is even")
        } else {
            println("$number is odd")
        }
    }
  
}
