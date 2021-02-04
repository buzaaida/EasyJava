package com.company;

public class Card {
    double balance;
    public Card(double balance) {
        this.balance=balance;
    }
    public void Charge(double bill) {
        if (balance<bill) {
            System.out.println("Not enough money in account. Transaction denied.");
        } else {
            balance-=bill;
            System.out.println("Transaction successful.");
        }
    }
    public void AccountState() {
        System.out.println("Account state: "+this.balance);
    }
}
