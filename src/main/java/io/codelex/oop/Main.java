package io.codelex.oop;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Triangle Area: " + triangle.calculateArea());

        Hexagon hexagon = new Hexagon(6);
        System.out.println("Hexagon Perimeter: " + hexagon.calculatePerimeter());
        System.out.println("Hexagon Area: " + hexagon.calculateArea());

    }
}
