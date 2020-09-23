package Exam

/**
 * 클래스의 생성자
 */
fun main() {
    var b = PersonInit("홍길동", 20)
    var c = PersonInit("김길동", 20)

    var d = PersonInit("이길동")
    var e = PersonInit("사길동")
    var f = PersonInit("호길동")
}

class PersonInit(var name: String, val birthYear: Int) {
    init {
        println("${this.birthYear}년생 ${this.name}님이 생성")
    }
    
    
    // 보조생성자 : this로 기본생성자를 호출
    constructor(name: String) : this(name, 1997){
        println("보조 생성자가 사용되었습니다.")
    }
}