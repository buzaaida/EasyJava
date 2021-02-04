package com.company;

public class Professor extends Person {
    String className;
    public Professor(String firstName, String lastName, String className) {
        super(firstName, lastName);
        this.className=className;
    }
    @Override
    public void show() {
        System.out.println("professor: " + firstName + " " + lastName + ", department: " + className);
    }
}
