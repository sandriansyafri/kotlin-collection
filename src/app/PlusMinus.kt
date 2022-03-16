package app

class PersonTwo(val name: String)

fun main() {
    val list1 = listOf<String>("Sandrian","Syafri")
    val list2 = list1 + "Hafid"
    println(list1)
    println(list2)

    val list3 = listOf<Int>(1,2,2,3,4,5)
    val list4 = listOf<Int>(1,1,1,1,1,1)
    val list5 = list3 + list4

    val list6 = listOf<PersonTwo>(
        PersonTwo("Sandrian"),
        PersonTwo("Hafid")
    )

    val list7 = list6 -PersonTwo("Hafid")
    println(list7)
}