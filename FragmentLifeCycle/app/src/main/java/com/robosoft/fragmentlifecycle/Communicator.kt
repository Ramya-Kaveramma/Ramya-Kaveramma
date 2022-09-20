package com.robosoft.fragmentlifecycle

interface Communicator {
    fun passDataCom(firstName: String,secondName : String, age: Float, IDNum: Int, salary:Double, relocateSwitch:Boolean)
}