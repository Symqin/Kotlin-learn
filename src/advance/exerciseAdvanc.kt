package advance

/**
 * Buatlah sebuah function generic yang bisa mengecek apakah sebuah nilai tersebut lebih besar dari nilai lainnya
 * Function dibawah ini masih static dalam arti hanya untuk tipe data Int
 * Apabila tipe data nya berubah menjadi Double maka function ini belum bisa mengcover nya
 * Ekspektasinya adalah tetap hanya menggunakan 1 function terpusat saja.
 * Clue pertama adalah gunakan kotlin generic
 * Clue kedua adalah gunakan kotlin type check
 * Clue ketiga adalah gunakan kotlin smart cast untuk parameter kedua
 */
fun <T> isGreaterThan(value: T, value2: T): Boolean {
     if (value is Int && value2 is Int) {
        return value > value2
    } else {
        println("bukan int")
         return false
    }
}

/**
 * Buatlah sebuah extension function untuk tipe data Int untuk memeriksa apakah bilangan ini merupakan kelipatan dari bilangan lain
 * Contoh pemanggilan -> 100 isMultiplicationOf 5 -> true
 */

infix fun Int.ismultipllyof(value: Int): Boolean {
    return value % this == 0
}

/**
 * Buatlah sebuah extension function untuk tipe data Double untuk menghitung diskon dari harga
 * Contoh pemanggilan -> 100000.0 calculateDiscount 5.0 -> 95000.0
 */

infix fun Double.calculateDiscount(value: Double): Double {
    return this - (this * value/100)
}


/**
 * Dibawah ini terdapat sebuah sealed class bernama StatusResource
 * Isinya adalah Success, Error, dan Loading
 * Tetapi Success dan Error hanya bisa menggunakan tipe data String
 * Tolong ubah sealed class ini menjadi sebuah generic sealed class dimana Success dan Error bisa menggunakan tipe data apapun
 * Contoh pemanggilan -> println(StatusResource.Error(400).data) -> maka akan print 400
 */
sealed class StatusResource<T> {
    data class Success <T> (val data: T) : StatusResource <T> ()
    data class Error<T> (val error: T ) : StatusResource<T>()
    class Loading <T>: StatusResource<T>()
}

fun main() {
    val result = isGreaterThan(10.0, 20)
    println(result)

    println(100 ismultipllyof  5)
    println(100000.0 calculateDiscount 5.0)
    println(StatusResource.Success("Success").data)
}