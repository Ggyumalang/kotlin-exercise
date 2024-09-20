package com.example.kotlin

interface Clickable {
    fun click()
}

class Button: Clickable {
    override fun click() {
        println("Button is clicked.")
    }
}

fun main() {
    Button().click()
    RichButton().click()
    RButton().click()
}

//오픈 클래스 : 상속 가능
open class RichButton : Clickable {
    
    // final method : 오버라이드 불가
    fun disable() {}
    
    //open method : 오버라이드 가능
    open fun animate() {}
    
    //오버라이드 메서드 : 오버라이드 가능
    override fun click() {
        println("RichButton이다 이거야 !!")
    }
}

class RButton : RichButton() {
    override fun animate() {
        println("상속메서드다 이거야 !!")
    }

    override fun click() {
        println("RButton 이다 이거야!!")
    }
}