package com.company;

import java.util.Arrays;

public class AddArrays {
    public static void main(String[] args) {
        int[] a1={1, 2, 3, 4};
        int[] a2={5, 6, 7, 8};
        int[] a3=new int[4];
        for (int i=0; i<4; i++) {
            a3[i]=a1[i]+a2[i];
        }
        System.out.println(Arrays.toString(a3));
    }
}
