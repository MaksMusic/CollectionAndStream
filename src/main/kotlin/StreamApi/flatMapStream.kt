package StreamApi

fun main() {

    //flatMapTo возвращает новую коллекцию с новым типом данных
    //берел элемент из коллекции и получает из него нужный тип данных и присваивает в новую коллекцию

    var list = mutableListOf<Int>()
    val letters = mutableListOf<String>("This", "Is", "An", "Example")
        .flatMapTo(list) { n -> n.indices}
        .filter { c -> c > 0 }


    println(list)
    println(letters)
}
