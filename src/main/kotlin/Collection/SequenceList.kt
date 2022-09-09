package Collection

fun main() {
    var list = sequenceOf<String>("Tom","Jimm","Kia","Senneor"  )
    println(list.joinToString())

    var list2 = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    var s = list2.asSequence()
    println(s.joinToString())

    //последовательности с 2 до 10
    var nomber1 = 0
    var numbers1 = generateSequence { nomber1 += 2;nomber1}
    println(numbers1.take(5).joinToString())
    //или

    var nomber2 = 0
    var numbers2 = generateSequence { nomber2 += 2; if(nomber2 > 10) null else nomber2}
    println(numbers2.joinToString())
    //или

    var numbers3 = generateSequence(5) { if (it == 25) null else it+5 }
    println(numbers3.joinToString())


}