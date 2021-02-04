package com.company;

import java.util.Random;

public class SlotMachine {
    public static void main(String[] args) {
        String[] random={"Cherry", "Heart", "Joker", "Dollar", "Champagne"};
        Random r=new Random();
        System.out.println("Combo: "+random[r.nextInt(5)]+
                " "+random[r.nextInt(5)]+
                " "+random[r.nextInt(5)]+
                " "+random[r.nextInt(5)]+
                " "+random[r.nextInt(5)]);
    }
}
