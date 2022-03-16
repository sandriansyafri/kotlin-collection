package app

fun main() {
    val list1 = listOf<String>("Satu","Dua","Tiga")

    val map1 = list1.associate { Pair(it,it.uppercase()) }
    val map2 = list1.associateWith { it.uppercase() }
    val map3 = list1.associateBy { it.uppercase() }

    println(map3)
}