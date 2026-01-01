package funtion

// belajar lamda expression di Kotlin

fun toUpperCase(name: String): String {
    return name.uppercase()
}
fun main() {
    // lamda expression 2 parameter
    val lamdahello: (String, String) -> String = { firstname: String, secondname: String ->
        "${firstname.uppercase()} ${secondname.uppercase()}"
    }
    println(lamdahello("John", "Doe"))

    // lamda expression 2 parameter
    val lamdasum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println("Sum: ${lamdasum(5, 10)}")

    // lamda expression metode reference
    val uppercase: (String) -> String = ::toUpperCase
    println(uppercase("kotlin"))

    // lamda expression single parameter with implicit it
    val names: (String) -> String = { it.uppercase() }
    println(names("lamda"))


}