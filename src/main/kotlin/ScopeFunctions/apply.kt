fun main() {

//����� ������ ������� apply � ��������� ������� ������ ������� ���������� ������ student
//������� �� also � ������ ������� ���������� this

    var student = Student("Tomas","Dominicano",7)
    println(student.apply {
        name = name.uppercase()
        surname = surname.uppercase()
    }.name + " " + student.surname)

}