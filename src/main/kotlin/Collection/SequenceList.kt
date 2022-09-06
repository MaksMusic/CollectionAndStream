package Collection

fun main() {
    var list = sequenceOf<String>("Tom","Jimm","Kia","Senneor"  )

   list.asSequence().run {
     this.forEach { println(it) }
   }

    list.run {
        println(this)
    }
    println(list.asSequence())
}