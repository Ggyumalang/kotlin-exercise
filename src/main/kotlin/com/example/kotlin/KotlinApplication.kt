package com.example.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinApplication

fun main(args: Array<String>) {
	runApplication<KotlinApplication>(*args)

//	val person = Person("hi")
//	println(person.name)
//
//	person.name = "changed"
//	println(person.name)

	val rectangle = Rectangle(10,20)
	println(rectangle.isSquare)

	val rectangle2 = Rectangle(20,20)
	println(rectangle2.isSquare)
}
