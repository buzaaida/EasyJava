package com.company;

public class CoordinateSystem {
    public static void main(String[] args) {
        int height=10;
        int width=20;
        int [][] points={{2,4}, {1, 5}, {6, 6}, {3, 2}, {0, 0}};
        for (int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                boolean point_exists=false;
                for (int k=0; k< points.length; k++) {
                    if (points[k][0]==j && points[k][1]==i) point_exists=true;
                }
                if (point_exists) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }
}
