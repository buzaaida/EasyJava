package com.company;

public class MainCard {
    public static void main (String[] args) {
        Card card=new Card(10000);
        card.AccountState();
        card.Charge(5000);
        card.AccountState();
    }
}
