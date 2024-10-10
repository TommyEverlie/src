fun getAgeString(age: Int): String {
    val suffix = when {
        age % 10 == 1 && age % 100 != 11 -> "год"
        age % 10 in 2..4 && age % 100 !in 12..14 -> "года"
        else -> "лет"
    }
    return "$age $suffix"
}

fun main() {
    val ages = listOf(21, 32, 12)
    for (age in ages) {
        println(getAgeString(age))
    }
}