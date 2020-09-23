package Exam

/**
 * 추상화
 */
fun main() {
    var r = Rabbit();
    r.eat()
    r.sniff()
}

abstract class Animal14 {
    abstract fun eat()
    fun sniff() {
        println("킁킁")
    }
}

class Rabbit : Animal14() {
    override fun eat() {
        println("당근을 먹습니다.")
    }
}