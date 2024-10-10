fun findRoots(a: Double, b: Double, c: Double): String {
    val discriminant = b * b - 4 * a * c

    return when {
        discriminant > 0 -> "Уравнение имеет два корня"
        discriminant == 0.0 -> "Уравнение имеет один корень"
        else -> "Уравнение не имеет действительных корней"
    }
}

fun main() {
    val a = 1.0
    val b = -3.0
    val c = 2.0

    println(findRoots(a, b, c))
}