package Exam

fun main() {
    var a = 7

    if (a > 10) {
        println("a는 10보다 크다")
    } else {
        println("a는 10보다 작거카 같다")
    }

    if (a is Int) {
        println("a는 Int다")
    }else{
        println("a는 Int아니다")
    }

    doWhen(1)
    doWhen(1L)
    doWhen("dimo")

    // return
    var do1 = doWhen2(1)
    doWhen2(1L)
    doWhen2("dimo")


}
// Any 어떠한 자료형이라도 받을 수 있다.
fun doWhen (a: Any) {
    when(a) {
        1 -> println("정수 1입니다")
        "DiMo" -> println("디모의 코틀린 강좌입니다")
        is Long -> println("Long 타입 입니다")
        !is String -> println("String 타입이 아닙니다")
        else -> println("어떤 조건도안맞음")
    }
}

// 값 return
fun doWhen2 (a: Any) {
    when(a) {
        1 -> " 정수 1 입니다. "
        "DiMo" -> "코틀린 "
        is Long -> "Long타입"
        !is String -> "String 이 아닙니다."
        else -> "어떤 조건도 만족하지 안는다."
    }
}