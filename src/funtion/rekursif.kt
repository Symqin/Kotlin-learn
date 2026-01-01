package funtion

import java.math.BigInteger

// rekursif function example in Kotlin

fun main() {
    fun faktorialoop(value : Int) : Int {
        var result = 1
        for (i in value downTo 1) {
            result *= i
        }
        return result
    }

    println(faktorialoop(1000))

    fun faktorialrekursif(value : Int): Int {
        return when (value) {
            1 -> 1
            else -> value * faktorialrekursif (value -1)

        }
    }

    println(faktorialrekursif(10000))


}