package advance

// kotlin generic

class Box<T> (val value:T)

fun <T> inigeneric (item : T) {
    println(item)
}

fun main () {

    val integerBox = Box<Int>(10) // Atau cukup Box(10) karena type inference
    val stringBox = Box<String>("Halo")
    println(integerBox.value)
    println(stringBox.value)

    inigeneric("kotlin")


}