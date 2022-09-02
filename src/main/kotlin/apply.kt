fun main() {

//после вызова функции apply и изменении объекта данная функция возвращает объект student
//отличие от also в люмбда функции использует this

    var student = Student("Tomas","Dominicano",7)
    println(student.apply {
        name = name.uppercase()
        surname = surname.uppercase()
    }.name + " " + student.surname)

}