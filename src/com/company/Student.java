package com.company;

public class Student extends Person {
    int indexNum;
    public Student(String firstName, String lastName, int indexNum) {
        super(firstName, lastName);
        this.indexNum=indexNum;
    }
    @Override
    public void show() {
        System.out.println("student: " + firstName + " " + lastName + ", index number: " + indexNum);
        //super.show();
        //System.out.println(indexNum);
    }
}
