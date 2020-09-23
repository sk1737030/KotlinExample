package Exam

/**
 * 함수
 */
fun main() {
    println(add(5,6,7))
    println(add2(5,6,7))
}

// 마지막 반환하는 값이 와야함.
fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c;
}
/**
 * 단일 표현식
 * 단일표현식 함수 반환형의 타입추론을 가능하므로 반환형은 생략가능
 */

fun add2(a: Int, b: Int, c: Int)= a + b + c