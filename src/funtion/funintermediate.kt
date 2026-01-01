package funtion// funtion lanjutan

// funtion varargs
fun finalvalue(name: String, vararg values: Int) {
    var total = 0.0
    for (value in values) {
        total += value
    }
    total/= values.size
    println("Hello, $name! The final value is $total")
}

// extension function
fun String.hello(): String {
    return "Hello, $this!"
}

fun Int.isGenap(): Boolean {
    return this % 2 == 0
}

// fuction infix notation
infix fun String.word(type: String) : String {
    if (type == "uppercase") {
        return this.uppercase()
    } else if (type == "lowercase") {
        return this.lowercase()
    } else {
        return this
    }

}

// function scope
// scope adalah function yang bisa diakses di dalam function itu sendiri
fun scopeExample() {
    val outerVariable = "I am outside!"
    fun innerFunction() {
        val innerVariable = "I am inside!"
        println(outerVariable) // Bisa mengakses outerVariable
        println(innerVariable) // Bisa mengakses innerVariable
    }

    innerFunction()
    // println(innerVariable) // Error: Tidak bisa mengakses innerVariable di sini

}





fun main () {
    finalvalue("John", 80, 90, 75, 85)
    val name = "Alice"
    println(name.hello())
    val result = name word "uppercase"
    println("Result: $result")

}