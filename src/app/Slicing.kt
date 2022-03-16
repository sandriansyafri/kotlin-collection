package app

fun main() {
    val list = (0..50).toList()
    val slicing1 = list.slice(0..10)

    val list2 = (0 .. 20).toList()
    val slicing2 = list2.slice(10 downTo  5)
    println(list2)
    println(slicing2)
}