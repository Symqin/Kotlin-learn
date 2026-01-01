package funtion// function adalah sebuah fungsi yang bisa dijalankann seacra berulang ulang
// Subjek = fun
// objek = funtion.halo
// predikat = ()
// keterangan : string

fun halo(): String {
    return "Halo, Selamat datang di Kotlin!"
}

//function parameter
fun sayHello (firstName: String, lastName: String): String {
    return "Halo, $firstName $lastName! Selamat datang di Kotlin!"
}

//function default argument
fun hellodefault (firstName: String, lastName: String = ""): String {
    return "Halo, $firstName $lastName! Selamat datang di Kotlin!"
}

//function named argument
fun fullname (firstName: String, lastName: String): String {
    return "Nama lengkap saya adalah $firstName $lastName."
}

// unit returning function
fun printHello(name: String): Unit {
    if (name.isEmpty()) {
        println("Hello, Guest!")
    } else {
        println("Hello, $name!")
    }
}

// fun returning type
fun sum (a: Int, b: Int): Int {
    return a + b
}

// singel expression function
fun multiply (a: Int, b: Int): Int = a * b

fun main() {
    println(halo())
    println(sayHello("John", "Doe"))
    println(hellodefault("Jane"))
    println(fullname(firstName = "Alice", lastName = "Smith"))
    printHello("")
    println("Sum: ${sum(5, 10)}")
    println("Multiply: ${multiply(4, 6)}")
}