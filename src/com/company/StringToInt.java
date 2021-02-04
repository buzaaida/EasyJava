package com.company;
import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        String s1, s2;
        Scanner scanner=new Scanner(System.in);
        s1=scanner.next();
        s2=scanner.next();
        int i1, i2;
        i1=Integer.parseInt(s1);
        i2=Integer.parseInt(s2);
        System.out.println("Sum of entered numbers: "+(i1+i2));
    }
}
