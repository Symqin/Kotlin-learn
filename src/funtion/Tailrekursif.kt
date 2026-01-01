package funtion

// rekursif tai function example in Kotlin

fun main() {
    tailrec fun display(value: Int) {
        println("rekursif $value")
        if (value > 0) {
            display(value - 1)
        }
    }

    tailrec fun faktorialrekursiftail(value : Int, total : Int = 1): Int {
        return when (value) {
            1 -> total
            else -> faktorialrekursiftail (value -1, total * value)

        }
    }

    display( 100)
    println(faktorialrekursiftail(31))

}