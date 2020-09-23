package Exam

/**
 * Generic
 *
 * fun <T> generic
 * fun <T:superClass> supergeneric
 */
fun main() {
    UsingGeneric(A()).doshoutding()
    UsingGeneric(B25()).doshoutding()
    UsingGeneric(C25()).doshoutding()

    doshoutding(A())
}

fun <T: A> doshoutding(t: T) {
    t.shout()
}

open class A {
    open fun shout() {
        println("A가 t소리칩니다")
    }
}

class B25 : A() {
    override fun shout() {
        println("B가소리칩니다.")
    }
}

class C25 : A() {
    override fun shout() {
        println("C가 소리칩니다")
    }
}

// superCLass A가 받아진다.
class UsingGeneric<T : A>(val t: T) {
    fun doshoutding() {
        t.shout()
    }
}

