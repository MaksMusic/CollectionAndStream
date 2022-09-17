package StreamApi

fun main() {
    // удаляет элемент если он найден только 1 элемент первый  который найдет
    val list = mutableListOf<String>()
    list.add("element1")
    list.add("element2")
    list.add("element3")
    list.add("element4")
    list.add("element5")
    list.add("element6")
    list.add("element7")

    list.remove(list.find { list.indexOf(it) == 1  }) // удаляет элемент с индексом 1 если он есть
    println(list.find { it == "element5" })


    println(list)

}