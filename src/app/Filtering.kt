package app

fun main() {

    val list = listOf<String>("Sandrian","A","Hafid Dwi Adha")
    val items = listOf<Any?>(null,1,"Strinag",2,null,"sandrian")

    val result1 = list.filter { it.length > 5 }
    val result2 = list.filterIndexed{ index, _ -> index % 2 == 1 }
    val result3 = items.filterNotNull()
    val result4 = items.filterIsInstance<String>()
    val result5 = items.filterIsInstance<Int>()


}