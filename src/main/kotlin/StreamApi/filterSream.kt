package StreamApi


fun main() {
    //���������� ��������� � ���������� ����� ����������
    var box1 = listOf<Int>(1,2,3,4,5,6,7,8,32,2,21,1,4,5,6,7,23,31,1,1,3,77)
    box1.filter { n -> n % 2 == 0}.forEach { print("$it ") }
    println()
    println(box1)


    //���������� � ��������� ��������� � ���������� ����� ����������
    var box11 = mutableListOf<Int>()
    box1.filterTo(box11) { n -> n % 2 != 0}.forEach { print("$it  ") }
    println()
    println(box11)
}