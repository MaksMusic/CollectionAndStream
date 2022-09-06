package Collection

import java.util.*

fun main() {
    var queue = PriorityQueue<Int>()
    queue.add(7)
    queue.add(1)
    queue.add(3)
    queue.add(2)
    queue.offer(5)
    println(queue.element()) //получить
    println(queue)
    println(queue.offer(11))
    println(queue)
    println(queue.remove())
    println(queue)


var n = System.currentTimeMillis()

    for (i in 1..10001110){
        queue.offer(i)
    }

    println((System.currentTimeMillis() - n).toFloat() / 1000.0)




}