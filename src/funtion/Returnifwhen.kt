package funtion// return if when example in Kotlin

// return if
fun checkNumber(num: Int): String {
    return if (num > 0) {
        "Positif"
    } else if (num < 0) {
        "Negatif"
    } else {
        "Nol"
    }
}

// return when
fun dayOfWeek(day: Int): String {
    return when (day) {
        1 -> "Senin"
        2 -> "Selasa"
        3 -> "Rabu"
        4 -> "Kamis"
        5 -> "Jumat"
        6 -> "Sabtu"
        7 -> "Minggu"
        else -> "Hari tidak valid"
    }
}

fun main() {
    // Test return if
    println(checkNumber(10))  // Output: Positif
    println(checkNumber(-5))  // Output: Negatif
    println(checkNumber(0))   // Output: Nol

    // Test return when
    println(dayOfWeek(3))     // Output: Rabu
    println(dayOfWeek(8))     // Output: Hari tidak valid
}