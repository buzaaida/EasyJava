package com.company;

public class Sum100 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=0; i<=100; i++) {
            sum+=i;
        }
        System.out.println("Sum of first hundred integers is: "+sum);
    }
}
