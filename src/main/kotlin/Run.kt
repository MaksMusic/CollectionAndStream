

fun main() {
    //example 1
    val student = Student("Tom","Joni",7)
    var infoStudent = ""
    student.run {
        infoStudent =  "$name  - name , $surname - surname ,$group - group "
    }
    println(infoStudent)

    //example 2
    val title = "The Robots from Planet X3"
    val newTitle = title
        .removePrefix("The ") // удалить начало строки
        .run { "'$this'" }
        .uppercase()    // верхний регистр

    println(newTitle)
}