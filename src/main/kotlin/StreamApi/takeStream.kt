package StreamApi

fun main() {
    //возвращает новую коллекции с указанным количеством элементов
    var box1 = listOf<Int>(1,2,3,4,5,6,7,8,32,2,21,1,4,5,6,7,23,31,1,1,3,77)
    box1.take(5).forEach { print("$it ") }

    println()
    println(box1)
}