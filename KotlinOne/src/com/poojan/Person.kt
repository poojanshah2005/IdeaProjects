package com.poojan

class Person(var Name : String ){
    fun display(){
        println("Display Name: $Name")
    }
    fun displayWithLambda(func: (s:String) -> Unit){
        func(Name)
    }
}