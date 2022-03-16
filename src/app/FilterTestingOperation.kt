package app

fun main() {
    val list = listOf<String>("Sandrian","Syafri")
//    println(list.any()) // no transform or condition
//    println(list.any { it.length > 6}) // with transform or condition

//    println(list.none())
    println(list.none { value ->
        value.length > 5
    })

}