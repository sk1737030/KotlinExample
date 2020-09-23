package Exam

/**
 * 리스트
 * listOf ==  Arrays.listOf
 * mutableListOf == ArrayList
 */
fun main() {
    val a = listOf("사과", "딸기", "배")

    for (fruit in a) {
        println(fruit)
    }

    println()

    val b = mutableListOf(6,3,1)

    b.add(4)
    println(b)
    b.add(2,8)
    println(b)
    b.shuffle()
    println(b)

    b.sort()
    println(b)

}