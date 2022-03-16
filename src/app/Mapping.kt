package app

fun main(){

  val from1To20 = 1 .. 20
    val toListFrom1To20  = from1To20.toList()

    val result = toListFrom1To20.mapNotNull { list ->
        if(list % 2 == 1) list
        else null
    }

    println(result)


}