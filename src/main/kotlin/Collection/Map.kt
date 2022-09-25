package Collection

fun main() {
    // изменяемая коллекция
    var n1 = mutableMapOf<String,String>("S1" to "123","S2" to "456" , "S3" to "7891011" )
    var n11 = LinkedHashMap<String,String>()
    var e11 = linkedMapOf<String,String>()
    var n2 = HashMap<String,String>()


    n11.putAll(n1)
    println(n11)

    n2.putAll(n1)
    println(n2)

    var acc = HashMap<String,String>()
    var acc2 = HashMap<String,String>()
    acc2.put("qqqqq","12345") // добавить элемент если ключ есть заменит по ключу элемент
    acc2.put("sssss","12345")
    acc2.put("sssss","1234578")
    println(acc2)

    acc.put("Login1","password1")
    acc.put("Login2","password2")
    acc.put("Login3","password3")
    acc.put("Login4","password4")
    acc.put("Login5","password5")                 // добавить элемент если ключ есть заменит по ключу элемент
    acc.putAll(acc2)                             //добавить другой map в конец списка
    acc.set("Login1" , "12345")                 //заменяет элемент по ключу
    acc["Login17"] =  "12345"                  //заменяет элемент по ключу или добавит новый элемент
    var s:String? = acc.remove("Login41") // удаляет и возвращает элемент если нет вернет null

    println(s)
    println(acc)

    // неизменяемая коллекция

    var map = mapOf<String,String>("log1" to "pass1","log2" to "pass2")
    var t = map.entries
    println(t)

    var map2 = mapOf<String,String>(
        "log1" to "pass1","log2" to "pass2",
        "log3" to "pass3","log4" to "pass4",
        "log5" to "pass5","log6" to "pass6",)

    for (entry in map2) {
        println(entry.value  + " - value " + entry.key+ " - key")
    }



}