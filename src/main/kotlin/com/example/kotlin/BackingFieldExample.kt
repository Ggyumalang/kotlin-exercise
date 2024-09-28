//Backing field 실습 - getter/setter customizing!
package com.example.kotlin

class Account {
    var balance: Long = 0
//        set(value) {
//            if (value < 0) throw IllegalStateException("잔액은 0원 이상만 가능합니다.")
//            field = value
//        }
        //private set 을 이용해 setter 감추기
        private set

    fun increaseBalance(value: Int) {
        if(this.balance + value > 1_000_000) throw IllegalStateException("Balance cannot be over 1,000,000 won")
        this.balance += value
    }

    fun decreaseBalance(value: Int) {
        if(this.balance - value < 0) throw IllegalStateException("Balance cannot be under zero")
        this.balance -= value
    }

    var accountName: String = ""
        get() = "계좌이름:$field"
}

fun main() {
    val account = Account()
//    account.balance = 100
    account.increaseBalance(100)
    account.accountName = "급여계좌"

    println(account.accountName)
    println(account.balance)

    account.decreaseBalance(50)
    println(account.balance)

//    account.decreaseBalance(100)
//    println(account.balance)

//    account.balance = -1

    account.increaseBalance(1_000_000)
}