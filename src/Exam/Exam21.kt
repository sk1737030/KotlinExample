package Exam

/**
 * Object
 */
fun main() {

    println(Counter.count)

    Counter.countUp()
    Counter.countUp()

    println(Counter.count)

    Counter.clear()
}

// 인스턴스를 생성하지 않고 그 자체로 객체이다 singletone
object Counter {
    var count = 0

    fun countUp() {
        count++
    }

    fun clear() {
        count = 0
    }
}

