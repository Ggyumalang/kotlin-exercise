package com.example.kotlin

fun main() {
    // 둘 다 값을 채웠을 때..
    println(getMyName(firstName = "HanGyu", lastName = "Kim"))
    // 비어서 했을 때
    println(getMyName())
    println(getMyName("gyu"))
    println(getMyName(lastName = "han"))
}

fun getMyName(
    firstName: String = "foo",
    lastName: String = "bar"
) : String = "$firstName $lastName"

