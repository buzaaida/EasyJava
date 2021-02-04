package com.company;

import java.util.Arrays;
import java.util.List;

public class ListOfNumbers {
    public static void main(String[] args) throws Exception {
        try {
            List<Double> listOfNumbers = Arrays.asList(23.5, 12345.67, 98.7, 43.456, 12.34, 987.56);
            Double sum= Double.valueOf(0);
            for(Double number:listOfNumbers) {
                sum+=number;
            }
            System.out.println("Sum of numbers from list: "+sum);
        } catch (Exception e) {
            System.out.println("Error!");
            System.err.println(e.getMessage());
        }
    }
}
