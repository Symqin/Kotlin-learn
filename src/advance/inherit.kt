package advance

// Gunakan kata kunci 'open' agar kelas bisa diwariskan
open class Vehicle {

    // Protected: hanya bisa diakses di kelas ini dan kelas turunannya
    protected var wheel = 0

    fun showWheel() {
        println("Jumlah roda: $wheel")
    }

    fun setWheel(count: Int) {
        this.wheel = count
    }

    // Gunakan kata kunci 'open' agar fungsi bisa di-override
    open fun start() {
        println("Vehicle started")
    }
}

class Car : Vehicle() {

    fun honk() {
        println("Beep Beep!")
    }

    // Menggunakan override untuk memodifikasi fungsi dari induk
    override fun start() {
        super.start() // Memanggil fungsi start dari Vehicle
        println("Car started")
    }

    fun setCarWheel(count: Int) {
        // Bisa mengakses 'wheel' karena modifier-nya 'protected'
        this.wheel = count
    }
}

fun main() {
    val myCar = Car()
    myCar.setWheel(4)
    myCar.showWheel()
    myCar.start()
    myCar.honk()
}