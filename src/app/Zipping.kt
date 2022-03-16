package app

fun main() {
    val list1 = listOf<String>("Sandrian","Syafri","Test")
    val list2 = listOf<String>("Hafid","Dwi")

    val zippingList1AndZList2: List<Pair<String,String>> = list1.zip(list2)
    val zippingList1AndList2WithTransform : List<String>  = list1.zip(list2){
        list1, list2 ->
        "$list1-$list2"
    }

}