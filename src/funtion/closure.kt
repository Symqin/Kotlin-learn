package funtion

// closure function example in Kotlin
fun main() {
    var counter = 0

    val lambdaincrement: () -> Unit = {
        counter++
        println("Counter sekarang: $counter")
    }

    val anonimousIncrement = fun() {
        counter++
        println("Counter sekarang: $counter")
    }

    fun normalIncrement() {
        counter++
        println("Counter sekarang: $counter")
    }


    lambdaincrement()
    anonimousIncrement()
    normalIncrement()
    lambdaincrement()
    anonimousIncrement()
    normalIncrement()
    lambdaincrement()
    anonimousIncrement()
    normalIncrement()

}