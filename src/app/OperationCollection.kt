package app


fun <T> loopItems(collection: Collection<T>){
    collection.forEach(){item:T -> println(item) }
}

fun <T> loopItemsWithIndexed(collection: Collection<T>){
    collection.forEachIndexed(){index,item ->
        println("$item - ($index)")

    }

}



fun main(){

    val data1 = listOf<Int>(1,2,4,4,1,12,3).toSet()
    val data2 = listOf<String>("A","B","C","C","D","E","E").toSet()

    loopItems(data1)
    loopItemsWithIndexed(data2)


}