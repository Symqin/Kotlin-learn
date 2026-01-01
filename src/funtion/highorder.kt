package funtion

fun hello(name: String, transformer: (String) -> String): String {
    val nameTransform = transformer(name)
    return "Hello $nameTransform"
}
// high order function example in Kotlin
fun main() {

    val lambdaUpper = { value: String -> value.uppercase() }
    println(hello("joko", lambdaUpper))

    println(hello("joko", { value: String -> value.lowercase() }))

    val result1 = hello("joko", { value: String -> value.lowercase() })

    // trailing lambda
    val result2 = hello("joko") { value: String ->
        value.lowercase()
    }
}