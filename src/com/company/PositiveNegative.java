package com.company;

import java.util.ArrayList;

public class PositiveNegative {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<Integer>();
        ArrayList<Integer>positive=new ArrayList<Integer>();
        ArrayList<Integer>negative=new ArrayList<Integer>();
        numbers.add(9);
        numbers.add(6);
        numbers.add(-5);
        numbers.add(-7);
        numbers.add(-4);
        numbers.add(4);
        numbers.add(-8);
        for (int i=0; i<numbers.size(); i++) {
            if (numbers.get(i)!=0 && numbers.get(i)>0) positive.add(numbers.get(i));
            if (numbers.get(i)!=0 && numbers.get(i)<0) negative.add(numbers.get(i));
        }
        System.out.println("Array of random numbers: "+numbers);
        System.out.println("Positive numbers: "+positive);
        System.out.println("Negative numbers: "+negative);
    }
}
