package com.company;
import java.util.Scanner;

public class UserLevel1 {
    public static void main(String[] args) {
        System.out.println("Please enter your user level: ");
        int level;
        Scanner scanner = new Scanner(System.in);
        level = scanner.nextInt();
        System.out.println("Entered user level is: " + level);
        System.out.println("Regular user level: true " + (level == 1));
        System.out.println("Admin user level: true " + (level == 2));
        System.out.println("Superadmin user level: true " + (level == 4));
    }
}
