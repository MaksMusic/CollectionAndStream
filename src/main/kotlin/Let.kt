fun main() {


    val title = "The Robots from Planet X3"
    val newTitle = title
        .removePrefix("The ") // ������� ������ ������
        .let { element -> "'$element'" }
        .uppercase() // ������� �������

    println(newTitle)

}