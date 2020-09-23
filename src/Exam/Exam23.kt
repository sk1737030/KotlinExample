package Exam

/**
 * 옵저버 패턴
 * Event 같은 녀석을 위한 프로그래밍 패턴
 *
 */
fun main() {
    EventPrinter().start()
    AnonymousPrinter().start()
}

interface EventListener {
    fun onEvent(count: Int)
}

class Counter23(var listener: EventListener) {
    fun count() {
        for (i in 1..100) {
            if (i % 5 == 0) {
                listener.onEvent(i)
            }
        }
    }
}

class EventPrinter : EventListener {
    override fun onEvent(count: Int) {
        print("${count}")
    }

    fun start() {
        val counter = Counter23(this)
        counter.count()
    }
}

class AnonymousPrinter {
    fun start() {
        val counter = Counter23(object: EventListener{
            override fun onEvent(count: Int) {
                print("${count}-")
            }
        })
        counter.count()
    }
}
