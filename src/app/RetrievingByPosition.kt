package app

fun main() {


    val listOfSet = setOf<String>("Sandrian","Syafri","Hafid")

    println(listOfSet.elementAt(1))
    println(listOfSet.first())
    println(listOfSet.last())
    println(listOfSet.elementAtOrNull(5))
    println(listOfSet.elementAtOrElse(0){ it -> "NOT FOUND" })

}