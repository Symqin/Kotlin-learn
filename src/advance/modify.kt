package advance

// kotlin modifier adalah sebuah hak akses terhadap sebuah var func atau sebuah class yang ada di koltin

// ===============================
// VISIBILITY MODIFIERS - ONE FILE
// ===============================

// ---------- PRIVATE (TOP LEVEL) ----------
private fun privateTopLevel() {
    println("Private top-level function")
}

// ---------- INTERNAL ----------
internal class InternalClass {
    internal val internalProperty = "Internal Property"

    internal fun internalFunction() {
        println("Internal function")
    }
}

// ---------- PUBLIC (DEFAULT) ----------
class PublicClass {
    val publicProperty = "Public Property"

    fun publicFunction() {
        println("Public function")
    }
}

// ---------- PRIVATE & PROTECTED DI CLASS ----------
open class ParentClass {

    private val privateProperty = "Private Property"

    protected val protectedProperty = "Protected Property"

    fun showPrivate() {
        println(privateProperty)   // ✅ bisa (satu class)
    }
}

class ChildClass : ParentClass() {

    fun showProtected() {
        println(protectedProperty) // ✅ bisa (subclass)
        // println(privateProperty) // ❌ ERROR
    }
}

// ---------- MAIN FUNCTION ----------
fun main() {

    println("=== PRIVATE TOP LEVEL ===")
    privateTopLevel()  // ✅ bisa (satu file)

    println("\n=== INTERNAL ===")
    val internalObj = InternalClass()
    println(internalObj.internalProperty) // ✅
    internalObj.internalFunction()        // ✅

    println("\n=== PUBLIC ===")
    val publicObj = PublicClass()
    println(publicObj.publicProperty) // ✅
    publicObj.publicFunction()        // ✅

    println("\n=== PRIVATE & PROTECTED ===")
    val child = ChildClass()
    child.showPrivate()    // ✅ via public function parent
    child.showProtected()  // ✅ via subclass
}
