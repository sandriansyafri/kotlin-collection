package app

class Student(val name:String, val hobbies: List<String>)

fun main() {
    val listOfList: List<List<String>> = listOf(
        listOf("Sandrian","Syafri"),
        listOf("Hafid","Dwi","Adha"),
        listOf("Fikri","Algifari")
    )

    val lists = listOfList.flatten()

    val listOfStudent: List<Student> = listOf(
        Student("Sandrian", listOf("A","B","C")),
        Student("Hafid", listOf("D","E","F")),
        Student("Fikri", listOf("G","H","i")),
    )

    val listStudent = listOfStudent.flatMap { it.hobbies }
    println(listStudent)

}