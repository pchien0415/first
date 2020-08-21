package com.jack.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        int secret = new Random().nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        for(int i=1; i<=4; i++){
            System.out.print("Please enter number : ");
            int number = scanner.nextInt();
            System.out.println("第" + i + "次 : " + number);
            if(number < secret){
                System.out.println("Higher");
            } else if (number > secret){
                System.out.println("Lower");
            } else {
                System.out.println("RIGHT");
            }
        }
    }
}
