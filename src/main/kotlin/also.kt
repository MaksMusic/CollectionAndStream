fun main() {
//����� ������ ������� also � ��������� ������� ������ ������� ���������� ������ student
//��-���� ����� �������� ������ � ���������� � ��� ��������


    //example1
    var student = Student("Jeri", "Maus", 11)
    println(student.also { studentLamda ->
        studentLamda.name = studentLamda.name.uppercase() + " - name "
    }.name)


}