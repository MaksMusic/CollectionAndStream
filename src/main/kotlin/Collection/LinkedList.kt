package Collection

import java.util.*

fun main() {
    // ���������� ��������� MutableIterable
    var list = LinkedList<String>()
    list.add("Tima")
    list.add("Jima")
    list.add("Kima")
    list.add("Alia")
    list.add("Anna")
    list.add("Zero")
    list.sort() // ���������� �������� ���������� �������� (merge sort)
    list.remove("Anna")
    list.removeFirst() // ������� ������ �������
    println(list.contains("Jima")) //�������� ���� �� ������� � �����
    println(list.lastIndex) //������ ���������� ��������
    //list.clear()



    println(list)
}


