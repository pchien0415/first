package com.jack.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secret = random.nextInt(10) + 1;
        int number = 0;
        while(number != secret){
            System.out.print("Please enter the number:");
            number = scanner.nextInt();
            if(number > secret){
                System.out.println("Lower");
            } else if (number < secret){
                System.out.println("Higher");
            } else {
                System.out.println("anser is " + secret);
            }
        }
    }
}
