package com.company;

import java.util.ArrayList;
import java.util.List;

public class MainPointBounds {
    public static void main(String[] args) {
        Point point1=new Point(5, 5);
        Point point2=new Point(1, 11);
        Point point3=new Point(25, 12);
        Point point4=new Point(9, 5);
        Point point5=new Point(16, 5);
        Point point6=new Point(22, 9);
        Point point7=new Point(28, 3);
        Point point8=new Point(4, 9);
        Point point9=new Point(4, 8);
        Point point10=new Point(25, 3);
        List<Point> points=new ArrayList<Point>();
        points.add(point5);
        points.add(point6);
        points.add(point7);
        points.add(point8);
        points.add(point9);
        Bounds bounds=new Bounds(10, 10, 50.5, 50.5);
        for (int i=0; i<points.size(); i++) {
            if (points.get(i).x<=bounds.x && points.get(i).y<=bounds.y) {
                System.out.println(points.get(i).x+", "+points.get(i).y);
            }
        }
    }
}
