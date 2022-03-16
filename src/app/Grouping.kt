package app

fun main() {

    val list= listOf<String>("Sandrian","Syafri","Hafid","Fikri","Yogi")
    val list2 = listOf<String>("a","a","b","b","cccccc","dddddd")
    val groupListBy1 = list.groupBy { it.length }
    val groupListBy2 = list2.groupBy { it }



}