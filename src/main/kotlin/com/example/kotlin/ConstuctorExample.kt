package com.example.kotlin

//생성자 버전 1 - 모두 풀어쓴 것
//class User constructor(_userName: String) {
//    val userName: String
//    init {
//        userName = _userName
//    }
//}

//생성자 버전 2 - 1차 간소화
//class User constructor(_userName: String) {
//    val userName: String = _userName
//}

//생성자 버전 3 - 최종 간소화 : 가장 많이 쓰이는 형태
//class User(val userName: String)

//val userName = User("Zero").userName

//Data 클래스 - 초기값 설정
data class User (
    val userName: String = "basic",
    val level: Int = 1
)

//클래스 상속 시 베이스 클래스 생성자 호출 방법
open class Parent (
    val familyName: String = "Name"
)
// 확장하는 클래스의 생성자를 호출해주어야 합니다.
class Child (
    val subName: String,
    familyName: String
) : Parent(familyName)
fun main() {
    println(User("Hello"))
    println(User("Hi", 10))
    println(User())
    println(Child("한규", "김").familyName)
}