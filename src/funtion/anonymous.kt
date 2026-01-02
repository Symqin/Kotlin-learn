package funtion

// anonymous function example in Kotlin

fun main () {
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val anonymousUpper = fun(value: String) : String {
        if (value.isBlank()) {
            return "Kosong nih"
        }
        return value.uppercase()
    }

 println(hello(" ", anonymousUpper))
    println(hello("Joko", fun(value: String): String {
        return value.lowercase()
    }))

}

