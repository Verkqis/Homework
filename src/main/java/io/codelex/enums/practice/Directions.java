package io.codelex.enums.practice;

import java.util.Scanner;

public class Directions {

    public enum Compass {

        NORTH("up"),
        SOUTH("down"),
        EAST("right"),
        WEST("left");

        private final String name;

        Compass(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter direction you want to be printed! ");
        System.out.println("up for North, down for South, right for East, left for West! ");
        String directions = in.next();

        switch (directions) {
            case "up" -> System.out.println(Compass.NORTH + ":" + Compass.NORTH.name + ":" + Compass.NORTH.ordinal());
            case "down" -> System.out.println(Compass.SOUTH + ":" + Compass.SOUTH.name + ":" + Compass.SOUTH.ordinal());
            case "right" -> System.out.println(Compass.EAST + ":" + Compass.EAST.name + ":" + Compass.EAST.ordinal());
            case "left" -> System.out.println(Compass.WEST + ":" + Compass.WEST.name + ":" + Compass.WEST.ordinal());
            default -> System.out.println("It is not direction! ");
        }


        System.out.println(Compass.NORTH + ":" + Compass.NORTH.name + ":" + Compass.NORTH.ordinal());
        System.out.println(Compass.SOUTH + ":" + Compass.SOUTH.name + ":" + Compass.SOUTH.ordinal());
        System.out.println(Compass.EAST + ":" + Compass.EAST.name + ":" + Compass.EAST.ordinal());
        System.out.println(Compass.WEST + ":" + Compass.WEST.name + ":" + Compass.WEST.ordinal());

    }


}
