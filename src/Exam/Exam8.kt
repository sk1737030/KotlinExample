package Exam

/**
 * 흐름제어와 논리연산자
 */
fun main() {
    for (i in 0..10) {
        if (i == 3) break
        println(i)
    }

    loop@ for (i in 0..10) {
        for (j in 1..10) {
            if (i == 1 && j == 2) break@loop
            println("i : $i, j : $j")
        }
    }
}