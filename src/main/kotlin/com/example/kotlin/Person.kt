package com.example.kotlin

fun main() {
    val developer = Developer("test", true, "Kotlin")
    val marketer = Marketer("tester", false, Division.DIGITAL)

    println(developer.language)
    println(marketer.division)
}

sealed class Person (
    val name: String,
    var isMarried: Boolean
)

class Developer (
    name: String,
    isMarried: Boolean,
    val language: String
) : Person (
    name,
    isMarried
)

class Marketer (
    name: String,
    isMarried: Boolean,
    val division: Division
) : Person (
    name,
    isMarried
)

enum class Division {
    CONTENTS, DIGITAL, BRAND
}

fun printSpecialSkill(person: Person) =
    when(person) {
        //smart case 덕분에 Developer 로 추가 형변환 필요 x language 프로퍼티 사용 가능
        is Developer -> println(person.language)
        //smart case 덕분에 Marketer 로 추가 형변환 필요 x division 프로퍼티 사용 가능
        is Marketer -> println(person.division)
    }