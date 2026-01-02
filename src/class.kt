// macam macam class

// normal class
// data class
// enum class
// sealed class
// nested class
// inner class

package oop

// === 1. NORMAL CLASS ===
// Class biasa, digunakan untuk membuat objek standar.
class Mobil(val merk: String) {
    fun jalan() {
        println("Mobil $merk sedang berjalan...")
    }
}

// === 2. DATA CLASS ===
// Khusus untuk menampung data.
// Kelebihan: Otomatis dibuatkan fungsi toString(), equals(), copy(), dll.
data class User(val nama: String, val umur: Int)

// === 3. ENUM CLASS ===
// Digunakan untuk menyimpan pilihan yang pasti/tetap (Konstan).
enum class Status {
    LOADING, SUCCESS, FAILED
}

// === 4. SEALED CLASS ===
// Mirip Enum, tapi lebih canggih karena setiap pilihannya bisa berupa class yang berbeda-beda.
// Sangat sering dipakai untuk Arsitektur Aplikasi (State Management).
sealed class NetworkResult {
    data class Success(val data: String) : NetworkResult()
    data class Error(val message: String) : NetworkResult()
    object Loading : NetworkResult()
}

fun cekHasil(result: NetworkResult) {
    when (result) {
        is NetworkResult.Success -> println("Sukses: ${result.data}")
        is NetworkResult.Error -> println("Gagal: ${result.message}")
        is NetworkResult.Loading -> println("Sedang memuat...")
    }
}

// === 5 & 6. NESTED vs INNER CLASS ===
class Outer {
    val namaOuter = "Class Luar"

    // Nested Class: Class di dalam class, TAPI tidak bisa akses properti milik Outer.
    // Sifatnya berdiri sendiri (Static).
    class Nested {
        fun sapa() = println("Halo dari Nested Class!")
        // println(namaOuter) -> ERROR! Gak kenal siapa itu namaOuter
    }

    // Inner Class: Class di dalam class, DAN bisa akses properti milik Outer.
    // Wajib pakai kata kunci 'inner'.
    inner class Inner {
        fun aksesOuter() = println("Mengakses: $namaOuter") // BISA!
    }
}


fun main() {
    // 1. Normal Class
    val mobil = Mobil("Toyota")
    mobil.jalan()

    // 2. Data Class (Otomatis punya toString yang rapi)
    val user = User("Syahril", 20)
    println(user) // Output: User(nama=Syahril, umur=20)

    // 3. Enum Class (Pilihan Konstan)
    val status = Status.SUCCESS
    println("Status operasi: $status")

    // 4. Sealed Class (Biasanya untuk handle State/Kondisi)
    val hasil: NetworkResult = NetworkResult.Success("Data berhasil dimuat")
    cekHasil(hasil)

    // 5. Nested Class
    val nested = Outer.Nested()
    nested.sapa()

    // 6. Inner Class
    val outer = Outer()
    val inner = outer.Inner()
    inner.aksesOuter()
}
