package com.company;

import java.io.File;
import java.io.IOException;

public class MyFileCreate {
    public static void main(String[] args) {
        try {
            File my_file=new File("cherryberry.txt");
            if(my_file.createNewFile()) {
                System.out.println("Your text file has been successfully created.");
            } else {
                System.out.println("A file with the same name already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }
}
