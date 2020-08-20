package com.jack

fun main() {
    //println("Hello World")
    val h = Human(66.5f, 1.7f)
    h.hello()
    println(h.bmi());
    val score = 88
    val c : Char = 'A'
    println(c.toInt() > 60)
    /*var age = 18
    println(age)*/
}

class Human(var weight : Float, var height : Float, var name : String = "" ){
    fun bmi() : Float{
        val bmi = weight / (height*height)
        return bmi
    }

    fun hello(){
        println("Hello Kotlin")
    }
}