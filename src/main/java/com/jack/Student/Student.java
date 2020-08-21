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

    public int highest(){
        return (english > math) ? english : math;
    }

    public void print(){
        System.out.print(name + "\t" + english + "\t" +
                math + "\t" + getAverage());
        if(getAverage() >= 60){
            System.out.println("\tPass");
        } else {
            System.out.println("\tFailed");
        }
    }

    public int getAverage(){
        return (math + english) / 2;
    }
}
