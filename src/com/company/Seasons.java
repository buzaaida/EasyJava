package com.company;
import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        System.out.println("Please enter 1, 2, 3 or 4: ");
        Scanner scanner=new Scanner(System.in);
        int season;
        season=scanner.nextInt();
        switch (season) {
            case 1:
                System.out.println("Spring! 1st season of the year.");
                break;
            case 2:
                System.out.println("Summer! 2nd season of the year.");
                break;
            case 3:
                System.out.println("Autumn! 3rd season of the year.");
                break;
            case 4:
                System.out.println("Winter! 4th season of the year.");
                break;
            default:
                System.out.println("Wrong input. Try again.");
        }
    }
}
