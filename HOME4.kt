fun calculateAge(yearOfBirth: Int, currentYear: Int): Int {
    val age = currentYear - yearOfBirth
    // Проверка на корректный возраст в диапазоне от 1 до 199
    if (age in 1..199) {
        return age
    } else {
        throw IllegalArgumentException("Возраст должен быть в диапазоне от 1 до 199")
    }
}

fun ageString(age: Int): String {
    val lastDigit = age % 10
    val lastTwoDigits = age % 100

    val suffix = when {
        lastTwoDigits in 11..19 -> "лет"
        lastDigit == 1 -> "год"
        lastDigit in 2..4 -> "года"
        else -> "лет"
    }

    return "$age $suffix"
}

fun main() {
    val yearOfBirth = 1999
    val currentYear = 2024

    try {
        val age = calculateAge(yearOfBirth, currentYear)
        println("Возраст: ${ageString(age)}")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}