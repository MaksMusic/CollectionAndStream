package Collection

fun main() {
    // Изменяемые коллекции MutableIterable
    var setList = HashSet<String>(21)
    setList.add("Joni")
    setList.add("Joni")
    setList.add("Joni2")
    setList.add("Joni")
    setList.add("Joni1")
    setList.remove("Joni2")
    println(setList)

    var setList2  = mutableSetOf<String>("Jino","Francisko","Enmili","Jino","Enmili")
    println( setList2.add("Brasko"))
    println(setList2.add("Seena"))
    println(setList2)

    // Неизменяемые коллекции
    var setOf = setOf<String>("Joni","Tomy","Katy")
    println(setOf.contains("Joni"))
    println(setOf.size)
    println(setOf.isEmpty())
    println(setOf)


}