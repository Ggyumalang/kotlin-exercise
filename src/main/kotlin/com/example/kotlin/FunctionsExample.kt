package com.example.kotlin

val set = setOf(1,2,3)
val list = listOf("a","b","c")
val map = mapOf(
    1 to "One",
    2 to "Two",
    3 to "Three"
)
fun main() {
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    println(set)
    println(list)
    println(map)
    println(map[1])
}