package loop

// while loop (cek kondisi terlebih dahulu)
fun whileLoop() {
    var count = 10
    while (count <= 5) {
        println("Perulangan ke-$count")
        count++
    }
}

// do while loop (eksekusi terlebih dahulu baru cek kondisi)
fun doWhileLoop() {
    var count = 10
    do {
        println("Perulangan ke-$count")
        count++
    } while (count <= 5)
}

fun main() {
    println("While Loop:")
    whileLoop()
    println("\nDo While Loop:")
    doWhileLoop()
}