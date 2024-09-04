package com.example.kotlin

fun main() {
    //1~10까지 for문
    for(i in 1..10) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }

    for(i in 10 downTo 1 step 3) {
        println(i)
    }

    for(i in 1..10 step 3) {
        println(i)
    }

    println(evenOrOdd(2))

}

fun evenOrOdd(n: Int) = when {
    n % 2 == 0 -> "even"
    else -> "odd"
}