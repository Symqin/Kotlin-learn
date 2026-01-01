package loop

// break statement in loops (menghentikan perulangan)

fun breakInLoop() {
    for (angka in 1..10) {
        if (angka == 4) {
            println("Berhenti pada angka $angka")
            break
        }
        println("Angka: $angka")
    }
}

// continue statement in loops (melompati iterasi tertentu)
fun continueInLoop() {
    for (angka in 1..10) {
        if (angka % 2 == 0) {
            continue
        }
        println("Angka Ganjil: $angka")
    }
}

fun main() {
    breakInLoop()
    continueInLoop()
}
