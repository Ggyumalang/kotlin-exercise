package com.example.kotlin
open class Parent2 (
    val familyName: String
)

class Child2 : Parent2 {
    private val subName: String

    constructor(subName: String, familyName: String) : super(familyName) {
        this.subName = subName
    }

    constructor(subName: String) : this(subName, "")
}