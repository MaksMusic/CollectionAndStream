fun main() {


    val title = "The Robots from Planet X3"
    val newTitle = title
        .removePrefix("The ") // удалить начало строки
        .let { element -> "'$element'" }
        .uppercase() // верхний регистр

    println(newTitle)

}