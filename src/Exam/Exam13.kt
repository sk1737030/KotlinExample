package Exam

/**
 * 오버라이딩
 */
fun main() {
    var t = Tiger()
    t.eat()
}

open class Animal13 {
    // 슈퍼클래스에서 open 으로 오버라이드 가능하게해줌 public 느낌
    open fun eat() {
        println("음식을 먹습니다")
    }
}

class Tiger : Animal13() {
    override fun eat() {
        println("고기를 먹습니다.")
    }
}