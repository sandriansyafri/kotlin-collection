package app

fun main() {
    val list = listOf<String>("Sandrian","Syafri","test","HEhehehehehehe","a")
    val (listFound, listNotFound) = list.partition { it.length > 5 }
    println(listFound)
    println(listNotFound)
}