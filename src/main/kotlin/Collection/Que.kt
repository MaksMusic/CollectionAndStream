package Collection

import java.util.*
import kotlin.system.exitProcess

fun main() {
    var que = PriorityQueue<Int>()
    que.add(7)
    que.add(1)
    que.add(3)
    que.add(2)
    que.add(5)
    println(que.element()) //получить
    println(que)
    println(que.offer(11))
    println(que)
    println(que.remove())
    println(que)
}