package logic // operator perbandingan dan boolean

fun comparison() {
    // Operator Perbandingan
    val a = 10
    val b = 20

    val isEqual = (a == b)       // Sama dengan
    val isNotEqual = (a != b)    // Tidak sama dengan
    val isGreater = (a > b)     // Lebih besar
    val isLess = (a < b)        // Lebih kecil
    val isGreaterOrEqual = (a >= b) // Lebih besar atau sama dengan
    val isLessOrEqual = (a <= b)    // Lebih kecil atau sama dengan

    println("Apakah a sama dengan b? $isEqual")
}

fun booleanLogic() {
    val x = true
    val y = false

    val andResult = x && y // AND
    val orResult = x || y  // OR
    val notX = !x          // NOT

    println("Hasil AND: $andResult")
    println("Hasil OR: $orResult")
    println("Hasil NOT datatype.x: $notX")
}

fun main() {
    booleanLogic()
    comparison()
}