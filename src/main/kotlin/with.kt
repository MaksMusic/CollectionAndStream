fun main() {
    var student  = Student("Joni","Skaletto",7)
    var infoStudent = ""

    with(student){
        infoStudent = " ${name.uppercase()} surname $surname"
    }

    println(infoStudent)
}