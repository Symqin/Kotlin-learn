package advance

import advance.User.Companion.createGuest
import advance.databaseConnection.url

object databaseConnection {
    var url = "jdbc:postgresql://127.0.0.1:5432/databasename"

    fun connect() {
        println("Terhubung ke database $url")

    }
}

class User(val nama: String) {

    // Member biasa (harus buat objek User dulu baru bisa dipakai)
    fun sapa() {
        println("Halo, saya $nama")
    }

    // Companion Object (Milik Kelas, bukan milik instance user tertentu)
    companion object {
        const val MAX_AGE = 100

        fun createGuest(): User {
            return User("Tamu")
        }
    }
}

fun main () {
    databaseConnection.connect()
    println(databaseConnection.url)


    println(User.MAX_AGE)
    val tamu = User.createGuest()

    tamu.sapa()



}