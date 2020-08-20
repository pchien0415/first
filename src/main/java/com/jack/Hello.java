package com.jack;

public class Hello {
    public static void main(String[] args) {
        //System.out.println("Hello world");
        Person p = new Person(66.5f, 1.7f);
        p.hello();
        System.out.println(p.bmi());
        /*int age = 59;
        System.out.println(age);*/
    }
}
