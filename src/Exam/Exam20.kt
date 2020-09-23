package Exam

/**
 * 스코프함수
 * apply
 * also
 * 처리가 끝나면 인스턴스를 반환
 * run
 * let
 * 처리가 끝나면 최종값을 반환환
 * apply, also vs run, let
 * apply와 run을 인스턴스참조로 사용한다면
 * run,let은  it을 통해서 인스턴스를 사용가능하다
 * 람다함수는 인스턴스내에 변수보다
 * 클래스의 변수를 우선순위가 높다
 * 그래서 이럴 때 also함수와 let함수를 사용해서 처리한다.
 */
fun main() {
    // apply 함수로 init 효과를 낼 수 있다.
    // apply는 인스턴스 자신을 다시 반환한다.
    var a = Book("테스트", 1000).apply {
        name = "[초특가]" + name
        discount()
    }

    // run
    // 일반람다함수처럼 인스턴스 대신에 마지막에 반환받을 수 있다.
    // 이미 인스턴스가 만들어진후에 인스턴스의 함수나 속성을
    // scope 내에서 사용해야 할 때  유용하다.
    a.run {
        println("상품명: ${name}, 가격: ${price}원")
    }
    a.also {
        println("상품명: ${it.name}, 가격: ${it.price}원")
    }
    a.let {
        println("상품명: ${it.name}, 가격: ${it.price}원")
    }
    // with
    // run 과 동일한 기능을 가지지만
    // 단지 인스턴스를 참조연산자대신 파라미터로 받는다
    with(a) {
        println("[초특카]상품명: ${name} , 가격: ${price}원")
    }

}

class Book(var name: String, var price: Int) {
    fun discount() {
        price -= 100
    }
}