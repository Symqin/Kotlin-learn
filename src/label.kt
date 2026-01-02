// materi label

// contoh label di kotlin
fun main() {
    loopi@ for (i in 1..10) {
        loopj@ for (j in 1..10) {
            println(" $i x $j = ${i * j}")
            if (j == 5) {
                break@loopi // bisa pakai continue@loopi juga
            }
        }
    }

    fun test(name: String,param: (String) -> Unit) : Unit = param(name)

   test ("joko") loop@{
       if (it == " ") {
           return@loop
       } else {
           println("Hello $it")
       }

   }
}