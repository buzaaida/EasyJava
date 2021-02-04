package com.company;
import java.util.Scanner;

public class UserLevel {
    public static void main(String[] args) {
        System.out.println("Please enter your user level: ");
        int lvl;
        Scanner in = new Scanner(System.in);
        lvl=in.nextInt();
        System.out.println("User level is: " + lvl);
        if(lvl == 1 && lvl != 2 && lvl != 4)
            System.out.println("Regular user level: true\nAdmin user level: false\nSuperadmin user level: false");
        if(lvl != 1 && lvl == 2 && lvl != 4)
            System.out.println("Regular user level: false\nAdmin user level: true\nSuperadmin user level: false");
        if(lvl != 1 && lvl != 2 && lvl == 4)
            System.out.println("Regular user level: false\nAdmin user level: false\nSuperadmin user level: true");
    }
}
