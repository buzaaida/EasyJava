package com.company;

import java.util.Arrays;

public class PositiveNegativeArrays {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();
        System.out.println("Enter array elements: ");
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        int[] positive = new int[size];
        int[] negative = new int[size];
        for (int i = 0; i < size; i++) {
            if (a[i]>0 || a[i]==0) {
                positive[i] = a[i];
            } else if (a[i]<0 || a[i]==0) {
                negative[i] = a[i];
            }
        }
        System.out.println("Positive numbers: "+Arrays.toString(positive));
        System.out.println("Negative numbers: "+Arrays.toString(negative));*/

        int[] array={2, -5, 4, 12, 54, -2, -50, 150};
        int counter_p=0;
        int counter_n=0;
        int[] positive=new int[array.length];
        int[] negative=new int[array.length];
        for (int i=0; i<array.length; i++) {
            if (array[i]>0) {
                positive[i]=array[i];
                //counter_p++;
            }
            else if (array[i]<0) {
                negative[i]=array[i];
                //counter_n++;
            }
        }
        System.out.println("Positive numbers: "+ Arrays.toString(positive));
        System.out.println("Positive numbers: "+ Arrays.toString(negative));
    }
}
