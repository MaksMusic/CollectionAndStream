
//��� � � ������ � run()and with(), let()������� ���������� ��������� ������-���������
fun main() {
//example 1
    var student  = Student("Jeki","Chan" , 7)
    var infoStudent = ""
    student.let { student -> student.name = student.name.uppercase() }

//example 2
    student.let {  studentLamda ->
        infoStudent =  "name - "+ studentLamda.name  + " surname - " + studentLamda.surname
    }
    println(infoStudent)

//example 3
    val title = "The Robots from Planet X3"
    val newTitle = title
        .removePrefix("The ") // ������� ������ ������
        .let { element -> "'${element.length}'" }
        .uppercase()
        // ������� �������

    println(newTitle)

}