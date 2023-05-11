fun main() {
    print("Enter your year of birth: ")
    val birthYear = readLine()?.toInt()

    if (birthYear != null) {
        val age = calculateAge(birthYear)
        println("Your age is $age")
    } else {
        println("Invalid input")
    }
}

fun calculateAge(birthYear: Int): Int {
    val currentYear = 2023 // Replace with the current year
    return if (currentYear >= birthYear) {
        currentYear - birthYear
    } else {
        0
    }
}



