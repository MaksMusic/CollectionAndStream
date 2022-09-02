fun main() {
//после вызова функции also и изменении объекта данная функция возвращает объект student
//то-есть можно изменить объект и продолжить с ним работать


    //example1
    var student = Student("Jeri", "Maus", 11)
    println(student.also { studentLamda ->
        studentLamda.name = studentLamda.name.uppercase() + " - name "
    }.name)


}