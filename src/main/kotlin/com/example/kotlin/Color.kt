package com.example.kotlin

import com.example.kotlin.Color.*
import java.lang.RuntimeException

fun main() {
    println("RED is ${getKoreanColorName(RED)}")
    println("GREEN is ${getKoreanColorName(GREEN)}")
    println("BLUE is ${getKoreanColorName(BLUE)}")
    println("ORANGE is ${mix(RED, YELLOW)}")
    println("GREEN is ${mix(YELLOW, BLUE)}")
}
//가장 간결한 enum class
enum class Color {
    RED, GREEN, BLUE, YELLOW
}

//프로퍼티와 메서드를 갖는 enum class
//enum class Color(val r: Int, val g: Int, val b: Int) {
//    RED(255,0,0),
//    ORANGE(255,166,0),
//    YELLOW(255,255,0),
//    GREEN(0,255,0);
//
//    fun rgb() = (r * 256 + g) * 256 + b
//}

fun getKoreanColorName(color: Color) = when(color) {
    RED -> "빨간색"
    GREEN -> "녹색"
    BLUE -> "파란색"
    YELLOW -> "노란색"
}

//인자가 없는 when
fun mix(c1: Color, c2: Color) =
    when {
        c1 == RED && c2 == YELLOW -> "오렌지"
        c1 == YELLOW && c2 == BLUE -> "녹색"
        else -> throw RuntimeException()
    }