package com.jack

fun main() {
    //println("Hello World")
    val h = Human()
    h.hello()
    var age = 18
    println(age)
}

class Human(){
    fun hello(){
        println("Hello Kotlin")
    }
}