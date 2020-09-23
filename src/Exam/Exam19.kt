package Exam

/**
 * 람다함수
 * 1. 람다함수도 여러 구문을 수행 가능하다.
 *
 */
fun main() {
    var c: (String) -> Unit = { str ->
        println("$str 람다함수")
        println("여러 구문을")
        println("실행 할 수 있다.")
    }

    var calculate:(Int,Int) -> Int = {a,b ->
        println(a)
        println(b)
        a+b
    }
    // 람다는 마지막 구문인  a+b의 값을 Int로 반환한다.

    // 파라미터가 없을경우
    var a:() -> Unit = {println("패러미터가없습니다.")}

    // 파라미터가 하나 뿐이라면 it 사용
    val d: (String) -> Unit = { println("${it} 람다함수")}
    d("aa")

}