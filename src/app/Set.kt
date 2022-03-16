package app

class Person(val name:String){

    override fun hashCode():Int =  this.name.hashCode()

    override fun equals(other: Any?): Boolean {
        return when(other){
            is Person -> other.name == this.name
            else -> false
        }
    }

}

fun main() {

    val person1 = Person("Sandrian")
    val person2 = Person("Sandrian")
    val person3 = Person("Hafid")

    val listOfSet: Set<Person> = setOf(person1, person2, person3)
    val listOfMutableSet: MutableList<Int> = mutableListOf()

    listOfMutableSet.addAll(listOf(1,2,3))

    println(listOfMutableSet.size)
}