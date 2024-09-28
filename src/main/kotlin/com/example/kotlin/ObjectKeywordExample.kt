package com.example.kotlin


data class Person2 (
    val name: String,
    val age: Int
)

object Family {
    val members = mutableListOf<Person2>()
}

//companion object - 자바의 static method 를 대체하는 용도로 사용
//자바에서 static 으로 상수 값을 저장하거나 factory 생성자를 만들던 방식을 동일하게 활용 가능
class Child3(
    private val subName: String,
    familyName: String,
    private val age: Int
) : Parent2(familyName) {
    companion object {
        const val MAX_CHILDREN_COUNT = 4
        fun ofDefaultAge (
            subName: String,
            familyName: String
        ) : Child3 = Child3(subName, familyName, 10)
    }
}


fun main() {
    Family.members.add(Person2("name", 31))
    println(Family.members)
    var ofDefaultAge: Child3 = Child3.ofDefaultAge("Hangyu", "Kim")
    println(Child3.MAX_CHILDREN_COUNT)
    println(ofDefaultAge.familyName)
}