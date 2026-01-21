package advance
// ===============================
// INTERFACE VERSION (FIXED)
// ===============================

interface IKendaraan {
    fun jalan()

    fun klakson() {
        println("Tin tin!")
    }
}

interface Listrik {
    fun isiDaya()
}

class Motor : IKendaraan {
    override fun jalan() {
        println("Motor berjalan")
    }
}

class MobilListrik : IKendaraan, Listrik {
    override fun jalan() {
        println("Mobil listrik berjalan")
    }

    override fun isiDaya() {
        println("Mengisi daya")
    }
}

fun main() {
    val k1: IKendaraan = Motor()
    val k2: IKendaraan = MobilListrik()

    k1.jalan()
    k2.jalan()
}
