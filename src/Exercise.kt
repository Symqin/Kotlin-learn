/**
 * Buatlah sebuah function untuk menentukan grade dari sebuah list
 * List berisi kumpulan angka contoh listOf(80, 90, 70)
 * Dari masing masing angka tersebut menentukan grade nya
 * Kriteria nya adalah
 * Kalau 86 - 100 -> A
 * Kalau 76 - 85 -> B
 * Kalau 66 - 75 -> C
 * Sisanya D
 * Template nya seperti ini
 * fun defineTheGradeOfNumber(numberList: MutableList<Int>) {
 *
 * }
 * Clue pertama menggunakan looping for
 * Clue kedua menggunakan if else (control flow)
 */

fun gradenumber (numberList: MutableList<Int>) {
    for (number in numberList) {
        val grade: String = if (number in 86..100) {
            "A"
        } else if (number in 76..85) {
            "B"
        } else if (number in 66..75) {
            "C"
        } else {
            "D"
        }
        println("Nilai: $number, Grade: $grade")
    }
}

/**
 * Buatlah sebuah function untuk mencari sebuah list yang memiliki nilai discount 10% dibawah 20000
 * List berisi kumpulan angka contoh listOf(10000.0, 15000.0, 30000.0)
 * Kriteria nya adalah kalau discount nya dibawah 20000 maka akan ditampilkan.
 * Discount nya static 10%
 * Template nya seperti ini
 * fun findListOfDiscountedPrice(amountList: MutableList<Double>) {
 *
 * }
 * Clue pertama menggunakan collection operation filter
 */

fun findlistdicountprice (amountlist: MutableList<Double>) {
    val discountedPrices = amountlist.map { it * 0.1}
        .filter { it < 20000.0 }
    println("Discounted Prices below 20000: $discountedPrices")
}

/**
 * Buatlah sebuah function untuk menampilkan data berdasarkan tipe data
 * Kriterinya adalah
 * Kalau tipe data nya Int maka akan dicek apakah bilangan genap atau ganjil
 * Kalau tipe data nya String maka akan dicek berapa jumlah karakter
 * Sisanya akan di print saja data aslinya
 * Template nya seperti ini
 * fun showDataBasedOnType(firstData: Any) {
 *
 * }
 * Clue pertama menggunakan type checking is
 * Clue kedua menggunakan operator modulo % untuk pengecekan ganjil genap
 * Clue ketiga menggunakan operator length untuk menghitung jumlah karakter
 * Clue keempat menggunakan control flow when
 */

fun showDataBasedonType(firstData: Any) {
    when (firstData) {
        is Int -> {
            if (firstData % 2 ==0 ) {
                println({"$firstData adalah bilangan genap"})
            } else {
                println({"$firstData adalah bilangan ganjil"})
            }
        }
        is String -> {
            println("Jumlah karakter dari \"$firstData\" adalah ${firstData.length}")
        }
        else -> {
            println("Data asli: $firstData")
        }
    }
}





fun main() {
    val numberList = mutableListOf(80, 90, 70, 60, 85, 76, 95, 40)
    gradenumber(numberList)

    val amountList = mutableListOf(100000.0, 150000.0, 300000.0, 250000.0, 180000.0)
    findlistdicountprice(amountList)

    showDataBasedonType(42)
    showDataBasedonType("Kotlin")
    showDataBasedonType(3.14)
}

