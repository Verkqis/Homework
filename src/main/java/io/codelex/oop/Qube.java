package io.codelex.oop;

public class Qube extends ThreeDimensionalShape {
    private double side;

    public Qube(double side) {
        this.side = side;
    }

    @Override
    double calculatePerimeter() {
        return 0;
    }

    @Override
    double calculateArea() {
        return 6 * side * side;
    }

    @Override
    double calculateVolume() {
        return side * side * side;
    }

    public static void main(String[] args) {
        Qube qube = new Qube(5);
        System.out.println("Cube Surface Area: " + qube.calculateArea());
        System.out.println("Cube Volume: " + qube.calculateVolume());
    }
}
