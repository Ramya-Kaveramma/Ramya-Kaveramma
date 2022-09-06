package com.robosoft.bankaccount

open class BankAccountMain(val accountNumber: String, val accountName: String) {
    var balance: Double = 0.0

    fun withdrawMoney(amount: Double): Boolean{
        if(amount > balance){
            return false
        }else{
            balance -= amount
            return true
        }
    }
}
