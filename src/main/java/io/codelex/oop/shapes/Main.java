package io.codelex.oop.shapes;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(50, 50);
        System.out.println("Rectangle have " + rectangle.numSides + " sides.");
        System.out.println("Rectangle have width: " + rectangle.getWidth() +
                " and height : " + rectangle.getWidth() + ".");
        System.out.println("Rectangles area is: " + rectangle.getArea() + ".");
        System.out.println("Rectangles perimeter is: " + rectangle.getPerimeter() + ".\n");


        Triangle triangle = new Triangle(50, 50);
        System.out.println("Triangle have " + triangle.numSides + " sides.");
        System.out.println("Triangle have width: " + triangle.getWidth() +
                " and height : " + triangle.getWidth() + ".");
        System.out.println("Triangle area is: " + triangle.getArea() + ".");
        System.out.println("Triangle perimeter is: " + triangle.getPerimeter() + ".");

    }
}
