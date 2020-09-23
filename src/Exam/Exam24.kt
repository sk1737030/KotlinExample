package Exam

/**
 * 클래스의 다형성
 * as is
 *
 * is 캐스팅 연산자 instance of
 * as는 변수를 호환되는 자료형으로 변환해주고 담아넣기도 한다.
 * var d =  a as Cola //
 *
 */
fun main() {
    var a = Drink()
    a.drink()

    // upcasting
    var b: Drink = Cola()
    b.drink()

    // is는 조건문안에서만 다운캐스팅된다.
    if(b is Cola) {
        b.washDishes()
    }
    // b.washDishes() // 다운캐스팅이 안됨.
    var c = b as Cola

    c.washDishes()
    b.washDishes() // b도 다운캐스팅이된다.

}

open class Drink {
    var name = "음료"

    open fun drink() {
        println("${name}를 마십니다.")
    }
}

class Cola : Drink() {
    var type = "콜라"

    override fun drink() {
        println("${name}중에 ${type}를 마십니다")
    }

    fun washDishes() {
        println("${type}로 설거지를 합ㄴ디ㅏ.")
    }
}
