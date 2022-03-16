package app

fun main(){

    //------
    // ARRAY
    //------

    val listWithArray: Array<String> = arrayOf("Array 1","Array 2","Array 3")
    val listWithArrayOfNull:Array<String?> = arrayOfNulls(5)
    listWithArrayOfNull[0] = "Array 1"
    listWithArrayOfNull[1] = "Array 2"
    listWithArrayOfNull[2] = "Array 3"
    listWithArrayOfNull[3] = "Array 4"
    listWithArrayOfNull[4] = "Array 5"


    //------
    // LIST
    //------

    val listWithList: List<String> = listOf("List 1","List 2","List 3")
    val listWithMutableList:MutableList<String> = mutableListOf("List 1","List 2","List 3")
    println(listWithMutableList[0]) // get
    listWithMutableList[0] = "edited" // set
    println(listWithMutableList[0]) // get after set
    println(listWithMutableList.size)
    listWithMutableList.remove("List 3")
    println(listWithMutableList.size)



}