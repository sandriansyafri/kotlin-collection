package app

fun main(){

    val map1: Map<String,String> = mapOf(
        "name" to "Sandrian",
        "username" to "usernamme",
    )

    val map2 = map1.mapValues { it.value.uppercase() }
    for ((index,value) in map2 ){
        println(value)
    }

}