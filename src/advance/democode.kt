package advance

abstract class bangunan {
    abstract fun getnama(): String
    abstract fun getalamat(): String

    fun isEvenorOdd(number: Int): Boolean{
        return (number % 2 == 0)
    }

    fun isNumberDividedbyseven(number: Int): Boolean{
        return (number % 7 == 0 )
    }
}


class persegiPanjang : bangunan() {
    override fun getnama(): String {
        return "persegi panjang"
    }

    override fun getalamat(): String {
        return "bangun datar"
    }
}


class segitiga : bangunan() {
    override fun getnama(): String {
        return "segitiga"
    }

    override fun getalamat(): String {
        return "bangun datar"
    }
}

class kubus : bangunan() {
    override fun getnama(): String {
        return "kubus"
    }

    override fun getalamat(): String {
        return "bangun ruang"
    }
}


fun main () {
    val persegi = persegiPanjang()
    println("nama : ${persegi.getnama()}")
    println("alamat : ${persegi.getalamat()}")
    println("apakah 10 adalah bilangan genap? : ${persegi.isEvenorOdd(10)}")
    println("apakah 10 dapat dibagi 7? : ${persegi.isNumberDividedbyseven(10)}")

    val segitiga = segitiga()
    println("nama : ${segitiga.getnama()}")
    println("alamat : ${segitiga.getalamat()}")
    println("apakah 15 adalah bilangan genap? : ${segitiga.isEvenorOdd(15)}")
    println("apakah 14 dapat dibagi 7? : ${segitiga.isNumberDividedbyseven(14)}")

    val kubus = kubus()
    println("nama : ${kubus.getnama()}")
    println("alamat : ${kubus.getalamat()}")
    println("apakah 22 adalah bilangan genap? : ${kubus.isEvenorOdd(22)}")
    println("apakah 20 dapat dibagi 7? : ${kubus.isNumberDividedbyseven(20)}")
}