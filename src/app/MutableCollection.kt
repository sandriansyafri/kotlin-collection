package app


fun <T> displayMutableCollection(collection: MutableCollection<T>){
    for (element in collection){
        println(element)
    }
}

fun main(){
    val items: Collection<String> = listOf("Sandrian","Syafri")
    displayMutableCollection(items.toMutableList())

}