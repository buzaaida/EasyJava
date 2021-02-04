package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        while (true) {
            int guess=random.nextInt(5);
            System.out.println("Guess the number: ");
            int number=scanner.nextInt();
            while (true) {
                if (number==guess) {
                    System.out.println("Congrats"); break;
                } else {
                    System.out.println("Wrong number!"); break;
                }
            }
        }
    }
}
