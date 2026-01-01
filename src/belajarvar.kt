// jenis jenis variable di kotlin

val immutableVar: String = "I am immutable" // tidak bisa diubah (val)
var mutableVar: String = "I am mutable"     // bisa diubah (var)

fun main() {
    println(immutableVar)
    println(mutableVar)

    // mencoba mengubah mutable variable
    mutableVar = "I have been changed"
    println(mutableVar)
}

// null
var nullableVar: String? = null // bisa diisi null
var nonNullableVar: String = "I cannot be null" // tidak bisa diisi null

// const dan lateinit
const val CONSTANT_VAR: String = "I am a constant" // harus diinisialisasi saat deklarasi
lateinit var lateInitVar: String // diinisialisasi nanti sebelum digunakan

fun demonstrateLateInit() {
    lateInitVar = "I have been initialized"
    println(lateInitVar)
}

fun demonstrateConst() {
    println(CONSTANT_VAR)
}