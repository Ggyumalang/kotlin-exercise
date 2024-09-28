package com.example.kotlin

data class User2(
    val userName: String,
    val age: Int
)

fun main() {
    println(User2("hey",1))
}