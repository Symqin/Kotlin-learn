package iniexercise

abstract class produk (
    val nama: String,
    val harga: Int
)

class Makanan (
    nama: String,
    harga: Int
) : produk(nama, harga)

class Minuman (
    nama: String,
    harga: Int
) : produk(nama, harga)

class Pesanan (
    val makanan: Makanan,
    val minuman: Minuman
) {
    fun hitungtotal (): Int {
        return makanan.harga + minuman.harga
    }
}

class Pelanggan (
    val nama: String,
    val pesanan: Pesanan
) {
    fun tampilkaninfo() {
        println("Nama Pelanggan: $nama")
        println("Total Harga Pesanan: Rp.${pesanan.hitungtotal()}")

    }

}

fun main() {
    // Membuat objek
    val makanan = Makanan("Nasi Goreng", 60000)
    val minuman = Minuman("Es Teh", 40000)

    val pesanan = Pesanan(makanan, minuman)
    val pelanggan = Pelanggan("John Doe", pesanan)

    // Menampilkan hasil
    pelanggan.tampilkaninfo()
}