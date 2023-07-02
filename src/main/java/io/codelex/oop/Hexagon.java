package io.codelex.oop;

class Hexagon extends Shape {
    private double side;

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    double calculatePerimeter() {
        return 6 * side;
    }

    @Override
    double calculateArea() {
        return (3 * Math.sqrt(3) * side * side) / 2;
    }
}
