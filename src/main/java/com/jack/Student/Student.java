package com.jack.Student;

public class Student {
    String name;
    String id;
    int english;
    int math;


    public Student(String name, int math, int english) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public void print(){
        System.out.println(name + "\t" + english + "\t" +
                math + "\t" + (math + english) / 2);
    }
}
