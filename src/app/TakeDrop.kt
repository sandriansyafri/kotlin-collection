package app

fun main() {
    val list = listOf<Int>(1,1,2,1,3,1,4,2,5,4,8)
    val take1 = list.take(3)
    val take2 = list.takeLast(3)
    val take3 = list.takeLastWhile { it -> it % 2 == 0 }

    val drop1 = list.drop(3)
    val drop2 = list.dropLast(3)

}