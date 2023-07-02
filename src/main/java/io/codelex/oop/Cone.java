package io.codelex.oop;

public class Cone extends ThreeDimensionalShape {


    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calculatePerimeter() {
        return 0;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

    @Override
    double calculateVolume() {
        return (Math.PI * radius * radius * height) / 3;

    }

    public static void main(String[] args) {
        Cone cone = new Cone(3, 4);
        System.out.println("Cone Surface Area: " + cone.calculateArea());
        System.out.println("Cone Volume: " + cone.calculateVolume());

    }
}
