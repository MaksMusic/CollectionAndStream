package Collection

import Student

fun main() {

    var list = ArrayList<Student>(25) // ��� ��������
    list.add(Student("Jon","Lachetti",2))
    list.add(Student("Tom","Skoletta",2))
    list.add(Student("Katy","Lermantova",3))
    list.add(Student("Anna","Stivina",3))
    list.add(Student("Halk","Grandsinov",1))
    list.add(Student("MisterX","Jesikson",1))


    var list2 = ArrayList<Student>(25) //�������� ������� �����
    list2.add(Student("Tom","Skoletta",2))
    list2.add(Student("Anna","Stivina",3))
    list2.add(Student("MisterX","Jesikson",1))

    var listPassedTheExam = ArrayList<Student>()
        listPassedTheExam.addAll(list) // ����������� �����

    //������� ���� �� �����
    list.removeAll(list2) // ������ �� ����������
    list.forEach( { println("$it  - ����������")})

    println()

    // ������ ��������� �� ���� ����
    listPassedTheExam.retainAll(list)
    list2.forEach({ println("$it  - ������� �� ���� ����")})


    //����� ����������� ���������
    //���������� �������
    var studentTomas = Student("Tomas","Vesikson",1)
    listPassedTheExam.add(studentTomas)

    //����� ������� �� ������
   var search  = listPassedTheExam.contains(studentTomas)
    println(search)




}

