package app

fun main() {
    val list1 = listOf<String>("Sandrian","Syafri")
    val string1 = list1.joinToString(" ","| "," |")

    val listNumber = 1..10
    val string2 = listNumber.joinToString()
    println(string2)

    val builder = StringBuilder()
    list1.joinTo(builder," ")
    list1.joinTo(builder,"-")
    println(builder.toString())
}