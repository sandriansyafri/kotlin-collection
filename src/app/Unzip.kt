package app

fun main() {

  val list1 = listOf<String>("A","B","C")
    val list2 = listOf<String>("1","2","3")

    val dataZip = list1.zip(list2)

  val (first,second) = dataZip.unzip()




}