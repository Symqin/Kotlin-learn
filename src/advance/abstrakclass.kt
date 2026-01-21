package advance

import java.awt.Color

abstract class Kendaraan {
    abstract fun showNama(firstName: String, lastName: String)
    abstract fun showColor(color: String)
}

class Mobil : Kendaraan() {
    override fun showNama(firstName: String, lastName: String) {
        println("Nama Mobil: $firstName $lastName")
    }

    override fun showColor(color: String) {
        println("Warna Mobil: $color")
    }
}


fun main () {
    val mobil = Mobil()
    mobil.showNama("Toyota", "Avanza")
    mobil.showColor("Merah")
}