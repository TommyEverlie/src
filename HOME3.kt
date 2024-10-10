import kotlin.math.sqrt

fun findSmallestRoot(a: Double, b: Double, c: Double): Double? {
    // Вычисление дискриминанта
    val discriminant = b * b - 4 * a * c

    if (discriminant < 0) {
        return null // Нет действительных корней
    }

    // Решение квадратного уравнения для y
    val y1 = (-b + sqrt(discriminant)) / (2 * a)
    val y2 = (-b - sqrt(discriminant)) / (2 * a)

    // Найдём корни x, если y >= 0
    val roots = mutableListOf<Double>()
    if (y1 >= 0) {
        roots.add(sqrt(y1))
        roots.add(-sqrt(y1))
    }
    if (y2 >= 0) {
        roots.add(sqrt(y2))
        roots.add(-sqrt(y2))
    }

    // Вернуть наименьший корень, если корни существуют
    return roots.minOrNull()
}

fun main() {
    val a = 1.0
    val b = -5.0
    val c = 4.0

    val smallestRoot = findSmallestRoot(a, b, c)
    if (smallestRoot != null) {
        println("Наименьший корень: $smallestRoot")
    } else {
        println("Действительных корней нет")
    }
}