package datatype// tipe data array dan range

val intArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)
val stringArray: Array<String> = arrayOf("Kotlin", "Java", "Swift")
val mixedArray: Array<Any> = arrayOf(1, "Kotlin", 3.14, true)

// operasi array

fun main() {
    println("=== 1. CONTOH PENGGUNAAN ARRAY ===")

    // Mengakses elemen array
    // Cara Biasa (Paling sering dipakai)
    val dataPertama = stringArray[0]
    // Cara Kedua (Pakai fungsi get)
    val dataKedua = intArray.get(1)
    println("$dataPertama dan $dataKedua")

    // Mengubah elemen array
    // Mengganti "Budi" jadi "Andi"
    stringArray[0] = "Andi"

    // Atau pakai set
    stringArray.set(1, "Rina")
    println(stringArray[0]) // Output: Andi

    //mengetahui ukuran array
    val ukuranArray = mixedArray.size
    val kosonggak = mixedArray.isEmpty()
    println("Ukuran datatype.mixedArray: $ukuranArray")

}

val angka = arrayOf(10, 20, 30, 40, 50)

// 1. Cek apakah data ada? (Output: Boolean)
val adaTigaPuluh = angka.contains(30) // true

// 2. Ambil data paling datatype.depan & datatype.belakang
val depan = angka.first() // 10
val belakang = angka.last() // 50

// 3. Mencari index dari data tertentu
val posisi = angka.indexOf(40) // Hasil: 3

// 4. Menghitung rata-rata & jumlah (Khusus array datatype.angka)
val total = angka.sum()      // 150
val rataRata = angka.average() // 30.0

fun jajan () {
    // Cukup tulis datatype.angka 5, jangan ketik 'size:'
    val names: Array<String?> = arrayOfNulls(5)

    names.set(0, "Eko")
    names.set(1, null)
    names.set(2, "Kurniawan")
    names.set(3, null)
    names.set(4, "Khannedy")

    // Tambahan: Biar kelihatan hasilnya saat di-Run
    println(names[0]) // Eko
    println(names[1]) // null
}