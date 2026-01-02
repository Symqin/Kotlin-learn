package datatype


// collections: List, Set, Map
// collections adalah struktur data yang dapat menampung banyak nilai sekaligus.
// colletions adalah tipe data non-primitif.

// List: urutan data yang dapat diakses melalui indeks
fun listExample() {
    val numberlist = mutableListOf(1, 2, 3, 4, 5)
    val randomlist = listOf("Kotlin", 42, 3.14, true) // listOf bersifat immutable

    numberlist.add(10)

    println("List Angka: $numberlist")
    println("List Acak: $randomlist")
    println(numberlist.size)

}

fun setExample() {
    // Set: kumpulan data unik tanpa urutan tertentu
    val numberSet = mutableSetOf(1, 2, 3, 4, 5)
    numberSet.add(3) // Tidak akan ditambahkan karena sudah ada
    numberSet.add(6)
    println("Set Angka: $numberSet")

    val numberset1 = setOf(4, 5, 6, 7, 8,8) // setOf bersifat immutable
    println("Set Angka 1: $numberset1")

    val unionset = numberSet.union(numberset1)
    println("Union Set: $unionset")

    val intersectionset = numberSet.intersect(numberset1)
    println("Intersection Set: $intersectionset")
}

fun map () {
    // Map: pasangan kunci-nilai (key-value pairs)
    val studentMap = mutableMapOf(
        "001" to "Andi",
        "002" to "Budi",
        "003" to "Citra"
    )

    studentMap["004"] = "Dewi" // Menambahkan pasangan kunci-nilai baru
    println("Map Siswa: $studentMap")
    println("Nama siswa dengan ID 002: ${studentMap["002"]}")
    studentMap .remove("003") // Menghapus pasangan kunci-nilai dengan kunci "003"
    println("Map Siswa setelah penghapusan: $studentMap")
}


fun main (){
    listExample()
    setExample()
    map()
}