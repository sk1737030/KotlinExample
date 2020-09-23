package Exam

/**
 * 반복문과 증감연산자
 */
fun main() {
    var a = 0

    while (a < 5) {
        println(a++);
    }

    do {
        println(a++)
    } while (a < 5)

    for(i in 0..9)
        print(i)

    for(i in 0..9 step 2)
        print(i)
    
    // char 자료형에도 사용가능하다 미쳤따
    for(i in 'a'..'e')
        print(i)


}