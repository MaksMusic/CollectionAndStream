package Collection

fun main() {
    var list = sequenceOf<String>("Tom","Jimm","Kia","Senneor"  )

   list.asSequence().run {
       println(this.toString())
   }

    list.run {
        println(this)
    }
    println(list.asSequence())
}