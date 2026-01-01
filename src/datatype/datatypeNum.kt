package datatype// belajar Number data type di kotlin

// tipe data datatype.angka
// integer number (bilangan bulat)
val intNumber: Int = 100            // 32 bit
val longNumber: Long = 10000000000L  // 64 bit
val shortNumber: Short = 100     // 16 bit
val byteNumber: Byte = 127      // 8 bit

// floating point number (bilangan desimal)
val floatNumber: Float = 10.5F    // 32 bit
val doubleNumber: Double = 20.99   // 64 bit

// literals format penulisan datatype.angka
val decimalNumber: Int = 100          // desimal
val hexadecimalNumber: Int = 0xFF     // heksadesimal
val binaryNumber: Int = 0b1010        // biner

// fitur underscore untuk mempermudah pembacaan datatype.angka
val largeNumber: Long = 1_000_000L
val piValue: Double = 3.1415_926535
val creditCardNumber: Long = 1234_5678_9012_3456L
val socialSecurityNumber: Int = 999_99_9999

// conversion antar tipe data datatype.angka

val intToLong: Long = intNumber.toLong()
val longToInt: Int = longNumber.toInt()
val intToFloat: Float = intNumber.toFloat()
val doubleToInt: Int = doubleNumber.toInt()

// --- TAMBAHAN PENTING ---

// 1. Unsigned Integer Types (Hanya bilangan positif)
// Ditandai dengan suffix 'u' atau 'U'
val unsignedInt: UInt = 100u
val unsignedLong: ULong = 1000uL
val unsignedShort: UShort = 10u
val unsignedByte: UByte = 1u

// 2. Mengetahui Batas Nilai (Min & Max Values)
// Berguna untuk validasi agar data tidak overflow
val maxInt: Int = Int.MAX_VALUE  // 2,147,483,647
val minInt: Int = Int.MIN_VALUE  // -2,147,483,648
val maxShort: Short = Short.MAX_VALUE // 32767

// 3. Jebakan Pembagian Integer (Integer Division)
val division1: Int = 5 / 2       // Hasilnya 2 (bukan 2.5, karena Int dibuang komanya)
val division2: Double = 5.0 / 2  // Hasilnya 2.5 (karena salah satu adalah Double)
val division3: Double = 5 / 2.toDouble() // Cara konversi saat operasi

// 4. Nullable Number (Angka yang boleh kosong/null)
// Menggunakan tanda tanya (?)
val notNullNumber: Int = 10      // Error jika diisi null
val nullableNumber: Int? = null  // Aman, boleh diisi datatype.angka atau null

// 5. Operasi Bitwise (Manipulasi level bit)
// Di Kotlin menggunakan kata kunci, bukan simbol (<<, >>, &)
val x = 0b1010 // 10 desimal
val y = 0b0101 // 5 desimal
val bitwiseOr = x or y   // (1010 | 0101 = 1111) -> 15
val bitwiseAnd = x and y // (1010 & 0101 = 0000) -> 0
val shiftLeft = 1 shl 2  // (0001 digeser kiri 2x = 0100) -> 4

fun main() {
    println("=== 1. CONTOH PENGGUNAAN UNSIGNED VS SIGNED ===")
    // Int biasa maksimal sekitar 2 Miliar
    val intBiasa: Int = 2_000_000_000
    println("Int Biasa: $intBiasa")

    // Kalau kita paksa isi 3 Miliar ke Int biasa -> ERROR (Overflow)
    // val intError: Int = 3_000_000_000 // Hapus komen ini pasti merah/error

    // Solusi: Pakai UInt (Unsigned) karena range positifnya sampai 4 Miliar
    val dataBesar: UInt = 3_000_000_000u
    println("UInt (Bisa tampung data besar): $dataBesar")


    println("\n=== 2. CONTOH JEBAKAN PEMBAGIAN (INTEGER DIVISION) ===")
    val totalSkor = 95
    val jumlahMatch = 2

    // Kasus: Menghitung Win Rate atau Rata-rata
    // SALAH: Int dibagi Int hasilnya Int (Koma hilang)
    val rataRataSalah = totalSkor / jumlahMatch
    println("Hasil Salah (95/2): $rataRataSalah (Harusnya 47.5)")

    // BENAR: Salah satu harus diubah jadi Double/Float dulu
    val rataRataBenar = totalSkor.toDouble() / jumlahMatch
    println("Hasil Benar (95.0/2): $rataRataBenar")


    println("\n=== 3. CONTOH NULLABLE (DATA KOSONG) ===")
    // Skenario: Data umur dari input user (user mungkin lupa isi)
    var umurUser: Int? = null // Awalnya kosong

    // println(umurUser + 5) // ERROR! Kotlin melarang operasi mtk pada data null

    // Cara pakai yang aman (Pengecekan null)
    if (umurUser != null) {
        println("Umur user adalah $umurUser")
    } else {
        println("User belum mengisi umur (Data masih null)")
    }

    // Sekarang kita isi datanya
    umurUser = 17
    println("Sekarang umur user sudah diisi: $umurUser")


    println("\n=== 4. CONTOH BITWISE (LOGIKA 8-4-2-1) ===")
    // Kita buktikan logika 8421 kamu tadi
    val x = 0b0001 // Angka 1 (Posisi 1 nyala)

    // shl 2 artinya "Shift Left 2 kali" (Geser ke kiri 2 langkah)
    // 0001 -> digeser -> 0010 -> digeser -> 0100
    val hasilGeser = x shl 2

    println("Angka 1 (0001) digeser kiri 2x menjadi: $hasilGeser")
    println("Bukti: Biner 0100 dalam desimal adalah 4")
}