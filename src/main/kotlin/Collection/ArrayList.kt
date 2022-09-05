package Collection

import Student

fun main() {
    // Изменяемые коллекции MutableIterable
    var list = ArrayList<Student>(25) // все студенты
    list.add(Student("Jon", "Lachetti", 2))
    list.add(Student("Tom", "Skoletta", 2))
    list.add(Student("Katy", "Lermantova", 3))
    list.add(Student("Anna", "Stivina", 3))
    list.add(Student("Halk", "Grandsinov", 1))
    list.add(Student("MisterX", "Jesikson", 1))

    var  listArray  = arrayListOf<String>("1","2","1")
    listArray.add("1")
    println(listArray)




    var list2 = ArrayList<Student>(25) //студенты сдавшие зачет
    list2.add(Student("Tom", "Skoletta", 2))
    list2.add(Student("Anna", "Stivina", 3))
    list2.add(Student("MisterX", "Jesikson", 1))

    var listPassedTheExam = ArrayList<Student>()
    listPassedTheExam.addAll(list) // копирование листа

    //удалить лист из листа
    list.removeAll(list2) // список на отчисление
    list.forEach({ println("$it  - отчисление") })

    println()

    // список студентов на след курс
    listPassedTheExam.retainAll(list)
    list2.forEach({ println("$it  - переход на след курс") })


    //поиск поступивших студентов
    //добавление объекта
    var studentTomas = Student("Tomas", "Vesikson", 1)
    listPassedTheExam.add(studentTomas)

    //поиск объекта по ссылке
    var search = listPassedTheExam.contains(studentTomas)
    println(search)


//  Не изменяемые коллекции
    var listTwo = listOf<Student>(
        Student("Tomas", "Janro", 1),
        Student("Tomas", "Janro", 1),
        Student("Tomas", "Janro", 1),
        Student("Tomas1", "Janro1", 2),
        Student("Tomas11", "Janro11", 1)
    )
    println(listTwo.lastIndex)
    println(listTwo.size)
    println(listTwo.get(2).name)

    // если вызвать функцию у изменияемой коллекции то вернет изменяемую коллекцию
    // если вызвать функцию у не изменияемой коллекции то вернет не изменяемую коллекцию
    var sub = listTwo.subList(1,5)
    println(sub)

}

