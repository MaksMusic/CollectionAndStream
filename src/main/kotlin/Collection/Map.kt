package Collection

fun main() {
    // изменяемая коллекция
    var acc = HashMap<String,String>()
    acc.put("Login1","password1")
    acc.put("Login2","password2")
    acc.put("Login3","password3")
    acc.put("Login4","password4")
    acc.put("Login5","password5")
    acc.set("Login1" , "12345")

    println(acc)

    // неизменяемая коллекция
    var map = mapOf<String,String>("log1" to "pass1","log2" to "pass2")

}