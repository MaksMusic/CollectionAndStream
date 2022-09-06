package Collection

fun main() {
    var list = listOf<String>("joni","Jimy")
    var massiv:Array<String> = list.toTypedArray()

    massiv.forEach { println(it) }
}