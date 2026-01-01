package loop

// when statement
// contoh penggunaan when sebagai pengganti switch case
fun whenExample() {
    val hari = 3
    val namaHari = when (hari) {
        1 -> "Senin"
        2 -> "Selasa"
        3 -> "Rabu"
        4 -> "Kamis"
        5 -> "Jumat"
        6 -> "Sabtu"
        7 -> "Minggu"
        else -> "Hari tidak valid"
    }

    println("Hari ke-$hari adalah $namaHari")
}

// when multiple options in a single condition
fun whenMultipleOptions() {
    val warna = "Merah"
    val kategoriWarna = when (warna) {
        "Merah", "Merah Muda" -> "Warna Panas"
        "Biru", "Hijau" -> "Warna Dingin"
        "Kuning", "Oranye" -> "Warna Cerah"
        else -> "Warna Netral"
    }
    println("Warna $warna termasuk dalam kategori: $kategoriWarna")
}

//when expression in
fun dalam () {
    val nilai = 'A'
    val lulus = arrayOf('A', 'B', 'C')
    val hasil = when (nilai) {
        in lulus -> "Selamat, Anda Lulus!"
        !in lulus -> "Maaf, Anda Tidak Lulus."
        else -> "Nilai tidak valid."
    }
    println(hasil)

}

//when is expression
fun di () {
    val data: Any = 123.45
    val tipeData = when (data) {
        is Int -> "angka Bulat"
        is Double -> "angka Desimal"
        is String -> "Teks"
        else -> "Tipe data tidak dikenal"
    }
    println("Data tersebut adalah tipe: $tipeData")
}

// when pengganti if - else
fun ya () {
    val suhu = 30
    val kondisi = when {
        suhu > 30 -> "Panas"
        suhu in 20..30 -> "Hangat"
        suhu < 20 -> "Dingin"
        else -> "Suhu tidak valid"
    }
    println("Kondisi cuaca: $kondisi")
}

fun main() {
    println("=== Contoh Penggunaan when ===")
    whenExample()
    whenMultipleOptions()
    dalam()
    di()
    ya()
}
