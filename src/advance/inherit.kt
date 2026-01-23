package advance

open class Vehicle {

    protected var wheelCount = 0

    fun showWheel() {
        println("Jumlah roda: $wheelCount")
    }

    fun setWheel(count: Int) {
        this.wheelCount = count
    }

    open fun start() {
        println("Vehicle started")
    }
}

class Car : Vehicle() {

    fun honk() {
        println("Beep Beep!")
    }

    override fun start() {
        super.start()
        println("Car started")
    }

    fun setCarWheel(count: Int) {
        this.wheelCount = count
    }
}

fun main() {
    val myCar = Car()

    myCar.setWheel(4)
    myCar.showWheel()
    myCar.start()
    myCar.honk()

}