package com.jack.kotlin

import java.util.*

fun main() {
    //userInput()
    val stu = Student("Jack", 77, 99)
    stu.print()
    println("Highest score : ${stu.highest()}")
}


class Student(var name : String, var english : Int, var math : Int){
    fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    fun passOrFailed() = if(getAverage() >= 60) "Pass" else "Failed"

    fun grading() = when(getAverage()){
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
    }

    fun getAverage() =  (english+math) / 2

    fun highest() = if(english > math){
        println("English")
        english
    } else {
        println("Math")
        math
    }
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter your name:")
    var name = scanner.next()
    print("Please enter your english:")
    var english = scanner.nextInt()
    print("Please enter your name:")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
}

