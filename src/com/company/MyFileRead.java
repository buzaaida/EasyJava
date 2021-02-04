package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFileRead {
    public static void main(String[] args) {
        try {
            File my_file=new File("cherryberry.txt");
            Scanner my_reader=new Scanner(my_file);
            while (my_reader.hasNextLine()) {
                String text=my_reader.nextLine();
                System.out.println(text);
            }
            my_reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }
}
