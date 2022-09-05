package Collection

import Student

fun main() {
    // ���������� ��������� MutableIterable
    var list = ArrayList<Student>(25) // ��� ��������
    list.add(Student("Jon", "Lachetti", 2))
    list.add(Student("Tom", "Skoletta", 2))
    list.add(Student("Katy", "Lermantova", 3))
    list.add(Student("Anna", "Stivina", 3))
    list.add(Student("Halk", "Grandsinov", 1))
    list.add(Student("MisterX", "Jesikson", 1))

    var  listArray  = arrayListOf<String>("1","2","1")
    listArray.add("1")
    println(listArray)




    var list2 = ArrayList<Student>(25) //�������� ������� �����
    list2.add(Student("Tom", "Skoletta", 2))
    list2.add(Student("Anna", "Stivina", 3))
    list2.add(Student("MisterX", "Jesikson", 1))

    var listPassedTheExam = ArrayList<Student>()
    listPassedTheExam.addAll(list) // ����������� �����

    //������� ���� �� �����
    list.removeAll(list2) // ������ �� ����������
    list.forEach({ println("$it  - ����������") })

    println()

    // ������ ��������� �� ���� ����
    listPassedTheExam.retainAll(list)
    list2.forEach({ println("$it  - ������� �� ���� ����") })


    //����� ����������� ���������
    //���������� �������
    var studentTomas = Student("Tomas", "Vesikson", 1)
    listPassedTheExam.add(studentTomas)

    //����� ������� �� ������
    var search = listPassedTheExam.contains(studentTomas)
    println(search)


//  �� ���������� ���������
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

    // ���� ������� ������� � ����������� ��������� �� ������ ���������� ���������
    // ���� ������� ������� � �� ����������� ��������� �� ������ �� ���������� ���������
    var sub = listTwo.subList(1,5)
    println(sub)

}

