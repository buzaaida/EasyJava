package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileWrite {
    public static void main(String[] args) {
        try {
            FileWriter my_writer=new FileWriter("cherryberry.txt");
            my_writer.write("We love CherryBerry lemonade!");
            my_writer.close();
            System.out.println("Successful input to text file.");
        } catch (IOException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }
}
