package io.codelex.classesandobjects.practice;

import java.awt.*;

public class Swap {
    public static void main(String[] args) {

        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);
        swapPoints(p1, p2);
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");


    }


    public static void swapPoints(Point par1, Point par2) {
        int pointP1X = par1.x;
        int pointP1Y = par1.y;
        int pointP2X = par2.x;
        int pointP2Y = par2.y;

        par1.x = pointP1Y;
        par1.y = pointP1X;
        par2.x = pointP2Y;
        par2.y = pointP2X;
    }

}
