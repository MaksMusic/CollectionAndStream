package Collection

import java.util.*

fun main() {
    var list = LinkedList<String>()
    list.add("Tima")
    list.add("Jima")
    list.add("Kima")
    list.add("Alia")
    list.add("Anna")
    list.add("Zero")
    list.sort() // использует алгоритм сортировки слиянием (merge sort)
    list.remove("Anna")
    list.removeFirst() // удалить первый элемент
    println(list.contains("Jima")) //проверка есть ли елемент в листе
    println(list.lastIndex) //индекс последнего элемента
    //list.clear()



    println(list)
}


