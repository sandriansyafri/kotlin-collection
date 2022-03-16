package app

fun <T> displayCollection(collection: Collection<T>){
    for (element in collection){
        println(element)
    }
}

fun main(){

    val listItem: List<String> = listOf("1","2","3");
    displayCollection(listItem)


}