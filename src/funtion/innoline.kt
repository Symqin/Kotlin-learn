package funtion

// inline function example in Kotlin
// inline menggunakan high order function

// Fungsi biasa (High Order Function)
fun hello(name: () -> String): String {
    return "Hello ${name()}"
}

// Inline Function (Perhatikan kata kunci 'inline')
inline fun inhello(name: () -> String): String {
    return "Hello ${name()}"
}

// non-inline function
inline fun innohello(firstname: () -> String,
                     noinline lastname: () -> String): String {
    return "Hello ${firstname()} ${lastname()}"
}

fun main() {
    // Loop 1: Memakai fungsi biasa, lambda me-return "joko"
    for (i in 1..100000) {
        println(hello { "joko" })
    }

    // Loop 2: Memakai inline function, lambda me-return "ligma"
    for (i in 1..100000) {
        println(inhello { "ligma" })
    }

    // Loop 3: Memakai inline function dengan non-inline parameter
    for (i in 1..100000) {
        println(innohello(
            { "john" },
            { "doe" }
        ))
    }
}