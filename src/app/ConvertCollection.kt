package app

fun main(){

  val listWithArray: Array<Int> = arrayOf(4,1,1,2,3)
    val convertListToMutableList:MutableSet<Int> = listWithArray.toSortedSet()

    val listWithDataRange = 1 .. 100
    val convertDataRangeToMutableList = listWithDataRange.toMutableList()

    for (item in convertDataRangeToMutableList){
        println(item)
    }



}