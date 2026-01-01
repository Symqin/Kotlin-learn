package logic

fun main() {
    // 1. Membuat Range
    val rangeNaik = 1..100
    val rangeTurun = 100 downTo 1
    val rangeGanjil = 1..100 step 2

    // 2. Operasi pada Range

    // a. Menghitung jumlah data di dalam range
    println("Jumlah datatype.angka 1-100: ${rangeNaik.count()}") // 100
    println("Jumlah datatype.angka ganjil: ${rangeGanjil.count()}") // 50

    // b. Mengecek apakah datatype.angka ada di dalam range (CONTAINS)
    val nilai = 70
    val apakahLulus = nilai in 60..100 // Dibaca: Apakah 50 ada di dalam 60 sampai 100?

    println("Apakah nilai $nilai lulus? $apakahLulus") // false

    // c. Mendapatkan nilai awal dan akhir
    println("Awal: ${rangeNaik.first}") // 1
    println("Akhir: ${rangeNaik.last}") // 100
    println("Step: ${rangeNaik.step}")  // 1
}