package StreamApi

fun main() {

    var list = mutableListOf<Int>()
    val letters = mutableListOf<String>("This", "Is", "An", "Example")
        .flatMapTo(list) { n -> n.indices}
        .filter { c -> c > 0 }


    println(list)
}
