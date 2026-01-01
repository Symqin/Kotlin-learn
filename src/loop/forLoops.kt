package loop

// for array loop
fun forArrayLoop() {
    val arrayBuah = arrayOf("Mangga", "Pisang", "Apel", "Jeruk")
    for (buah in arrayBuah) {
        println("Saya suka buah: $buah")
    }
}

// for range loop
fun forRangeLoop() {
    for (angka in 1..10) {
        println("Angka: $angka")
    }
    for (angka in 1 until 10 step 2) {
        println("Angka Ganjil: $angka")
    }
}

fun main() {
    forArrayLoop()
    forRangeLoop()
}