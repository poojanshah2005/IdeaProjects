@file:JvmName("DisplayFunctions")

package com.poojanshah

fun main(args: Array<String>){
    Log(message = "Hello World from Kotlin!" , logLevel = 2)
    Log(message = "Hello World from Kotlin!")
}

fun display(message: String):Boolean{
    println(message)
    return true
}
@JvmOverloads
fun Log(message: String, logLevel: Int = 1){
    println(message + logLevel)
}