package com.example.kotlin
fun main() {
    println("do".double())
    println("1".toInt())
    println("love".lastChar)

    println("This is very " add "good")

    // map iteration 시에 분해 접근
    persons.forEach{
        (name, isMarried) ->
            println("$name is married($isMarried)")
    }

    //isMarried 미사용 시
    persons.forEach {
        (name, _) ->
            println("$name is in this list")
    }

    //name 미사용 시
    persons.forEach {
            (_, isMarried) ->
        println("Did you get married? $isMarried")
    }
}

//확장 함수
fun String.double() = this + this
fun String.toInt(s: String) = Integer.parseInt(s)

//확장 프로퍼티
val String.lastChar: Char get() = get(this.length-1)

//중위호출
infix fun String.add(postfix: String) = this + postfix

//구조 분해 선언
val person = Pair("Snow", true)

val persons = mapOf (
    "Snow" to true,
    "Peter" to false,
    "Paul" to true
)


