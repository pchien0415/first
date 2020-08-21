package com.jack.Student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        //userInput();
        Student stu = new Student("jack", 77, 99);
        stu.print();
        System.out.println(stu.highest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name:");
        String name = scanner.next();
        System.out.print("Please enter your english:");
        int english = scanner.nextInt();
        System.out.print("Please enter your math:");
        int math = scanner.nextInt();
        Student stu = new Student(name, english, math);
        stu.print();
        System.out.println(stu.highest());
    }
}
