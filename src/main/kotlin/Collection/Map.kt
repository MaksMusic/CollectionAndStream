package Collection

fun main() {
    // изменяемая коллекция
    var acc = HashMap<String,String>()
    var acc2 = HashMap<String,String>()
    acc2.put("qqqqq","12345")
    acc2.put("sssss","12345")
    acc2.put("sssss","1234578")  //если ключ есть заменит по ключу элемент
    println(acc2)

    acc.put("Login1","password1")
    acc.put("Login2","password2")
    acc.put("Login3","password3")
    acc.put("Login4","password4")
    acc.put("Login5","password5")
    acc.putAll(acc2) //добавить другой map в конец списка
    acc.set("Login1" , "12345")                 //заменяет элемент по ключу
    var s:String? = acc.remove("Login41")  // удаляет и возвращаеь элемент если нет вернет null

    println(s)
    println(acc)

    // неизменяемая коллекция
    var map = mapOf<String,String>("log1" to "pass1","log2" to "pass2")
    var t = map.entries
    println(t)

}