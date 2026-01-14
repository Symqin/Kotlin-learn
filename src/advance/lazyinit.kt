package advance

class HeavyClass {
    // Properti ini belum dibuat saat class HeavyClass dibuat
    val databaseConnection: String by lazy {
        println("Sedang menghubungkan ke database... (Proses Berat)")
        "Koneksi Berhasil!" // Baris terakhir adalah nilai yang akan disimpan
    }
}

fun main() {
    val obj = HeavyClass()
    println("Object dibuat, tapi databaseConnection belum di-init.")

    println("--- Akses Pertama ---")
    // Blok lazy dijalankan di sini
    println(obj.databaseConnection)

    println("--- Akses Kedua ---")
    // Blok lazy TIDAK dijalankan, langsung ambil nilai dari cache
    println(obj.databaseConnection)
}