package com.jack.kotlin

fun main() {
    val stu = Student("Jack", 60, 80)
    stu.print()
}

class Student(var name : String, var english : Int, var math : Int){
    fun print(){
        println(name + "\t" + english + "/t" + math + "/t" + (english+math) / 2)
    }
}