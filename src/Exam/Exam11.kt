package Exam

/**
 * 클래스 상속
 * open을 써야한다
 * 1. 슈퍼클래스에서 존재하는 속성과 서브 클래스 속성에서 존재하는 속성의 이름은 같을 수 없다.
 * 2. 서브클래스가 생성 될 때에는 반드시 슈퍼클래스의 생성자까지 호출되어야한다.
 */
fun main() {
    var a = Animal("별이", 10, "개")
    var b = Dog("별이", 10)
    var c = Cat("냥이", 10)

    a.introduce()
    b.introduce()
    b.bar()
    c.introduce()
    c.bar()
}

open class Animal(var name: String, var age: Int, var type: String) {
    fun introduce() {
        println("저는 ${type} ${name}이고, ${age}살 입니다.")
    }
}

class Dog(name: String, age: Int) : Animal(name, age, "개") {
    fun bar() {
        println("멍멍")
    }
}

class Cat(name: String, age: Int) : Animal(name, age, "고양이") {
    fun bar() {
        println("야옹")
    }
}