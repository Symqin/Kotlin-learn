package logic

fun math() {
    val result1 = 10 + 10 / 2 // Hati-hati! Perkalian/Pembagian didahulukan. Hasil: 15
    val result2 = (10 + 10) / 2 // Pakai kurung () biar tambah dulu. Hasil: 10

    // Simbol Standar
    val tambah = 10 + 10
    val kurang = 100 - 10
    val kali   = 10 * 10
    val bagi   = 100 / 10   // Hasil: 10 (Ingat: Int / Int = Int)

    // --- MODULUS (Sisa Bagi) ---
    // Simbolnya %, bacanya "Sisa bagi dari..."
    // Berguna buat cek bilangan ganjil/genap (ganjil % 2 = 1, genap % 2 = 0)
    val sisaBagi = 10 % 3
    // 10 dibagi 3 dapat 3, sisanya 1. Maka hasilnya 1.

    println(sisaBagi)
}

fun augmented() {
    var dompet = 0 // Wajib var

    dompet += 10  // Sama dengan: dompet = dompet + 10
    println(dompet) // 10

    dompet += 10  // Ditambah lagi 10
    println(dompet) // 20

    dompet -= 5   // Sama dengan: dompet = dompet - 5
    println(dompet) // 15

    // Bisa juga *=, /=, %=
}

fun unary () {
    var angka = 0

    angka++ // Increment (Ditambah 1)
    println(angka) // 1

    angka-- // Decrement (Dikurang 1)
    println(angka) // 0

    // Tanda Negatif
    val suhu = -5 // Tanda minus di datatype.depan datatype.angka adalah logic.unary operator

    // Boolean Kebalikan (!)
    val sehat = true
    val sakit = !sehat // false (Kebalikannya)
}
