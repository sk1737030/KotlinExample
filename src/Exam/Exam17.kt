package Exam

/**
 * 스코프
 *
 * 패키지 {
 *  변수
 *  함수
 *  클래스
 * }
 * 1. 패키지가 같다면 같은 스코프에서 공유가능하다.
 * 2. 하위 클래스에서 변수를 재 정의하면 그 변수를 따른다.
 *
 *
 * 패키지 스코프
 * public(기본값) 어떤패키지에서도 접근가능
 * internal 같은 모듈내에서만 접근 가능
 * private 같은 파일 내에서만 접근 가능
 *
 * 클래스 스코프
 * public 클래스 외부에서 늘 접근 가능
 * private 클래스 내부에서만 접근 가능
 * protected 클래스 자신과 상속받은 클래스에서 접근가능
 */
private val a = "패키지 스코프"
fun main() {
    println(a)
    B().print();
}

class B {
    fun print() {
        println(a)
    }
}



