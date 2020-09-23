package Exam

/**
 * 인터페이스
 * 코틀린에서의 인터페이스는 추상함수와 일반함수를 가질 수 있다.
 * override로 재구현 할 수 있음.
 */
fun main() {
    var a = Dog15()
    a.eat()
    a.run()
}

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("음식을 먹습니다")
    }
}

class Dog15 : Runner, Eater {
    override fun run() {
        println("우다다다다")
    } 
}