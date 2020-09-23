package Exam

/**
 * 고차함수
 * 함수를 마치 클래스에서 만들어 낸 인스턴스처럼 취급하는 방법
 * 함수를 파라미터로 넘길 수 있고 반환값으로 받을 수 있다.
 *
 * 람다함수
 */
fun main() {
    b(::a) // 고차함수로 넘길 때 "::함수명" 사용

    // 람다식 str 은 변수가 된다.
    val c: (String) -> Unit = { str: String -> println("$str 람다함수") }
    b(c)
}

fun a(str: String) {
    println("$str 함수 a")
}

// fun b (함수를받을파라미터명:(자료형,...) -> 반환형
// Unit == void
fun b(function: (String) -> Unit) {
    function("b가 호출한")
}