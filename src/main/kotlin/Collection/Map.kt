package Collection

fun main() {
    // ���������� ���������
    var acc = HashMap<String,String>()
    var acc2 = HashMap<String,String>()
    acc2.put("qqqqq","12345")
    acc2.put("sssss","12345")
    acc2.put("sssss","1234578")  //���� ���� ���� ������� �� ����� �������
    println(acc2)

    acc.put("Login1","password1")
    acc.put("Login2","password2")
    acc.put("Login3","password3")
    acc.put("Login4","password4")
    acc.put("Login5","password5")
    acc.putAll(acc2) //�������� ������ map � ����� ������
    acc.set("Login1" , "12345")                 //�������� ������� �� �����
    var s:String? = acc.remove("Login41")  // ������� � ���������� ������� ���� ��� ������ null

    println(s)
    println(acc)

    // ������������ ���������
    var map = mapOf<String,String>("log1" to "pass1","log2" to "pass2")
    var t = map.entries
    println(t)

}