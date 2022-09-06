package com.robosoft.bankaccount

data class AcntMnger(
    val AccountName: String,
    val AccountNumber: String,
    var InitialAmount: Double,
    val AccountType: String? = null
)

fun main( ) {
    var BnkAcct_1 = AcntMnger("Person_1", "0000012345650", 75000.00, "Savings")

    var BnkAcct_2 = AcntMnger("Person_2", "0000012345651", 65000.00, "Current")

    var BnkAcct_3 = AcntMnger("Person_3", "0000012345652", 80000.00, "recurring")

    var BnkAcct_4 = AcntMnger("Person_3", "0000012345652", 78541.00, "fixed")

    var BnkAcct_5 = AcntMnger("Person_3", "0000012345652", 98563.00, "recurring")

    var BnkAcct_6 = AcntMnger("Person_3", "0000012345652", 87412.00, "homr")

    var BnkAcct_7 = AcntMnger("Person_3", "0000012345652", 32541.00, "vehicle")

    var BnkAcct_8 = AcntMnger("Person_3", "0000012345652", 65844.00, "personal")
    
    balance(BnkAcct_1)
    deposit(BnkAcct_1)
    withdrawal(BnkAcct_1)
}


fun deposit(BnkAcct_1: AcntMnger) {
    print("Enter the deposit amount:")
    BnkAcct_1.InitialAmount += readLine()!!.toDouble()
    print("Balance after deposit is:")
    println(BnkAcct_1.InitialAmount)
}

fun withdrawal(BnkAcct_1: AcntMnger) {
    if(BnkAcct_1.AccountType == "Savings" || BnkAcct_1.AccountType == "Current"){
        print("Enter the withdrawal amount:")
        BnkAcct_1.InitialAmount -= readLine()!!.toDouble()
        print("Balance after withdrawal is:")
        println(BnkAcct_1.InitialAmount)
    }
}

fun balance(BnkAcct_1: AcntMnger) {
    val interest = 0.0005
    if(BnkAcct_1.AccountType == "Fixed" || BnkAcct_1.AccountType == "Recurring")
        println("Account balance of ${BnkAcct_1.AccountNumber} is ${BnkAcct_1.InitialAmount + interest * 2}")
    else println("Account balance of ${BnkAcct_1.AccountName} is ${BnkAcct_1.InitialAmount * (BnkAcct_1.InitialAmount * interest) / 365}")
}
