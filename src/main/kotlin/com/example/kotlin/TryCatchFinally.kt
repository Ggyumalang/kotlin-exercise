package com.example.kotlin

fun main() {
    testTryCatchFinally("1")
}

fun testTryCatchFinally(numStr: String) : Int = try {
    Integer.parseInt(numStr)
} catch (e: Exception) {
    throw e
} finally {
    println("결국 이거다 이거야!! $numStr")
}