package datatype// data type

// character
val charA: Char = 'A'
val charB: Char = 'B'
val charUnicode: Char = '\u0041' // Unicode untuk 'A'

// boolean
val isTrue: Boolean = true
val isFalse: Boolean = false

// tipe string
val greeting: String = "Hello, World!"

val multilineString: String = """
    This is a multiline
    string in Kotlin.
""".trimIndent() // menghilangkan langsung gaperlu |

val multilineStringWithMargin: String = """
    |This is a multiline
    |string with margin
    |in Kotlin.
""".trimMargin() // menggunakan '|' sebagai margin prefix

// string templates
val name: String = "Kotlin"
val welcomeMessage: String = "Welcome to $name programming!" // menyisipkan variabel
val complexMessage: String = "2 + 2 = ${2 + 2}" // menyisipkan ekspresi



