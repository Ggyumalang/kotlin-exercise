package com.example.kotlin

import java.util.TreeMap

fun main() {
    val binaryReps = TreeMap<Char, String>()

    for(c in 'A'..'Z') {
        val binary = Integer.toBinaryString(c.code)
        //map 사용 시 해당하는 키에 값을 넣는 형태
        binaryReps[c] = binary
    }

    for((key, value) in binaryReps) {
        println("문자: $key, 아스키코드: $value")
    }

    println("문자입니까? ${isLetter('1')}")
    println("문자입니까? ${isLetter('a')}")
    println("문자입니까? ${isLetter('A')}")
    println("숫자입니까? ${isNotDigit('A')}")
    println("숫자입니까? ${isNotDigit('1')}")
    println("무엇입니까? ${recognize('1')}")
    println("무엇입니까? ${recognize('h')}")
    println("무엇입니까? ${recognize('$')}")
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c in '0'..'9'

fun recognize(c: Char) = when(c) {
    in '0'..'9' -> "숫자"
    in 'a'..'z', in 'A'..'Z' -> "알파벳"
    else -> "숫자도 알파벳도 아님"
}