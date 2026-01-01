package loop

// if - else statement

fun ifElse() {
    val nilai = 75

    if (nilai >= 85) {
        println("Nilai A")
    } else if (nilai >= 70) {
        println("Nilai B")
    } else if (nilai >= 55) {
        println("Nilai C")
    } else if (nilai >= 40) {
        println("Nilai D")
    } else {
        println("Nilai E")
    }
}

fun main() {
    ifElse()
}