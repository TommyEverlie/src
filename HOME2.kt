fun gradeNotation(grade: Int): String {
    return when (grade) {
        5 -> "Отлично"
        4 -> "Хорошо"
        3 -> "Удовлетворительно"
        2 -> "Неудовлетворительно"
        1 -> "Плохо"
        else -> "Некорректная оценка"
    }
}

fun main() {
    val grade = 4
    println(gradeNotation(grade))
}