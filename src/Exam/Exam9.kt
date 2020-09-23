package Exam

/**
 * 클래스의 기본 구조
 */
fun main() {
    var a = Person("박보영", 1990)
    var v = Person("김구국", 1990)
    var c = Person("홍길동", 19910)

    println("안녕하세요, ${a.birthYear}년생 ${a.name}")
    a.introduce()
}

class Person(var name: String, val birthYear: Int) {
    fun introduce() {
        println("안녕하세요. ${name}이고 ${birthYear}입니다.")
    }
}